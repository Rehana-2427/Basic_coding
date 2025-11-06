import java.util.Scanner;
import java.util.Arrays;

class Swap{
		public static void main(String[] args){
				System.out.print("Enter 2 numbers : " );
				Scanner sc = new Scanner(System.in);
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int temp = n1;
				n1 = n2;
				n2 = temp;
				System.out.println("After swapping : " + "n1 = "+ n1 +" n2 = "+ n2);
				
				
				System.out.println("using Arrays");
				int[] a = {1, 2, 4 ,3};
				int[] b = {2, 4, 5,7,7,80,233};
				System.out.println("before swapping");
				System.out.println(Arrays.toString(a) + " ....." + Arrays.toString(b));
				int tempArray[] = a;
				a = b;
				b = tempArrayc;
				System.out.println("After swapping");
				System.out.println(Arrays.toString(a) + " ....." + Arrays.toString(b));
				
		}
}