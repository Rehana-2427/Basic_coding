import java.util.*;

class MiniNumber
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
			
			//take one varaiable mini and initialize arr[0] is minimum value in array 
			// and compare with other values in array and if it less  than mini then assign it mini;
			
			int mini = arr[0];
			for(int miniNum : arr){
				if( miniNum < mini ){
					mini = miniNum;
				}
			}
			System.out.println("Minimum number : " + mini);
		}
}	