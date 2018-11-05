package com.company;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void paint2(int size){
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if (i==j||j==size-i-1){
                    System.out.print("X");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static boolean ifPrime(int i){
        for (int j=2; j<i; j++){
            if (i%j==0){
                return false;
            }
        }
        return true;
    }


    public static void findPrime(int size){
        //array of all int from 1 to size
        ArrayList<Integer> allPrimes=new ArrayList<Integer>();
        ArrayList<Integer> primeOfSum=new ArrayList<Integer>();
        allPrimes.add(2);
        int primeSize=1;
        HashMap<integer, >
        for (int i=3; i<size; i++){
            if(ifPrime(i)){
                allPirmes.add(i);
                int primeSize++:
                for (int j=0; j<primeSize; i++)
            }

        }

    }


    public static void main(String[] args) {
        findPrime(100);
    }
}
