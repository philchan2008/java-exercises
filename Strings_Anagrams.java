import java.util.Scanner;

public class Solution {

    //Core function
    static boolean isAnagram(String a, String b) {
        // Complete the function

        if (a.length() != b.length()) {   //For test 4, 5
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        for (char c: a.toCharArray()) {
            b = b.replaceFirst(String.valueOf(c), "");
        }

        return b.isEmpty() ? true: false;
    }

  public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

