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
      int n = arr.length;
      for(int i =0 ; i<=n/2;i++){
          int temp = arr[i];
          arr[i] = arr[n-1-i];
          arr[n-1-i] = temp;
      }
   
    return arr;
        
    }
}



/****

Enter array size
4
3 5 1 7
 original array [3, 5, 1, 7]
reverse Array [7, 5, 1, 3] 

****/