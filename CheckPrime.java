import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		CheckPrime prime = new CheckPrime();
		boolean result =  prime.isPrime(n);
		if(result == true){
		    System.out.println(n + " is a prime number");
		}
		else {
		    System.out.println(n + " not a pime number");
		}
	}
}
class CheckPrime{
    boolean isPrime(int n){
        if(n == 0 || n == 1)
        {
            return false;
        }
        if(n==2 || n==3 ){
            return true;
        }
        
        if(n % 2 ==0 || n%3== 0){
            
            return false;
        }
        
        for(int i = 5 ; i*i<=n ; i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}