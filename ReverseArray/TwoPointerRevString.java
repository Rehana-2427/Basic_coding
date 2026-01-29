import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter STring : ");
		String str = sc.nextLine();
		TwoPointerRevString revStr = new TwoPointerRevString();
		System.out.println(" Reverse String : " + revStr.revString(str));
		
	}
}
class TwoPointerRevString{
		public String revString(String str){
				char[] ch = str.toCharArray();
				int start = 0;
				int end=ch.length-1;
				while(start<end){
						char temp = ch[start];
						ch[start]=ch[end];
						ch[end]=temp;
						start++;
						end--;
				}
				return new String(ch);
		}
}