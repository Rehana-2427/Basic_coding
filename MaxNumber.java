import java.util.*;

class MaxNumber
{

		public static void main(String[] args)
		{
			System.out.print("Enter size: ");
			//first take input of size of the array 
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			//array initialize 
			int[] arr = new int[size];
			//loop for to take input
			for(int i = 0; i < size ; i++ )
			{
					arr[i] = sc.nextInt();
			}
			
			//take one varaiable max and initialize arr[0] is maximum value in array 
			// and compare with other values in array and if it greater than max then assign it max;
			
			int max = arr[0];
			for(int maxNum : arr){
				if( maxNum > max )
					max = maxNum;
			}
			System.out.println("Maximum number : " + max);
		}
}	