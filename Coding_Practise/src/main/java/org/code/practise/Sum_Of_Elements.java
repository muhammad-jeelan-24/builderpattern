package org.code.practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *Two Sum
 * Give an array={2,5,8,3,7}
 * Target= 9
 * Find the sum of two elements that equals to target element
 */
public class Sum_Of_Elements {
    public static  void main(String[] args){

        int[] array={2,5,8,3,7,4};
        int target=9;
         two_sum(array,target);
    }

    private static void two_sum(int[] array, int target) {

        Map<Integer,Integer> twoSums=new HashMap<>(array.length);
        Arrays.stream(array).forEach(a->{
            if(twoSums.containsKey( target-a)){
                System.out.println("Sum of Two elements are "+a+","+(target-a));
            }else{
                twoSums.put(a, target-a);
            }
        });
    }


}
