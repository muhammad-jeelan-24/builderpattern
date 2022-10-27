package memorize;

public class MainClass {

    public static  void main(String[] args) throws Exception {
        StackClass stackClass= new StackClass(10);
        stackClass.push(10);
        stackClass.push(20);
        stackClass.push(30);
        stackClass.push(40);
        stackClass.push("Jeelan");
        System.out.println("Wonderful size:"+stackClass.size());
        stackClass.pop();
        stackClass.pop();

        System.out.println("Wonderful size:"+stackClass.size());
        stackClass.pop();
        stackClass.pop();
        System.out.println("Top Value:"+stackClass.peek());
        System.out.println("Is Empty:"+stackClass.isEmpty());
    }
}
