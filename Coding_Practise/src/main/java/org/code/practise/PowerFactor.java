package org.code.practise;

public class PowerFactor {

    public  static  void main(String[] args){
        int n=256;
        System.out.println(isPowerofFour(n));
    }

    private static boolean isPowerofFour(int n) {
        if(n==0) return false;
        while(n%4==0){
            n/=4;


        }
        System.out.println(n);
        return n == 1;
    }
}
