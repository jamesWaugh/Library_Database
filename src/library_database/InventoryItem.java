package Library_Database;

public class InventoryItem {

    protected String desc;
    protected double price;
    protected int howMany;

    public InventoryItem() {
        desc = "baked goods";
        price = 2.50;
        howMany = 1;
    }

    public InventoryItem(String descval, double priceval) {
        desc = descval;
        price = priceval;

    }

    public InventoryItem(InventoryItem temp) {
        this.desc = temp.desc;
        this.price = temp.price;

    }

    public InventoryItem clone() {
        return new InventoryItem(this);

    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String descval) {
        desc = descval;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double priceval) {
        price = priceval;
    }

    public int getHowMany() {
        return howMany;
    }

    public void setHowMany(int howManyval) {
        howMany = howManyval;
    }

    public boolean equals(Object temp) {
        if (temp != null && temp instanceof InventoryItem) {
            InventoryItem inM = (InventoryItem) temp;
            return inM.getPrice() == getPrice() && inM.getDesc().equals(getDesc());
        }
        return false;
    }

    public void view() {
        System.out.println("\"Viewing: " + this.getDesc() + "\"");
    }

    @Override
    public String toString() {
        return "\"" + this.desc + " ($" + this.price + ")\"";
    }
}
