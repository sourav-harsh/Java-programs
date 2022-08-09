package Assignment01;

import java.util.*;

class Q3
{
int checkPrimeOrNot(int x){
    int y=2,count=0;
while(y<=x){
if(x%y==0){
    count++;
}else{
}
y++;
}
return count;
}

public static void main(String[] args)
{
    Q3 ob=new Q3();

    int count=ob.checkPrimeOrNot(32);

    if(count<2){
        System.out.println("It is a prime number");
    }else{
        System.out.println("It is not a prime number");
    }
}
}

