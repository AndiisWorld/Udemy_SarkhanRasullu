package ders1_2;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ilk ededi daxil edin");
        int a = sc.nextInt();
        System.out.println("2ci ededi daxil edin");
        int b = sc.nextInt();
        System.out.println("Emeliyyati daxil edin");
        int c = sc.nextInt();

        if (c == 1) {
            System.out.println("emeliyyat 1 e beraberdir");
            double netice = a + b;
            System.out.println(netice);

        }
        boolean bb = true;
        System.out.println(bb);
        bb = !bb;
        System.out.println(bb);

        //else hali // ternar operatoru
        int netice = (a != b) ? a + b : a - b;
        System.out.println(netice + 5);

        //if den sonraki ilk setir if e aiddir onnan sonraki ise her zaman cap edilir eger { } varsa
    }
}
