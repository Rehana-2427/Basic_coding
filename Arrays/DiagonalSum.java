import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        int[][] arr = new int[rowSize][colSize];
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array :" + Arrays.deepToString(arr));
        
        System.out.println("Row sum ");
        for(int i=0;i<rowSize;i++){
            int rowSum=0;
            for(int j=0;j<colSize;j++){
                rowSum += arr[i][j];
        }
        System.out.println(rowSum);
    }
    System.out.println("Col sum ");
        for(int j=0;j<colSize;j++){
            int colSum=0;
            for(int i=0;i<rowSize;i++){
                colSum += arr[i][j];
        }
        System.out.println(colSum);
        }

    System.out.println("diagonal sum : ");
    if(rowSize == colSize){
        int diagonalsum = 0;
        for(int i=0;i<rowSize;i++){
            diagonalsum += arr[i][i];
        }
        System.out.println(diagonalsum);
    }
    
        System.out.println("Anti diagonal sum ");
        int antidiagonalSum = 0;
        for(int i=0;i<rowSize;i++){
            antidiagonalSum+=arr[i][rowSize-1-i];
        }
        System.out.println(antidiagonalSum);
}

}
