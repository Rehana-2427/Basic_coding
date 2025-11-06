import java.util.*;

class Fibonnaci{
		public static void main(String[] args){
				int a = 0;
				int b = 1;
				System.out.println("Enter number");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				
				int i=2;
				int temp;
				while(i<=num){
					temp = b;
					 b = a+b;
					 a = temp;
				
					i++;
				}
				System.out.println("..."+b);
		}
}


🧩 Unexpected Fibonacci Behavior in Java

While testing a simple Fibonacci program in Java, Everything was fine… until I entered a slightly bigger number 😅

Enter number: 46 → ...1836311903 ✅  

Enter number: 47 → ...-1323752223 ❌  

Enter number: 48 → ...512559680  

Enter number: 50 → ...-298632863

The numbers turned negative because of something deeper happening inside Java.

⚙️ The Real Reason — Integer Overflow

In Java, the int data type can hold values only between:

-2,147,483,648 to 2,147,483,647

The Fibonacci series grows exponentially fast.

 At the 46th Fibonacci number, we hit 1,836,311,903 — still within range ✅

 At the 47th, it becomes 2,971,215,073 — which is greater than the max int limit ❌

When that happens, Java does not throw an error.

 Instead, it performs modular arithmetic — the number wraps around into the negative range.

This phenomenon is called Integer Overflow.

💥 What Is Integer Overflow?

When an integer exceeds its maximum limit, it “wraps around” using two’s complement representation.

Example : 

Max int = 2,147,483,647  

Next value = -2,147,483,648 (wraps around)

So when the Fibonacci program reaches the 47th index:

a + b = 2,971,215,073  

→ wraps to -1,323,752,223

That’s why the output suddenly turns negative — even though the math is correct logically.



🌀 But Then I Noticed Something Else…

Even after turning negative, the numbers continued changing —

 sometimes positive again, sometimes negative — and even started repeating!

F(47) = -1323752223  

F(48) = 512559680  

F(49) = -811192543  

F(50) = -298632863  

F(51) = -1109825406  

F(52) = -1408458269  

F(53) = 1776683621  

F(54) = 368225352  

F(55) = 2144908973  



This repeating behavior isn’t random — it’s mathematical.

🔁 The Pisano Period — Why Repetition Happens

When you calculate Fibonacci numbers modulo some value, the sequence eventually repeats.

This repeating cycle is called the Pisano Period.

Formally:

Fib(n+2) = (Fib(n+1) + Fib(n)) mod m

In your program, the int data type works under mod 2³² arithmetic (because int has 32 bits).

That means your Fibonacci series is Fibonacci mod 2³²,

and all such modular Fibonacci sequences eventually repeat after a certain number of steps.

That’s why — after overflow — you start seeing the same values come back again and again.

They form a loop within the 32-bit integer space.



✅ How to Fix It

If you want to avoid overflow:

🔹 Use long

A long can handle much bigger Fibonacci values (±9.22×10¹⁸).

 It will work fine up to around the 92nd Fibonacci number.



long a = 0, b = 1, temp;

🔹 Use BigInteger

If you want Fibonacci values beyond that (hundreds or thousands), use:

This supports unlimited precision — so you’ll never face overflow or repetition.

Enter number: 100  

...354224848179261915075 ✅

When my Fibonacci program turned negative, I expected an error — but got a lesson instead 😄

“Sometimes code doesn’t crash — it quietly shows how computers think.

A small overflow taught me how deeply numbers are managed behind the scenes.