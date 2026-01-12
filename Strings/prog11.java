package Strings;

import java.util.HashSet;

// Remove Duplicate Characters to Form the Lexicographically Smallest String
// Input:  "bcabc"
// Output: "abc"

// Explanation:
// Remove duplicates
// Smallest lexicographical order → "abc"

// Input:  "cbacdcbc"
// Output: "acdb"

public class prog11 {
    public static String smallstring(String s){
        HashSet<Charecter> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        for(char ch:hs){
            if()
        }   

    }

    public static void main(String[] args) {
        String s = "bcdAEfg";
        String res = smallstring(s);
        System.out.println(res);
    }

}
