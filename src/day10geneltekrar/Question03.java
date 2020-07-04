package day10geneltekrar;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        //1. sayi taban 2. sayi üs olacak üssü bulun
        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int taban= scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int us= scan.nextInt();
        int prod= 1;
        for (int i=1; i<=us; i++){
            prod=taban*taban;
        }
        System.out.println(prod);
        ///*   while (kuvvet !=0){
        //​
        //             sonuc *=taban;
        //             kuvvet--;
        //​
        //         }
        //        System.out.println("Cevap: " + sonuc);
        //​
        //       */
        //​
        //       /* for (;kuvvet!=0;kuvvet--){
        //            sonuc *=taban;
        //        }
        //        System.out.println("Cevap: " + sonuc);
        //​
        //        */
        //​
        //        double result =Math.pow(taban,kuvvet);
        //​
        //        System.out.println("Cevap: " + result);
        //​
    }
}
