package Library_Database;

public class Book extends InventoryItem {

    protected String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String authorval) {
        author = authorval;
    }

    public Book() {
        author = "Ayn Rand";
        desc = "Atlas Gestured Nonchalantly";
        price = 10.0;
        howMany = 1;
    }

    public Book(String authorval, String descval, double priceval) {
        author = authorval;
        desc = descval;
        price = priceval;
    }

    public Book(Book temp) {
        this.desc = temp.desc;
        this.price = temp.price;

    }

    public Book clone() {
        return new Book(this);

    }

    @Override
    public double getPrice() {
        return price * 1.05;
    }

    @Override
    public void view() {
        System.out.println("\"Opening Book Exerpt: " + this.getDesc() + "\"");
    }

    @Override
    public String toString() {
        return "\"Book: " + this.desc + " by " + this.author + " ($" + this.price + ")\"\n";
    }

    @Override
    public boolean equals(Object temp) {
        if (temp != null && temp instanceof Book) {
            Book inM = (Book) temp;
            return super.equals(temp) && inM.getAuthor().equals(getAuthor());
        }
        return false;
    }
}
