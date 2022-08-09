package Assignment02;

import java.util.*;

class Q4
{
void cube(int x){
    System.out.println(x*x*x);
}
void cube(Float y){
    System.out.println(y*y*y);
}

public static void main(String[] args)
{
    Q4 ob = new Q4();
    ob.cube(0.2f);
}

}