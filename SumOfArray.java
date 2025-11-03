
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=sc.nextInt();
		}
		System.out.println(" The original Array  :" + Arrays.toString(arr));
		SumOfArray sum = new SumOfArray();
		int ans =  sum.sumOfArray(arr);
		System.out.println("Sum of Array : " + ans);
	
	}
}
class SumOfArray{
   int sumOfArray(int[] arr){
       int sum =0;
       for(int i=0;i< arr.length;i++){
           sum += arr[i];
           
      
       }
       return sum;
   }
}