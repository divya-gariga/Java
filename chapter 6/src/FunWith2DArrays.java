public class FunWith2DArrays {
    public static void main(String[] args) {
        int[][] my2DArray = new int[2][3];
        fill2DArray(my2DArray);
        System.out.println("The original array");
        print2DArray(my2DArray);
        System.out.println("Modified Array(array*2)");
        printModifiedArray(my2DArray);

    }
    public static void fill2DArray(int[][] my2DArray)
    {
        int count=1;
        for(int i=0;i<my2DArray.length;i++){
            for(int j=0;j<my2DArray[i].length;j++)
            {
                my2DArray[i][j]=count++;
            }
        }
    }
    public static void print2DArray(int[][] my2DArray){
        for(int i=0;i<my2DArray.length;i++){
            for(int j=0;j<my2DArray[i].length;j++)
            {
                System.out.print(my2DArray[i][j]+"  ");
            }
            System.out.println();
        }

    }
    public static void printModifiedArray(int[][] my2DArray){
        for(int i=0;i<my2DArray.length;i++){
            for(int j=0;j<my2DArray[i].length;j++)
            {
                System.out.print(my2DArray[i][j]*2+"  ");
            }
            System.out.println();
        }
    }

}

