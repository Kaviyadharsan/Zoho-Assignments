class ClothingProduct extends Product {
    private String size;
    private String color;

    public ClothingProduct(String name, double price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Clothing: " + name + ", Size: " + size + ", Color: " + color + ", Price: $" + price;
    }
}

