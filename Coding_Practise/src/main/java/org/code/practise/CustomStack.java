package org.code.practise;

public class CustomStack {

    private final int[] arrayStack;
    private int index; private final int maximumCapcity;
    public CustomStack(int maximumCapcity){
        index=0;
        this.maximumCapcity=maximumCapcity;
        arrayStack=new int[maximumCapcity+1];
    }
    //Operations
    public  void push(int element) {
        if(index<=maximumCapcity){
            arrayStack[index++]=element;
        }
    }
    public  int pop(){
        if(index==0) return -1;
        return arrayStack[--index];
    }
    public int search(int value) {

        if (value == 0) {
            for (int i = index; i > 0; i--) {

                if (arrayStack[i] == 0) {
                    return i;
                }

            }
        } else {
            for (int i = index; i >=0; i--) {
                if (arrayStack[i] == value) {
                    return i;
                }


            }
        }
    return -1;
    }

    public int size(){
        return index;
    }



}
