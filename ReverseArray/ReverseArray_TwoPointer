import java.util.*;

class Main
{
		public static void main(String[] args)
		{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter size of array :");
				int size = sc.nextInt();
				int[] arr = new int[size];
				System.out.print("Enter elements: ");
				for(int i=0;i<size;i++){
					arr[i]=sc.nextInt();
				}
				System.out.println("originial Array:" + Arrays.toString(arr));
				ReverseArraySWAP ra = new ReverseArraySWAP();
				System.out.println("Reversed Array : "+ Arrays.toString(ra.reverseArray(arr)));

		}
}
class ReverseArraySWAP{
    public int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            
        }
        return arr;
    }
}