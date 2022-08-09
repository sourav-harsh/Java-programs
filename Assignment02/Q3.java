package Assignment02;

import java.util.*;

class Q3 {
    int fun(int x){
        int c=x*x;
        return c;
    }

    int fun(int x,int y){
        return x*x+y*y;
    }
    public static void main(String[] args) {
        Q3 ob= new Q3();
        int a = ob.fun(4);
        System.out.println(a);

    }
}

