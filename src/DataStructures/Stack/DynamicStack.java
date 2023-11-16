package DataStructures.Stack;

public class DynamicStack {
    int capacity=2;
    int stack[]=new int[capacity];
    int top=-1;

    public void push(int data)
    {
        if (size()==capacity)
        {
            expand();
        }
        else {
            top++;
            stack[top] = data;
        }
    }

    private void expand() {
        int length=size();
        int newStack[]=new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack=newStack;
        capacity*=2;
    }

    public int pop() {
        int data=0;
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        else{
            data = stack[top];
            stack[top] = 0;
            top--;
            shrink();
        }
        return data;
    }

    private void shrink() {
        int length=size();
        if (length<=(capacity/2)/2)
        {
            capacity=capacity/2;
        }
        int newStack[]=new int[capacity];
        System.arraycopy(stack,0,newStack,0,length);
        stack=newStack;
    }

    public int peek()
    {
        return stack[top];
    }
    public void show()
    {
        for(int n:stack)
        {
            System.out.print(n+" ");
        }
    }

    public int size()
    {
        return top+1;
    }

    public boolean isEmpty()
    {
        return (top<=-1);
    }
}
