import java.util.Scanner;

public class chapterBQ3 {
    int arr[];

    public void initerlizer() {
        arr = new int[] { 11, 6, 77, 44, 5, 442, 73, 86, 9, 10 };
    }

    public void linearSearch() {
        System.out.println("Enter the number to be linear searched");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Found at index: " + (i + 1));
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Not found");
        }
    }

    public void binarySearch(){
        System.out.println("Enter the number to be binary searched");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int flag = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            int i=0;
            i++;
            System.out.println(i);
            if (arr[mid] == num) {
                System.out.println("Found at index: " + (mid + 1));
                flag = 1;
                break;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (flag == 0) {
            System.out.println("Not found");
        }
    }
    public void bubbleSort(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void show(){
        System.out.println("Sorted array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        chapterBQ3 ob = new chapterBQ3();
        ob.initerlizer();
        ob.linearSearch();
        ob.bubbleSort();
        ob.show();
        ob.binarySearch();
    }
}
