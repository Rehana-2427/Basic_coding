// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import  java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array :" + Arrays.toString(arr));
       
        ArrayorderCheck ac = new ArrayorderCheck();
        if(ac.isAscending(arr)){
             System.out.println("Enter Target: ");
        int target=sc.nextInt();
        System.out.println("Asecnding BS :" );
        AscendingBinarySearch abs= new AscendingBinarySearch();
        int ascendingAns = abs.binarySearch(arr,target);
        System.out.println(ascendingAns);
        }
        else if(ac.isDesecending(arr)){
         System.out.println("Enter Target: ");
        int target=sc.nextInt();
        System.out.println("Descending BS :" );
        DescendingBinarySearch dbs= new DescendingBinarySearch();
            int DescenidngAns = dbs.binarySearch(arr,target);
        System.out.println(DescenidngAns);
        }
        else{
            System.out.println("Array is not sorted");
        }
    
    }
    
    
}

class ArrayorderCheck{
    public  boolean isAscending(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
            
        }
        return true;
    }
    
    public  boolean isDesecending(int[] arr){
         for(int i=0;i<arr.length-1;i++){
             if(arr[i] < arr[i+1]){
                 return false;
                 
             }
         }
        return true;
    }
}
class AscendingBinarySearch{
    public int binarySearch(int[] arr,int target){
        int start =0;
        int end = arr.length;
        while(start<end){
            int mid = ((start+end)/2);
            if(arr[mid] == target){
               return mid;
            }
            else if(target > arr[mid]){
                start=mid+1;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
        }
        return -1;
    }
}

class DescendingBinarySearch{
    public int binarySearch(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start>end){
            int mid=(start+end)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                start = mid+1;
            }
            else if(target >arr[mid]){
                end = end -1;
            }
        }
        
        return -1;
    }
}