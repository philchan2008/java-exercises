import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        //String[] tokens = s.split("[ !,?._'@]+"); //s.split("[^a-zA-Z]+");
        // System.out.println(tokens.length);
        // for (String t: tokens) {
        //     System.out.println(t);
        // }

        //TODO: Look into the distinction between s.split() and StringTokenizer at a later time.
        StringTokenizer s1 = new StringTokenizer(s," ,.!?_'@+");
        System.out.println(s1.countTokens());
        while(s1.hasMoreTokens()){
            System.out.println(s1.nextToken());
        }
        scan.close();
    }
}


