package day7methods;

import java.util.Scanner;

public class Methods02 {
    public static void main(String[] args) {

        System.out.println(esitMi(1,3));
    }

    public static boolean esitMi(int num1,int num2){
        if (num1==num2){
            return true;
        }
        return false;
    }
}
