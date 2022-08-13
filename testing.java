public class testing {
    private static int k;

    public static void main(String[] args) {
        int [][] arr = new int[][]{{1,2,3,6},
                                   {4,5,6,7},
                                   {7,8,9,10}};
        // int i, j;
        // for (i = 0; i < 3; i++) {
        //     for (j = 0; j < 3; j++) {
        //         arr[i][j] = i * j;
        //     }
        // }
        // for(int h=0;h<arr.length;h++){
        //     for(int k=0;k<arr[h].length;k++){
        //         System.out.println(arr[h].length);
        //         System.out.println(arr.length);
        //     }
        //     System.out.println();
        // }

        // for(int b=0;b<arr.length;b++){
        //     System.out.println(arr[b][b]);
        // }

        // for(int j=arr.length-1;j>=0;j--){
        //     System.out.println(arr[j][i]);
        // }
        int arr_one[][] = new int[3][3];

        int j=arr.length-1;
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
                System.out.println(arr[j][i]);
                sum+=arr[j][i];
             j--;
        }
        System.out.println(sum);
    }
}