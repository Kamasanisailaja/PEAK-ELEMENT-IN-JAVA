import java.util.*;
public class Peakinteger 
{
    public static void main (String args[])
    {
        int a[]=new int[100];
        int i,j,n,temp;
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<n-1;i++)
        {
            
            if(a[i]>a[i-1]&&a[i]>a[i+1])    
            {
                 System.out.println("the peak element is "+a[i]);
            }
                
        }
    }
}
     
          
                
 
        

       
    

