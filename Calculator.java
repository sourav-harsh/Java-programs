import java.util.*;

 class Calculator{
    int a,b;
    void sum(){
        int c=a+b;
        System.out.println(c);
    }
    void sub(){
        int c=a-b;
        System.out.println(c);
    }
    void mul(){
        int c=a*b;
        System.out.println(c);
    }
    void divide(){
        int c=a/b;
        System.out.println(c);
    }

 
    public static void main(String args[]){
        Calculator ob=new Calculator();
        ob.a=13;
        ob.b=2;
        ob.sum();
        ob.sub();
        ob.mul();
        ob.divide();
    }
 
}