/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fibnocci;

/**
 *
 * @author test
 */
public class Fibnocci {
public static void main(String[] args) {
//initializing the constants
int n = 100, t1 = 0, t2 = 1;
System.out.print("Upto " + n + ": ");
//while loop to calculate fibonacci series upto n numbers
while (t1<= n)
{
System.out.print(t1 + " + ");
int sum = t1 + t2;
t1 = t2;
t2 = sum;
}
}
}