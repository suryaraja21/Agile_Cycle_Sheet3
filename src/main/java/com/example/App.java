package com.example;

import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();
        char grade = grade(marks);
        System.out.println("The grade is: " + grade);
    }
    public static char grade(int marks){
        if(marks >= 90){
            return 'A';
        } else if(marks >= 80){
            return 'B';
        } else if(marks >= 70){
            return 'C'  ;
        } else if(marks >= 60){
            return 'D';
        } else {
            return 'F';
        }
    }
}
