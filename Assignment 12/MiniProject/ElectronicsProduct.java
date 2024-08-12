class ElectronicsProduct extends Product {
    private String brand;
    private String model;

    public ElectronicsProduct(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + name + ", Brand: " + brand + ", Model: " + model + ", Price: $" + price;
    }
}
