public class MyStack {

    int [] myStack;
    static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    
    public MyStack(){
        this(DEFAULT_SIZE);
    }

    public MyStack(int size){
        this.myStack = new int[size];
    }

    public boolean push(int[] myStack, int item){
        if (isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        myStack[ptr] = item;
        return true;
    }

    public void pop(int myStack) {
        if (isEmpty()){
           System.out.println("Stack is Empty"); 
        }
        ptr--;
        
    }

    public int peek(int[] myStack, int item){
        if (isEmpty()){
            System.out.println("Stack is Empty returning 0");
            return 0;
        }else{
            return myStack[ptr];
        }
    }

    public boolean isEmpty(){
        if (ptr == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){

        if (ptr >= myStack.length){
            return true;
        }        
        return false;
    }
}
