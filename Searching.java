import java.util.*;


class LinearSearching{
	public static void main(String[] args) {
	    
	    boolean found = false;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter size of Array : ");
	    int size = sc.nextInt();
	    int[] arr = new int[size];
	    for(int i=0;i<size;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    System.out.println("Array : " + Arrays.toString(arr));
	    System.out.println("Enter search term  : ");
	    int searchTerm = sc.nextInt();
	    for(int i=0;i<size;i++){
	        if(arr[i] == searchTerm){

            found = true;
            break;
	    }
	    
	}
	if(found){
	    System.out.println("Found");
	}else{
	    System.out.println("Not found");
	}
	}
	
}
