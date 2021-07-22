package task12;

public class Basket {
    private Product[] basket;

    public Basket() {
    }

    public Basket(Product[] basket) {
        this.basket = basket;
    }

    public Product[] getBasket() {
        return basket;
    }

    public void setBasket(Product[] basket) {
        this.basket = basket;
    }

    public String getInfo() {
        String S = "";
        if (basket != null) {
            for (Product good : basket) {
                S = S + good.getInfo() + '\n';
            }
        }
        return S;
    }


    public Product[] addPurchase(int num) {
        Product[] array;
        array = this.basket;

        double sumLeft = 0;
        for (Product p : this.basket) {
            sumLeft = sumLeft + p.getPrice();
        }
        sumLeft = Terminal.getUser().getMoney() - sumLeft;

        Product product = new Product();

        for (Product p : Terminal.getProductService().getProducts()) {
            if (p.getProductNumber() == num) product = p;
        }

        if (product.getPrice() > sumLeft) {
            System.out.println("You don't have enough money. Add " + (product.getPrice() - sumLeft) + "$ or choose something else from the list of products: ");
            Terminal.getProductService().cheaperProducts(product);
        } else {
            Product[] arrayNew = new Product[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                arrayNew[i] = array[i];
            }
            arrayNew[array.length] = product;

            array = arrayNew;

            System.out.println("Done!");

        }
        return array;
    }

    public Product[] deletePurchase(int num) { //number
        Product[] array = basket;

        Product[] arrayNew = new Product[array.length - 1];

        Product product = new Product();
        for (Product p : Terminal.getProductService().getProducts()) {
            if (p.getProductNumber() == num) product = p;
        }

        int j = 0;
        int i = 0;
        int countDel = 0;

        while (i < array.length) {
            if (array[i] == product & countDel == 0) {
                i++;
                countDel = countDel + 1;
            }
            arrayNew[j] = array[i];
            i++;
            j++;
        }

        array = arrayNew;

        return array;
    }
}
