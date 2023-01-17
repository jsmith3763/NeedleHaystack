package org.example;

/* Can you find the needle in the haystack?

Complete the method named findNeedle() that takes an array full of strings but containing only one "needle". A needle is just a String with the value of "needle".

After your function finds the first needle it should return a message (as a string) that says:

"found the needle at position " plus the index it found the needle */
class Main {
    public static void main(String[] args) {
//        String[] haystack = {"the", "quick", "brown", "fox", "always", "pushes", "the", "needle", ".", "happy", "new", "year", "by.", "the", "way", ", Hello ! "};
        String[] haystack = {};
        String message = findNeedle(haystack);
        System.out.println(message);
    }

    public static String findNeedle(String[] haystack) {
        // Your code here
        if(haystack == null || haystack.length == 0) {
            return "Haystack is empty";
        }

        int hayStackLength = haystack.length;
        int i = 0;

        while(i < hayStackLength) {
            if(haystack[i].equals("needle")) {
                break;
            }
            i++;
        }
        return "Needle is in haystack at index: " + i;
    }
}