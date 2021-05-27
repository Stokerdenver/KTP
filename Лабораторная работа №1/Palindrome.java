package com.company;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
       for (int i = 0; i < args.length; i++) {
              String s = args[i];
      //     Scanner scan = new Scanner(System.in);
        //   String s = scan.next();
          if(isPalindrome(s))
              System.out.println("Палиндром!");
          else System.out.println("Не палиндром!");
       }}


    public static String reverseString(String s){
        String a = "";
        for (int i = s.length() - 1; i >= 0; --i) a += s.charAt(i);
        return a;

    }
    public static Boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}

