package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();

        String str1 = str.replaceAll(" ", "");
        System.out.println("Ваша строка без пробелов:\n" + str1);
        in.close();
    }
}