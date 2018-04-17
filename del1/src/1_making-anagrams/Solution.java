import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // Count occurrences of each char [a-z] in each string
    // The absolute sum of charFrequencyString1[i] minus charFrequencyString2[i]
    // is equal to the minimum number of deletions required to obtain an anagram
    static int makingAnagrams(String s1, String s2){
        int[] charFrequencyString1 = new int[26];
        int[] charFrequencyString2 = new int[26];
        int nrOfDeletions = 0;

        for(char c : s1.toCharArray()){
            charFrequencyString1[c-'a']++;  // -'a' is used as a simple conversion between character and index
        }

        for(char c : s2.toCharArray()){
            charFrequencyString2[c-'a']++;
        }

        for (int i = 0; i < 26; i++)
            nrOfDeletions += Math.abs(charFrequencyString1[i] -
                    charFrequencyString2[i]);

        return nrOfDeletions;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
