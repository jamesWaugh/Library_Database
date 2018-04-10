package Library_Database;

import java.util.Scanner;

public class Harness {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Warehouse x = new Warehouse();
        Book one = new Book();
        Book two = new Book();
        MusicCD three = new MusicCD();
        MusicCD four = new MusicCD();
        Novel five = new Novel();
        Novel six = new Novel();
        TextBook seven = new TextBook();
        TextBook eight = new TextBook();
        Book nine = new Book();
        Book ten = new Book();
        x.add(one);
        x.add(two);
        x.add(three);
        x.add(four);
        x.add(five);
        x.add(six);
        x.add(seven);
        x.add(eight);
        x.add(nine);
        x.add(ten);
        Cart v = new Cart();
        int sentinel = 1;
        while (sentinel == 1) {
            System.out.println(x);
            System.out.println("1) buy a new item\n2) view cart\n3) preview items\n4) check out");
            int y = scan.nextInt();
            if (y == 1) {
                System.out.println("Enter number of item");
                v.add(x.buy(scan.nextInt()));
            } else if (y == 2) {
                System.out.println("Cart: \n" + v);
            } else if (y == 3) {
                System.out.println("Preview Items: ");
                v.viewAll();
                System.out.println("");
            } else if (y == 4) {
                System.out.println(v.totalPrice());
                System.out.println("Confirm buy, yes or no");
                String c = scan.next();
                if (c.equals("yes")) {
                    System.out.println("Credit card charged");
                    sentinel = 0;
                }
            }
        }
    }
}
