package org.code.practise;

public class TrippletIndices {

    public static  void  main(String[] args){

       int[] trippletElements= {2,1,4,6,5,10,11};
        int[] trippletElements2={2,7,1,6,3,7,1};
        System.out.println(isArray_A_Tripplment(trippletElements));
        System.out.println(isArray_A_Tripplment(trippletElements2));
    }

    private static boolean isArray_A_Tripplment(int[] trippletElements) {
        int left=Integer.MAX_VALUE;
        int middle=Integer.MAX_VALUE;


        for (int right : trippletElements) {
            if (right < left) {
                left = right;
            } else if (right < middle && right > left) {
                middle = right;
            } else if (right > middle && right > left) {
                System.out.println("left:" + left + ",middle:" + middle + ",right:" + right);
                return true;
            }


        }
        return false;
    }
}
