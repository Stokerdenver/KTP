package com.company;

public class Main {

    public static void main(String[] args) {
        int i;

        for(i=2; i <= 100; i++)
            if(isPrime(i))
                System.out.println(i);




    }
    public static boolean isPrime(int n)
    { int j;

        for (j = 2;j < n;j++) {
            if ((n % j) == 0)
                return false;
        }

           return true;



    }

}

