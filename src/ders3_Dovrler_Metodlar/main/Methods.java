package ders3_Dovrler_Metodlar.main;

public class Methods {
    public static void main(String[] args) {
        foo();
        System.out.println("--------------");
       String s= foo2();//foo2 nin isini gorur Salam Amil Necesen yazir
        //daha sonrasinda foo2() ni silir onun yerine isi gorum yazisi yazdirir
        //String s = isi gordum ==== asagidakini  return "Isi gordum";
        //daha sonrasinda returnu capa vermek ucun system.out vermeliyik
        //Syste.out.println(s)
        System.out.println(s);//String s =foo2() yalnizca methodun icerisindekiler
        //capa verdi , amma returnu vermek ucun system out lazimdir
        //----------------------------------------------
        System.out.println("--------------");
        boolean b=foo3();
        if (b == true) {
            foo2();
        }
        System.out.println("--------------");
        System.out.println("b = "+foo2() );//sout a verende methodun icerisini
        // hemde  returnu capa verilir
    }
    public static void foo() {//yeni bunu meselen String s=foo() kimi
        // yaza bilmirik void olduguna gore
        //amma ki meselen foo2 String oldugu ucun
        //onu string deyisenine menimsede bilirik
        System.out.println("foo is called");
        System.out.print("Salam,");
        System.out.print("Amil.");
        System.out.println("Necesen?");

}
    public static String foo2() {
        System.out.println("foo2 is called");
        System.out.print("Salam,");
        System.out.print("Amil.");
        System.out.println("Necesen?");
        return "Isi gordum";
    }
    public static boolean foo3() {
        System.out.println("foo3 is called");
        System.out.print("Salam,");
        System.out.print("Amil.");
        System.out.println("Necesen?");
        return true;
    }
}
//1)void geriye deyer qaytarmir
//2)

