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
        reverse.reverseForLoop(arr);
	}
}

class ReverseArray{
    public void reverseForLoop(int[] arr) {
        for(int i = arr.length-1; i>=0;i--){
           System.out.print(" "+ arr[i] );
        }
        System.out.println("");
        
    }
}