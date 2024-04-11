package ders3_Dovrler_Metodlar.calculator.main;

import ders3_Dovrler_Metodlar.calculator.utill.Main;
import ders3_Dovrler_Metodlar.calculator.utill.MathUtil; //import edir diger klassdakilari

public class Calculator {
    public static void main(String[] args) {
        double d=Main.calculate();
        System.out.println(d);
        double bolme =MathUtil.bolme(5,4);


    }
}
