import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        //s = s.replaceAll("[^a-zA-Z]", "");
        for (int i=0; i<s.length();i+=1) {
            int ik = i+k;
            if (ik > s.length()) break;
            String _string = s.substring(i,ik);
            if (smallest == "" || smallest.compareTo(_string) > 0) {
                smallest = _string;
            }
            if (largest == "" || largest.compareTo(_string) < 0) {
                largest = _string;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
