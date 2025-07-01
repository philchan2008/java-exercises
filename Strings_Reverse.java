import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = true;
        for (int i=0, j=(A.length()-1); i<A.length(); i++, j--) {
            if (A.charAt(i) != A.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome?"Yes":"No");
    }
}
