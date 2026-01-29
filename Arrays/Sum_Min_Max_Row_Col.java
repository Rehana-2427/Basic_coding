
// this program sum of elements row wise , col wise and 
// print maximum sum from a row , minimum sum from a row 
// prin maximum sum from colum ,minium sum from column 


import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Size : ");
        int rowsize = sc.nextInt();
        System.out.print("Enter Col Size : ");
        int colsize = sc.nextInt();
        int[][] arr = new int[rowsize][colsize];
        for(int i =0;i<rowsize;i++){
            for(int j=0;j<colsize;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array : " + Arrays.deepToString(arr));
        System.out.print("Sum of Row Elemnets : ");
        int maxRowSum = Integer.MIN_VALUE;
        int minRowSum = Integer.MAX_VALUE;
        for(int i=0;i<rowsize;i++){
            int rowsum =0;
            for(int j=0;j<colsize;j++){
                rowsum+=arr[i][j];
            }
            System.out.println(rowsum + " ");
            if(rowsum > maxRowSum){
                maxRowSum = rowsum;
            }
            if(rowsum<minRowSum){
                minRowSum = rowsum;
            }
        }
        System.out.println("Maximum sum of row : " + maxRowSum);
        System.out.println("Minimum sum of row : " + minRowSum);

        /* Col sum */
        System.out.print("Sum of col elements  : " );
        int colMaxSum = Integer.MIN_VALUE;
        int colMinSum = Integer.MAX_VALUE;
        for(int j=0;j<colsize;j++){
            int colsum =0;
            for(int i=0;i<rowsize;i++){
                colsum+=arr[i][j];
            }
            System.out.print(colsum+" ");
            if(colsum < colMinSum){
                colMinSum = colsum;
            }
            if(colsum > colMaxSum){
                colMaxSum = colsum;
            }
        }
        System.out.println("Maximum sum of col : " + colMaxSum);
        System.out.println("Minimum sum of col : " + colMinSum);
        
    }
}



/***

Why do we use Integer.MIN_VALUE here?
Your code:
int maxRowSum = Integer.MIN_VALUE;


We are trying to find the maximum row sum.

Rule:

When finding a maximum, start with the smallest possible value.

🔹 What is Integer.MIN_VALUE?
Integer.MIN_VALUE = -2,147,483,648


This is the smallest number an int can hold.

🔹 Why NOT Integer.MAX_VALUE?
Suppose we write:
int maxRowSum = Integer.MAX_VALUE;


Now imagine row sums:

Row 0 sum = 10
Row 1 sum = 25

Condition:
if (rowSum > maxRowSum)


Is 10 > 2147483647 ❌ false

Is 25 > 2147483647 ❌ false

👉 Condition never becomes true
👉 maxRowSum never updates
👉 ❌ WRONG RESULT

🔹 Why Integer.MIN_VALUE works?

Start with:

maxRowSum = -2147483648


Now:

10 > -2147483648 ✅ true → update

25 > 10 ✅ true → update

👉 Correct maximum found.

🔹 Simple rule to remember (INTERVIEW GOLD ⭐)
Problem Type	Initial Value
Find Maximum	Integer.MIN_VALUE
Find Minimum	Integer.MAX_VALUE
🔹 Real-life analogy 🧠

Imagine you’re choosing the tallest person:

Start with the shortest possible height

Then compare everyone

You wouldn’t start with the tallest person already 😄

🔹 Same rule for column minimum
int minColSum = Integer.MAX_VALUE;


Because:

You’re finding minimum

So start with largest possible value

🔹 Interview-ready explanation (use this 👇)

I initialize maxRowSum with Integer.MIN_VALUE so that any valid row sum will be greater than it and the comparison works correctly. 


**/