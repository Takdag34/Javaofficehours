package day10geneltekrar;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        //Klavyeden girilen bir cümlede belirttiğimiz bir
        //harfin tekrar sayısını hesaplayalım.
        Scanner scan= new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String str= scan.nextLine();
        System.out.println("tekrari bulunacak harfi giriniz");
        String harf=scan.next();

        int count=0;

        for (int i=0; i<str.length(); i++){
            if(str.substring(i,i+1).equals(harf)){
                count++;
            }
        }
        System.out.println(count);

    }
}
