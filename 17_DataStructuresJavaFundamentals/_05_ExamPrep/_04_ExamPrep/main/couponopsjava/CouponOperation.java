package couponopsjava;

import java.util.*;
import java.util.stream.Collectors;


public class CouponOperation implements ICouponOperation {
    private Map<String, Website> websites;
    private Map<String, Coupon> coupons;

    public CouponOperation() {
        this.websites = new LinkedHashMap<>();
        this.coupons = new LinkedHashMap<>();
    }

    public void registerSite(Website w) {
        if(exist(w)){
            throw new IllegalArgumentException();
        }

        this.websites.putIfAbsent(w.domain, w);
    }

    public void addCoupon(Website w, Coupon c) {
        if(!exist(w) || exist(c)){
            throw new IllegalArgumentException();
        }

        c.setWebsiteObj(w);
        this.coupons.putIfAbsent(c.code, c);
        this.websites.get(w.domain).getCoupons().add(c);
    }

    public Website removeWebsite(String domain) {
        if(!this.websites.containsKey(domain)){
            throw new IllegalArgumentException();
        }

        this.websites.get(domain).getCoupons().forEach(e -> this.coupons.remove(e.code));
        return this.websites.remove(domain);
    }

    public Coupon removeCoupon(String code) {
        if(!this.coupons.containsKey(code)){
            throw new IllegalArgumentException();
        }

        Coupon coupon = this.coupons.get(code);
        Website websiteObj = coupon.getWebsiteObj();
        this.websites.get(websiteObj.domain).getCoupons().remove(coupon);
        return this.coupons.remove(code);
    }

    public boolean exist(Website w) {
        return this.websites.containsKey(w.domain);
    }

    public boolean exist(Coupon c) {
        return this.coupons.containsKey(c.code);
    }

    public Collection<Website> getSites() {
        return this.websites.values();
    }

    public Collection<Coupon> getCouponsForWebsite(Website w) {
        if(!exist(w)){
            throw new IllegalArgumentException();
        }

        return this.websites.get(w.domain).getCoupons();
    }

    public void useCoupon(Website w, Coupon c) {
        if(!exist(w) || !exist(c)){
            throw new IllegalArgumentException();
        }

        if(!this.websites.get(w.domain).getCoupons().contains(c)){
            throw new IllegalArgumentException();
        }

        this.websites.get(w.domain).getCoupons().remove(c);
        this.coupons.remove(c.code);
    }

    public Collection<Coupon> getCouponsOrderedByValidityDescAndDiscountPercentageDesc() {
//        Comparator<Coupon> comparator = Comparator.comparingInt(Coupon::getValidity).thenComparingInt(Coupon::getDiscountPercentage).reversed();
//        return this.coupons.values()
//                .stream()
//                .sorted(comparator)
//                .collect(Collectors.toList());
        return this.coupons.values().stream().sorted(Comparator.comparing(Coupon::getValidity).thenComparing(Coupon::getDiscountPercentage).reversed()).collect(Collectors.toList());
    }

    public Collection<Website> getWebsitesOrderedByUserCountAndCouponsCountDesc() {
        return this.websites.values().stream().sorted((w1, w2) -> {
            int result = Integer.compare(w1.getUsersCount(), w2.getUsersCount());

            if(result == 0){
                result = Integer.compare(w2.getCoupons().size(), w1.getCoupons().size());
            }

            return result;
        }).collect(Collectors.toList());
    }
}
