import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i<= size-1;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println(" original array " + Arrays.toString(arr));
	ReverseArray reverse = new ReverseArray();
       System.out.println("reverse Array "+ Arrays.toString(reverse.reverseForLoop(arr))) ;
	}
}

class ReverseArray{
    public int[] reverseForLoop(int[] arr) {
        int size = arr.length;
        int[] rev=new int[size];
        for(int i = 0 ; i < size;i++){
           rev[i]= arr[size-1-i] ;
        }
        return rev;
        
    }
}




/******
Enter array size
5
2 4 5 7 9
 original array [2, 4, 5, 7, 9]
reverse Array [9, 7, 5, 4, 2]
*******/