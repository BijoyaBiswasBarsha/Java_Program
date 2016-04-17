import java.util.Scanner;


public class BinarySearch {

	public static void main(String[] args) {
		int r,beg,end,mid,m;
		Scanner ob=new Scanner (System.in);
		System.out.println("Enter number");
		 r=ob.nextInt();
		 System.out.println("Enter elements");
		 int b[]=new int[100];
		 for(int i=0;i<r;i++)
		 {
			 b[i]=ob.nextInt();
		 }
		 System.out.println("Enter element to search");
		 m=ob.nextInt();
		
		 beg=0;
		 end=r-1;
		 mid=(beg+end)/2;
		 while (beg <= end) {
		  if (b[mid]<m) {
	                beg= mid + 1;      }
	           else if(b[mid]==m){
	        	   System.out.println("The element found");
	        	   break;
	                     }
	           else
	        	   end=mid-1;
		  mid=(beg+end)/2;
	        }
		 if(beg>end)
			 System.out.println("The element not found");
			 
		}
	          
	
	}
			 
		




