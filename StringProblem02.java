public class StringProblem02 {
    public static boolean anagramStrings(String s, String t) {

        if (s.length() != t.length())
            return false;

        for(int i=0;i<s.length();i++){
            
        }

         
        return true;
    }

    public static void main(String[] args) {
        String argStr1 = "anagram";
        String argStr2 = "nagaram";
        System.out.println(anagramStrings(argStr1, argStr2));
    }
}

// Given two strings s and t, return true if t is an anagram of s, and false
// otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a
// different word or phrase, typically using all the original letters exactly
// once.

// Examples:
// Input : s = "anagram" , t = "nagaram"

// Output : true

// Explanation : We can rearrange the characters of string s to get string t as
// frequency of all characters from both strings is same.

// Input : s = "dog" , t = "cat"

// Output : false

// Explanation : We cannot rearrange the characters of string s to get string t
// as frequency of all characters from both strings is not same.
