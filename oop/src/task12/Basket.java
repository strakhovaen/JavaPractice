package task12;

public class Basket {
    private Product[] purchase;

    public Basket() {
    }

    public Basket(Product[] purchase) {
        this.purchase = purchase;
    }

    public Product[] getPurchase() {
        return purchase;
    }

    public void setPurchase(Product[] purchase) {
        this.purchase = purchase;
    }

    public String getInfo() {
        String S = "";
        if (purchase != null) {
            for (Product good : purchase) {
                S = S + good.getInfo() + '\n';
            }
        }
        return S;
    }


}
