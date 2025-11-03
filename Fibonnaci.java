import java.util.*;

class Fibonnaci{
		public static void main(String[] args){
				int a = 0;
				int b = 1;
				System.out.println("Enter number");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				
				int i=2;
				int temp;
				while(i<=num){
					temp = b;
					 b = a+b;
					 a = temp;
				
					i++;
				}
				System.out.println("..."+b);
		}
}