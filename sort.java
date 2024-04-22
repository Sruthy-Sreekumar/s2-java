import java.util.*;
class  sort{
    public static void main(String args[])
    {
      int i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array:");
      int n=sc.nextInt();
      sc.nextLine();
      String[] arr=new String[n];
      int l=arr.length;
      System.out.println("Enter the elements of array:");
      for(i=0;i<l;i++)
      {
        arr[i]=sc.nextLine();
      }
      System.out.println("Array elements after sorting:");
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
    }
 }
