import java.util.*;

class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int size = sc.nextInt();;
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array :" + Arrays.toString(arr));
		
		System.out.print("Enter Target :");
		int target = sc.nextInt();
		Searching searching = new Searching();
		
		int result = searching.findTerm(arr, target);

        if(result == 1){
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found!");
        }		
	}
}
class Searching {	
	public int findTerm(int[] arr,int target){
		boolean found = false;
		
		for(int i =0;i<arr.length;i++){
				if(arr[i] == target){
						found = true;
						break;
				}
		}
		
		if(found){
			return 1;
		}
		else{
			return -1;
		}
	}
	
}
