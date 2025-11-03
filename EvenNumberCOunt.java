
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
		CountEVenNumber ce=new CountEVenNumber();
		System.out.println("COunt of even number : " + ce.countEven(arr));

	
	}
}
class CountEVenNumber{
  int countEven(int[] arr){
      int count =0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]%2==0){
              System.out.println(arr[i]+ "  ");        
              count+=1;
          }
         
      }
       return count;
  }
}