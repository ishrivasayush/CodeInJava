package DataStructures.Stack;

public class Stack {
    int stack[]=new int[5];
    int top=-1;

    public void push(int data)
    {
        if (top==(stack.length-1))
        {
            System.out.println("Stack is Full.");
        }
        else {
            top++;
            stack[top] = data;
        }
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        else{
            int data = stack[top];
            stack[top] = 0;
            top--;
            System.out.println(data);
        }
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
