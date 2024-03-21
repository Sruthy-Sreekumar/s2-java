import java.util.*;
class product
{ 
 String pname;
 int pcode,price;
 product(String pname,int pcode,int price) 
{
 this.pname=pname;
 this.pcode=pcode;
 this.price=price;
}
 void display()
  {
   System.out.println("product name:"+pname+"\nproduct code:"+pcode+"\nproduct price:"+price);
  }
}
class products
{
   public static void main(String arg[])
  {
     product p1=new product("Sprint",22,100);
     product p2=new product("Marinta",23,60);
     product p3=new product("Sprite",24,50);
     System.out.println("Product with the lowest price is:");
     if(p1.price<p2.price && p1.price<p3.price)
     p1.display();
     else if(p2.price<p1.price && p2.price<p3.price)
     p2.display();
     else
     p3.display();
  }
}
 
