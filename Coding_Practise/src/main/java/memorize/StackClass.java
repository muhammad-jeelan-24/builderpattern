package memorize;

public class StackClass{

    //Fixed Size
    //Capacity
    //global variable

    private final Object[] stackArray;
    private final int maximCapacity;
    private int length;



    public StackClass(int maximCapacity){
        this.maximCapacity=maximCapacity;
        this.stackArray= new Object[maximCapacity+1];
        this.length=0;

    }


    //Push

    public  void push(Object type) throws Exception {

        if(isFull()){
            throw new Exception("Stack is Full");
        }
        this.stackArray[length++]=type;
    }

    //POP
    public  Object pop()throws Exception {
        if(isEmpty()){
              throw new Exception("Stack is empty");
        }
        return  this.stackArray[--length];
    }

    public Object peek(){
       if(isEmpty()){
           return -1;
       }
       return  this.stackArray[length];
    }
    private boolean isFull(){
        return this.maximCapacity==size();
    }
    public int size(){
        return length;
    }
    public boolean isEmpty(){
        return this.length==0;
    }


    //POP
    //Peek
    //Search
    //empty
}
