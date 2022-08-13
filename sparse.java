public class sparse {
    public static void main(String[] args) {
        int arr[][] =            {{0 ,0 ,3 ,0},            
                                  {0 ,0, 5, 7},
                                  {0 ,0 ,0 ,0},
                                  {0, 2 ,6, 0}};

      int size=0;
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr[i].length;j++)
          {
              if(arr[i][j]!=0)
              {
                  size++;
              }
          }
      }          
      int sparse[][] = new int[3][size];   
      int k=0;
      while(k<size){
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr[i].length;j++)
          {
              if(arr[i][j]!=0)
              {
                sparse[0][k]=i;
                sparse[1][k]=j;
                sparse[2][k]=arr[i][j];
                k++;
              }
          }
      }
      for(int i=0;i<sparse.length;i++)
      {
          for(int j=0;j<sparse[i].length;j++)
          {
              System.out.print(sparse[i][j]+" ");
          }
          System.out.println();
      }
    }
    }
}
