# Even
import java.io.*;
import java.util.*;
import java.lang.*;
public class Even
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=sc.nextInt();
    for(int j=n;j<i;j++){
      if(j%2==0)
      {
        System.out.println("The numbers are:"+j);             
      }
      
    }
  }
}
