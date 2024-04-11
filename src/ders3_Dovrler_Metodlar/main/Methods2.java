package ders3_Dovrler_Metodlar.main;

public class Methods2 {
    public static void main(String[] args) {

           String b= foo2("Salam");//foo2()burda xeta olcaq cunki foo2ni cagirirq
            // ama ki asagida methodda parametr vermisik

            //foo2(String s) , mende parametrli foo2 var ona gore
            // foo2(icersine string tipde nese vermeliyem)

        // Burda demeli   public static String foo2(String s) {
        //foo2("Salam"); a gore birinci Salam capa verecek daha sonrasinda
        // methodun returnunu
        System.out.println("b = " +b); //returnu de capa verir




    }
    //public static void foo() {//hansi sozu isteyirem onu capa vermeyi ucun () parametr verirem
    public static String foo2(String s) {
        System.out.println("foo2 = "+s);//String s =Salam oldugu ucun //String s tipinde parametr verir
        //sout da foo2=Salam
        //
        return "Isi gordum";
    }
    public static boolean foo3(String s) {
        System.out.println("foo3 = " + s);
        return true;
    }
}


