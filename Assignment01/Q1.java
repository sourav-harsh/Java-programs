package Assignment01;

import java.util.*;

class Q1
{
void checkOddOrEven(int x)
{
    if (x%2==0) {
        System.out.println("It is a Even Number");
    }else{
        System.out.println("It is a Odd Number");
    }
}

public static void main(String[] args)
{
    Q1 ob=new Q1();
    ob.checkOddOrEven(17);
}

}