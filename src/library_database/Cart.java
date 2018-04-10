package Library_Database;

public class Cart extends ItemStorage {

    public int totalPrice() {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp += array[i].getPrice();
        }
        return temp;
    }

    public String toString() {
        String list = "";
        for (int l = 0; l < array.length; l++) {
            list += ((l + 1) + ". " + array[l] + "\n");
        }

        double temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                temp += array[i].getPrice();
            }
        }
        System.out.println("Total Price: " + temp);

        return list;

    }

    public void viewAll() {
        for (int y = 0; y < array.length; y++) {
            if (array[y] != null) {
                array[y].view();
                System.out.println("");
            }
        }
    }
}
