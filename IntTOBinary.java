import java.io.*;
import java.util.*;

class IntTOBinary{
	static void intToBinary(int num){
			System.out.println(Integer.toBinaryString(num));
	}
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		IntTOBinary.intToBinary(num);
	}
}