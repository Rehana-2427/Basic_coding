import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Row size :");
	    int row = sc.nextInt();
	    int[][] jagedArry = new int[row][];
	    for(int i = 0; i<row;i++){
	        System.out.print("Enter col size : ");
	        int col = sc.nextInt();
	        jagedArry[i]=new int[col];
	        for(int j = 0;j<col;j++){
	            jagedArry[i][j] = sc.nextInt();
	        }
	    }
	    System.out.println("Jagged Array : " + Arrays.deepToString(jagedArry));
		
	}
}