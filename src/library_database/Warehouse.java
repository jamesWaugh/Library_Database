package Library_Database;

public class Warehouse extends ItemStorage {

    public InventoryItem buy(int index) {
        if (index >= 10) {
            return null;
        } else if (index < 10 && array[index].getHowMany() > 1) {
            array[index].setHowMany(array[index].getHowMany() - 1);
            return array[index].clone();

        } else if (index < 10 && array[index].getHowMany() == 1) {
            array[index].setHowMany(array[index].getHowMany() - 1);
            if (this.getFirst() > 0) {
                this.setFirst(this.getFirst() - 1);
            }
            return array[index];
        }
        return null;
    }
}
