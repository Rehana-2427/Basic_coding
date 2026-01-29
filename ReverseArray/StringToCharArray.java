import java.util.*;

class StringToCharArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String name = sc.nextLine();
		char[] ch = name.toCharArray();
		for(char c : ch){
		   System.out.print( c + " ");
		}
	}
}