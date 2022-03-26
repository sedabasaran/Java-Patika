package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args)
        {
            String input, reverseString = "";
            Scanner scan = new Scanner(System.in);

            System.out.println("Bir kelime giriniz: ");
            input = scan.nextLine();

            int lenght = input.length();

            for(int i=0; i<=lenght-1; i++){
                reverseString += input.charAt(lenght-1-i);
            }
            if(input.equals(reverseString)){
                System.out.println("Palindromik Kelime");
            }else{
                System.out.println("Palindromik Kelime değil");
            }
        }
}
