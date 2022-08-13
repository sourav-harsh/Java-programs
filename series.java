import java.lang.Math;

public class series {

    double series(double n){
        double sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+1/i;
        }
        return sum;
    }
    double series(double a,double n){
        double sum=0;

        for(int i=1;i<=n;i++){
            sum=sum+((1+(3*i-3))/(Math.pow(a,(2+(3*i-3)))));
        }
        return sum;
    }
    public static void main(String[] args) {
        series obj=new series();
        double k=obj.series(2, 2);
        System.out.println(k);
    }
}