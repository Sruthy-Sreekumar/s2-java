import java.util.*;
class search{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int flag=0;
    System.out.println("enter the size of array:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter the array elements:");
    int i;
    for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("enter the element to search:");
    int s=sc.nextInt();
    for(i=0;i<n;i++)
    {
      if(arr[i]==s)
      {
        flag=1;
      }
      else
      {
        flag=0;
      }
    }
    if(flag==1)
    {
       System.out.println("element  found");
    }
    else
     System.out.println("element not found");    
  }
}
	

