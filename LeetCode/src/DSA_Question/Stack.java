package DSA_Question;

import java.util.Arrays;

public class Stack {
    private static Stack myStack;
    int maxSize;
    int[] stack ;
    int top;

    //    constructure
     public Stack(int maxSize){
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        top = -1;
    }

//    Operation in stack;
    // isEmpty():- check stack is empty or not
     public void isEmpty(){
        if(top == maxSize-1){
            System.out.println("Stack is not empty.");
        }else{
            System.out.println("Stack is empty.");
        }
    }
    // push():- add element in stack
    public void push(int value){
         if(top == maxSize-1){
             System.out.println("Stack is overflow");
         }else {
             stack[++top] = value;
         }
    }
    // pop():- remove element in top of stack;
    public int pop(){
         if(top == -1){
             System.out.println("Stack is underflow");
             return -1;
         }
         return stack[top--];
    }

    //peek(): view top element of stack
    public int peek(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return -1;
        }
        return stack[top];
    }

    //display(): traverse stack
    public void display(){
        if(top == -1){
            System.out.println("Stack is underflow");
        }
        for (int i = 0; i < maxSize-1; i++) {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

    static void main() {
//        Create a stack and apply all operation in stack
        Stack myStack = new Stack(5);
        myStack.isEmpty();
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.display();
        myStack.push(6);
        myStack.push(7);
        System.out.println("deleted element: "+myStack.peek());
        myStack.pop();
        myStack.display();
    }
}
