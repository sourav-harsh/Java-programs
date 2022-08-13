import java.util.Scanner;;
public class perimeter {
    public void square(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of square");
        int side=sc.nextInt();
        System.out.println("Perimeter of square is "+4*side);
    }
    public void rectangle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int length=sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int breadth=sc.nextInt();
        System.out.println("Perimeter of rectangle is "+2*(length+breadth));
    }
  public void circle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int radius=sc.nextInt();
        System.out.println("Perimeter of circle is "+2*3.14*radius);
    }
    public static void main(String[] args) {
        perimeter obj=new perimeter();
        obj.square();
        obj.rectangle();
        obj.circle();
    }
}


