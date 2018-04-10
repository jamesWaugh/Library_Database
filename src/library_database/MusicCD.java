package Library_Database;

public class MusicCD extends InventoryItem {

    protected String performer;

    public String getPerformer() {
        return performer;
    }

    public void setAuthor(String perfval) {
        performer = perfval;
    }

    public MusicCD() {
        performer = "Ayn Rand";
        desc = "Atlas Plays Guitar";
        price = 10.0;
        howMany = 1;
    }

    public MusicCD(String perfval, String descval, double priceval) {
        performer = perfval;
        desc = descval;
        price = priceval;
    }

    public MusicCD(MusicCD temp) {
        this.desc = temp.desc;
        this.price = temp.price;

    }

    public MusicCD clone() {
        return new MusicCD(this);

    }

    @Override
    public void view() {
        System.out.println("\"Now Playing Sample: " + this.getDesc() + "\"");
    }

    @Override
    public double getPrice() {
        return price * 1.001;
    }

    @Override
    public String toString() {
        return "\"CD: " + this.performer + ": " + this.desc + ": ($" + this.price + ")\"\n";
    }

    @Override
    public boolean equals(Object temp) {
        if (temp != null && temp instanceof Book) {
            Book inM = (Book) temp;
            return super.equals(temp) && inM.getAuthor().equals(getPerformer());
        }
        return false;
    }
}
