import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String name = sc.nextLine();
		ReverseString.stringRev(name);
		
	}
}
class ReverseString 
{
    public static void stringRev (String name){
        String revStr=" ";
        for(int i=name.length()-1;i>=0;i--){
            revStr += name.charAt(i);
        }
        System.out.print(" Rev string :" + revStr);
    }
}
