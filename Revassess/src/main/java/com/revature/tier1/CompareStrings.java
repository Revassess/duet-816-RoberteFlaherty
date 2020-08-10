package com.revature.tier1;

public class CompareStrings {

    public static boolean compareStrings(String s1, String s2){
        boolean equal = true;

        if(s1.equals(s2))
        {
            equal = true;
        }
        if(!s1.equals(s2))
        {
        equal = false;
    }
        return equal;
    }
}