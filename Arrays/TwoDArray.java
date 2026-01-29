import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("ENter row size : ");
	    int rowsize = sc.nextInt();
	     System.out.println("ENter col size : ");
	    int colsize = sc.nextInt();
	    int[][] arr = new int[rowsize][colsize];
	    for(int i=0;i<rowsize;i++){
	        for(int j=0;j<colsize;j++){
	            arr[i][j]=sc.nextInt();
	        }
	    }
	    System.out.println(" 2D Array :" + Arrays.deepToString(arr));
	    
	   
	    int sum = 0;
	    for(int i = 0; i<rowsize;++i){
	        for(int j =0;j<colsize;++j){
	            sum += arr[i][j];
	        }
	    }
	    System.out.println("Sum of elements : "+ sum );
	    
	    
	    for(int i=0;i<rowsize;i++){
	        int rowsum =0;
	        for(int j=0;j<colsize;j++){
	            rowsum+=arr[i][j];
	        }
	        System.out.println("Sum of row elements : " + rowsum);
	    }
	    
	    for(int j=0;j<colsize;j++){
	        int colsum =0;
	        for(int i=0;i<rowsize;i++){
	            colsum +=arr[i][j];
	        }
	        System.out.println("sum of col elements : " + colsum);
	    }
	}
}