import java.util.*;
class complex
{
 public static void main(String ara[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the real and imaginary part of first complex number:");
 int a=sc.nextInt();
 int b=sc.nextInt();
 System.out.println("Enter the real and imaginary part of second complex number:");
 int c=sc.nextInt();
 int d=sc.nextInt();
 System.out.println("Complex numbers are:\n"+a+"+"+b+"i"+"and"+c+"+"+d+"i");
 int p=a+c;
 int f=b+d;
 System.out.println("Added complex number is:"+p+"+"+f+"i");
}
}
