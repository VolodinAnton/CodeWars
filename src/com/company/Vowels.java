package com.company;
/*Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.*/


public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        char[] massivCharov = str.toCharArray();
        for (char a : massivCharov
             ) {
            if (a == 97 || a == 101 || a == 105 || a == 111 || a == 117)
                ++vowelsCount;
        }
        return vowelsCount;
    }

}