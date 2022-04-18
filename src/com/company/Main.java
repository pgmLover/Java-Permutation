package com.company;

import java.util.Scanner;

public class Main {

    static int Factorial(int n){
        int fact =1;
        for(int i=1; i<=n;i++){
            fact=fact*i;
        }
        return (fact);
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N value:");
        int n=sc.nextInt();
        System.out.print("Enter R Value:");
        int r=sc.nextInt();

        int p=Factorial(n)/Factorial(n-r);
        int c=Factorial(n)/(Factorial(n-r)*Factorial(r));
        System.out.print("Permutation is:"+p);
        System.out.print("\nCombinations:"+c);


    }
}
