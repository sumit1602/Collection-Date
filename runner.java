package com.company;

class runner {
    public static void main(String[] args) {
        Q7Stack num= new Q7Stack();
//        System.out.println(num.isEmpty());
        num.push(10);
        num.push(11);
        num.push(13);
        num.push(14);
        num.push(15);
//        System.out.println("Top element in the stack is: "+num.peek());
        num.push(12);

//        System.out.println("last element you pop from stack is: "+num.pop());
        System.out.println("minimum element of the stack is: "+num.getMin());
//        System.out.println(num.isEmpty());
        num.show();
        num.pop();
        num.pop();
        num.pop();
        num.pop();
        num.pop();
        num.pop();
        num.show();


    }
}
