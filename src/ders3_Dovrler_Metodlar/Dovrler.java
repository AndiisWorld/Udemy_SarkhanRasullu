package ders3_Dovrler_Metodlar;

import java.util.Scanner;

public class Dovrler {
    public static void main(String[] args) {
        int i = 0;
        for (; i < 10; i++) {
            //teyin edirem;sert yoxluyuram;icra edirem
            //o++ erine istediyimizi yaza bilerik meselen sout("Amil") ve s kimi
            // for un icerisine girennen sonra en sonda ; olan hisseni icra edir
            System.out.println(i + "=Salam");
        }
        System.out.println("Son");

        for (int j = 0; j < 4; System.out.println(j + "=Ali")) {
            j++;

        }

        //task1
        //**********
        //**********
        //**********
        //**********
        //**********
        System.out.println("");

        for (int k = 0; k < 5; k++) {//5setir
            for (int l = 0; l < 10; l++) {//10ulduz
                System.out.print("*");
            }
            System.out.println("");

        }

        System.out.println("");

        //2
        /*
         *
         **
         ***
         ****
         *****
         ******
         *******
         */
        for (int j = 1; j < 8; j++) {//8setir
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        System.out.println("");

        //3
        /*
         *
         **
         ***
         ****
         */
        for (int j = 1; j < 8; j++) {//8setir
            for (int k = 0; k < 7 - j; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }

            System.out.println("");

        }
        System.out.println("");

        /*
        = = =  = = =
        = = =  = = =
        = = =  = = =
        = = =  = = =


         */
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 6; k++) {
                System.out.print("=");
                if (k != 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");

            //1ci for setirlerin sayini
            //2ci for sutunlarin sayini bildirir
        }


        //58-ci dk ya  qeder
    }
}
