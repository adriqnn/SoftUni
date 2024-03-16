package mlm.models;

import java.util.HashSet;
import java.util.Set;

public class Seller {
    public String id;
    public int earnings;
    public Seller parent;
    public Set<Seller> children;
    public int salesCount;

    public Seller(String id) {
        this.id = id;
        earnings = 0;
        this.parent = null;
        this.children = new HashSet<>();
        this.salesCount = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEarnings() {
        return earnings;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }

    public Seller getParent() {
        return parent;
    }

    public void setParent(Seller parent) {
        this.parent = parent;
    }

    public Set<Seller> getChildren() {
        return children;
    }

    public void setChildren(Set<Seller> children) {
        this.children = children;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(int salesCount) {
        this.salesCount = salesCount;
    }
}
