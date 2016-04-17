import java.util.Scanner;


public class LinearSearch {

	
	public static void main(String[] args) {
		int r,search,s=0;
		Scanner ob=new Scanner (System.in);
		System.out.println("Enter number");
		 r=ob.nextInt();
		 System.out.println("Enter elements");
		 int b[]=new int[100];
		 for(int c=0;c<r;c++)
		 {
			 b[c]=ob.nextInt();
		 }
		 System.out.println("Enter element for searching");
		 search=ob.nextInt();
		 for(int c=0;c<r;c++)
		 {
		      if (b[c] == search)  
		      {
		          System.out.println(search + " is present at location " + (c+1));
		          s=1;
		          break;

		      }
		      
		 }
		if(s!=1)
		 {
			System.out.println("The element not found"); 
		 }

	}

}
