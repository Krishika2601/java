package krishi;
import java.util.*;
public class averagearray {

	public static void main(String[] args) {
		        Scanner sc= new Scanner(System.in);
	        	System.out.println("Enter the number of subject:   ");
				int n= sc.nextInt();
				int arr[] = new int[n];
				System.out.println("Enter the marks of each subject");
				for(int i=0;i<n;i++)
				{ 
					arr[i]=sc.nextInt();
				}
				int total =0;
				for(int i=0;i<n;i++)
				{ 
					total=total+ arr[i];
				
				}
				int average =total/n;
				System.out.println("the average marks"+average);
				
					

				}

			

	}


