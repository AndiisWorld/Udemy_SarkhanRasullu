package ders3_Dovrler_Metodlar.calculator.utill;

import ders3_Dovrler_Metodlar.calculator.main.Methods2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methods2.foo2("amil");//methods klasindaki foo metodunu cagirir
       // topla(0,0) cagirmaq
        double r= MathUtil.topla(3,4);
        //ve ya
        System.out.println(r);

        calculate();
    }
    public static double calculate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        double a=sc.nextDouble();
        System.out.println("Enter second number");
        double b=sc.nextDouble();
        System.out.println("Operation'u daxil edin: +1,-2,*3,/4");
        int operation=sc.nextInt();
        //double a=5;
        //double b=4;
        //int operation=1;
        double result=0;
        if(operation==1) {
            result= MathUtil.topla(b, a);
        } else if (operation==2) {
            result= MathUtil.cixma(a,b);
        } else if (operation==3) {
            result= MathUtil.vurma(a,b);
        }else if (operation==4) {
            result= MathUtil.bolme(a,b);
        }else {
            System.out.println();
        }
        return result;

    }

//    public static double topla(double a, double b){//istenilen sayda parametr
    //burda birinci eded double a oldugu ucun         topla(b,a); bele yazmisiqsa o zaman double a=b olur

}
