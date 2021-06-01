package org.example.ex2;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        String str;
        System.out.println("What is the input string?");
        str = getString();
        System.out.print(str+ " contains " +charNum(str) +" characters.");
    }

    public static String getString()
    {
        Scanner newStr = new Scanner(System.in);
        return newStr.nextLine();
    }

    public static Integer charNum(String str)
    {
        return str.length(); // Equivalent to: Integer strLength = str.length(); return strLength;
    }
}