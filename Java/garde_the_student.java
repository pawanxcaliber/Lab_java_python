
import java.util.Scanner;
import java.util.*;
class java5
{
  public static void main(String args[])
  {
  int n;
  Scanner sc= new Scanner(System.in);
  System.out.println("Number of marks you wanna enter (MAX number is 10)::");
  n=sc.nextInt();
  int[] marks=new int[10];
  for (int i=0;i<n;i++)
     {
      marks[i]=sc.nextInt();
     }
  float total=0,average;
  for (int i=0;i<marks.length;i++)
     {
          total=total+marks[i];
     }
  average=total/6;
  System.out.print("Total Marks="+total);
  System.out.print("Total Average="+average);
  
  if(average>=80)
    { 
      System.out.println("its an A");
    }
  else if(average>=60)
    { 
      System.out.println("its a B");
    }
  else if(average>=40)
    { 
      System.out.println("its a C");
    } 
  else
    { 
      System.out.println("its a B");
    }
 }
}
  
