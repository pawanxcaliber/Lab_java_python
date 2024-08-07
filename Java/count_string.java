import java.util.*;
class java6
{
 public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Write anything ..like anythinggg:::::");
    String sentence=sc.nextLine();
    System.out.println("LOL you typed that??::   "+sentence);
    count(sentence);
   }
 static public void count(String sentence)
  {
    int count=0;
     for(int i = 0; i < sentence.length(); i++) 
        {    
            if(sentence.charAt(i) != ' ')    
                count++;    
        }    
          
          
       System.out.println("NO.of chareacters issss ..wait for it..:: " +count);    
     }
  }
  

   
