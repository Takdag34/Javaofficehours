package day10geneltekrar;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        //// Kullanıcı 0 sayısı girene kadar girilen
        //// sayıları toplayan java kosu yazalım
        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int num= scan.nextInt();
int sum=0;
        do{
           // System.out.println("yeniden sayi giriniz");
            num=scan.nextInt();
            sum=sum+num;

        }while (num!=0);
        System.out.println("genel toplam" +sum);

        }
    }

