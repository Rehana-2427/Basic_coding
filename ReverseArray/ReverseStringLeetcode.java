import java.util.*;

class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start < end){
            char temp =s[start];
            s[start] =s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        Solution sol = new Solution();
        sol.reverseString(ch);
        System.out.println(Arrays.toString(ch));
    }
}