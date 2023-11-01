package solid.l;

public class LiskovPrinciple {

    public static class MenuItem {
        private double price;
        private String name;
        private String description;

        public MenuItem(double price, String name, String description) {
            this.price = price;
            this.name = name;

            this.description = description;
        }

        public double getPrice() {
            return price;
        }


    }

    public static class BeverageItem extends MenuItem {

        public BeverageItem(double price, String name, String description) {
            super(price, name, description);
        }

        double getPriceWithDiscount(double discountPercentage) {
            return this.getPrice() - (discountPercentage * 0.01 * this.getPrice());
        }

    }
}
