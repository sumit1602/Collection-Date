package com.company;

public class Q7Stack {
    int stack[]= new int[5];
    int top=0;

    public void push(int data){
        if(top==5)  {
            System.out.println("Sorry stack is full please pop and then come again");
        }
        else {
            stack[top] = data;
            top++;
        }
    }

    public int pop(){
        
      int data=0;
      if(top<=0) {
          System.out.println("Q7Stack is empty now Plese push some data then come again to pop");

      }
      else {
          top--;
          data = stack[top];
          stack[top] = 0;
      }
       return data;
    }
    public void show(){
        for(int i: stack){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
    public int peek(){
        int data;
        data=stack[top-1];
        return data;
    }
    public int getMin(){
        return top;
    }
    public String isEmpty(){
        if(top<=0){
            return "Q7Stack is empty";
        }
       else{
           return "Q7Stack is not empty";
        }
    }
}
