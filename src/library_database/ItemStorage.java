package Library_Database;

import java.util.Scanner;

public class ItemStorage {

    protected InventoryItem[] array;
    private int firstEmptySpace;

    public int getFirst() {
        return firstEmptySpace;
    }

    public void setFirst(int temp) {
        firstEmptySpace = temp;
    }

    public InventoryItem[] getArray() {
        return array;
    }

    public void setArray(InventoryItem[] newArray) {
        array = newArray;
    }

    public ItemStorage() {
        array = new InventoryItem[10];
        firstEmptySpace = 0;
    }

    public boolean add(InventoryItem newitem) {
        if (firstEmptySpace == 10) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (newitem == array[i]) {
                array[i].setHowMany(array[i].getHowMany() + newitem.getHowMany());
                return true;
            } else if (array[i] == null) {
                array[i] = newitem;
                firstEmptySpace++;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String list = "";
        for (int l = 0; l < array.length; l++) {
            list += ((l + 1) + ". " + array[l] + "\n");
        }
        return list;
    }

    @Override
    public boolean equals(Object temp) {
        if (temp != null && temp instanceof ItemStorage) {
            ItemStorage inM = (ItemStorage) temp;
            return this.equals(temp);
        }
        return false;
    }

    public void viewItem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter item number:");
        int temp = scan.nextInt();
        while (temp >= 10) {
            System.out.println("Error, number out of bounds. Enter item number:");
            temp = scan.nextInt();
        }
        array[temp].view();
    }
}
