package vasanth;

//import java.util.*;
import java.io.*;

public class ExceptionHandling {
	public static void main(String...args)throws Exception {
		int n=0;
		BufferedReader br=null;
		System.out.println("Enter a number : ");
		try {
			br=new BufferedReader(new InputStreamReader(System.in));
			n=Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.err.println("Error input : Please Understand the code bro!");
		}
		finally {
			System.out.println(n);
		}
	}
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 */





/*Scanner sc=new Scanner(System.in);
try {
	int i=sc.nextInt();
	int j=sc.nextInt();
	int k=i/j;
	System.out.println("Output is "+k);
}
catch(Exception e){
	System.err.println("Oops!It's a critical statement buddy");
}
finally {
	System.out.println("You can really dance ><");
}*/