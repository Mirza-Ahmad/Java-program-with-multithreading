/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;
/**
 *
 * @author Mirza ahmad
 */
import java.util.Scanner;
class NewClass 
{
private int a,b;
public void Newclass()
{
 System.out.println("Hello Mirza Ahmad");
}
public void Newclass(int c, int n)
{
a=c;
b=n;
System.out.println("a="+ a+ " "+"b ="+b);
}
public void get()
{
Scanner is=new Scanner(System.in);
int w,q,v;
System.out.println("Enter a first number:");
w=is.nextInt();
System.out.println("Enter a second number:");
q=is.nextInt();
v=w+q;
System.out.println("The sum of two number is = " +v);
}
}