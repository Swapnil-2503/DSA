
public class customStack {
    protected int[] data;
    private static final int Default=10;

    int ptr=-1;

    public customStack(int size){
           this.data=new int[size];
    }
    public customStack(){
        this(Default);
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
 public int pop() throws Exception{
    if(isEmpty()){
        throw new Exception("cannot pop from empty stack!");
    }
    return data[ptr--];
 }
public int peek() throws Exception{
    if(isEmpty()){
        throw new Exception("cannot peek from empty stack!");
    }
    return data[ptr];
}

    private boolean isFull(){
        return ptr==data.length-1;
    }
    private boolean isEmpty(){
        return ptr==-1;
    }
    public static void main(String[] args) {
        customStack stack=new customStack();
        stack.push(10);
        stack.push(11);
        stack.push(13);

        stack.pop();
        stack.pop();
    }
}
