public class matrix {

    public void sumDiagonals(){
        int [][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int sumx = 0;
        int sumy = 0;
        for(int i=0;i<=arr.length-1;i++){
            sumx=sumx+arr[i][i];
        }
        for(int i=0;i<arr.length;i++){
            sumy=sumy+arr[i][arr.length-i-1];
        }
        System.out.println("Total sum of diagonals is:"+(sumx+sumy));
    }
    public static void main(String[] args) {
        matrix m = new matrix();
    m.sumDiagonals();
        }
    }

