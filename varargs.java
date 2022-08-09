
import java.util.Arrays;
public class varargs {

    static int sum(int ...args){
        int result=0;
        for(int a:args){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1,2,3,4,5,7,8,9));

    }
}
