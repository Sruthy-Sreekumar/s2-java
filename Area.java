import java.util.Scanner;

public class Area{


		void area(float r)
		{
			System.out.println("Area of circle is:"+3.14*r*r);
		}
	        void area(int l, int b)
		{
			System.out.println("Area of rectangle is:"+l*b);
		}
		void area(int a )
		{
			System.out.println("Area of square is:"+a*a);
		}
		

		public static void main(String[] args) {
			Area obj=new Area();
			
			System.out.println("Enter the radius of circle:");
			Scanner s=new Scanner(System.in);
			float r=s.nextFloat();
			
			obj.area(r);
			
			System.out.println("Enter the length and breadth of rectangle:");
			int l=s.nextInt();
			int b=s.nextInt();
			
			obj.area(l,b);
			
			System.out.println("Enter the side of square:");
			int a=s.nextInt();
			
			obj.area(a);
			}
			
}
