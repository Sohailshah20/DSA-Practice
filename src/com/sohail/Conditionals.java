package com.sohail;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
            System.out.println("Enter the Salary");
                int salary = input.nextInt();
                System.out.println(salary);
                if(salary>10000){
                    salary += 2500;
                    System.out.println(salary);
                }else{
                    salary += 1000;
                    System.out.println(salary);
                }
            }
        }

