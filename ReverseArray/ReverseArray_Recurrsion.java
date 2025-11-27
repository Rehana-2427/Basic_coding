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
       System.out.println("reverse Array "+ Arrays.toString(reverse.reverseRecurssion(arr,0,arr.length-1))) ;
	}
}

class ReverseArray{
    public int[] reverseRecurssion(int[] arr,int start,int end) {
      int n = arr.length;
      if(start >=end ) {
		  return arr;
	  }
	  int temp = arr[start];
	  arr[start]=arr[end];
	  arr[end]=temp;
	  
    return reverseRecurssion(arr,start+1,end-1);
        
    }
}