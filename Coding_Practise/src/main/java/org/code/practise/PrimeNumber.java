package org.code.practise;

public class PrimeNumber {

    public  static void  main(String[] args){
        System.out.println(isPrime(18));
        System.out.println(isPrime(17));
    }

    private static boolean isPrime(int i) {

        if(i<=1) return false;
        if(i==2) return true;
        if(i%2==0) return false;
        for(int j = 3; j<Math.sqrt(i);j+=2){
            if(i%j==0)return false;

        }
        return true;
    }
}
