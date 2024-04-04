package massivler;

import java.util.Scanner;

public class IlkHarf_SonHarf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sozu daxil edin");
        String s1=sc.nextLine();
        boolean b=true;
        for(int i =0;i<s1.length();i++){
            char sol=s1.charAt(i);
            char sag=s1.charAt(s1.length()-1-i);
            if(sol!=sag){
                b=false;
            }
            else{
                b=true;
            }}
        System.out.println(b);





    }
}
