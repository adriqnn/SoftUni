package shopAndGoods;

public class Goods {
    private String name;
    private String goodsCode;

    public Goods(String name, String goodsCode) {
        this.setName(name);
        this.setGoodsCode(goodsCode);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getGoodsCode() {
        return this.goodsCode;
    }

    private void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }
}
