package Assignment01;

import java.util.*;

class Q2
{
    void checkOddOrEven(int x)
    {
        if (x%2==0) {

        }else{
            System.out.println(x);
        }
    }

public static void main(String[] args)
{
   Q2 ob=new Q2();
   int x=1;
   while (x<=100) {
    ob.checkOddOrEven(x);
    x++;
   } 
}

}