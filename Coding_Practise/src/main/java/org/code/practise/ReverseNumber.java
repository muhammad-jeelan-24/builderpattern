package org.code.practise;

public class ReverseNumber {

    public  static  void main(String[] args){
        reverseANumber(245678978);

    }

   public static  void  reverseANumber(int toreverse){
    int remainder;
    int reverse=0;
    while(toreverse>0){
        remainder=toreverse%10;
        toreverse/=10;
        reverse=reverse*10+remainder;

    }
       System.out.println(reverse);

    }
}
