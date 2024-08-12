class BookProduct extends Product {
    private String author;
    private String genre;

    public BookProduct(String name, double price, String author, String genre) {
        super(name, price);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Book: " + name + ", Author: " + author + ", Genre: " + genre + ", Price: $" + price;
    }
}
