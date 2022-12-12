import java.util.Scanner;
public class PsuedoRandom {
	public static void main(String args[])
	{   Scanner sc=new Scanner(System.in);
		int X[]=new int[5];
		int m,a,c,x0,i;
		System.out.println(" enter the m value");
		m=sc.nextInt();
		System.out.println(" enter the a the multiplier value");
		a=sc.nextInt();
		System.out.println(" enter the increment  value");
		c=sc.nextInt();
		System.out.println(" enter the starting  value");
		x0=sc.nextInt();
		X[0]=x0;
		for(i=1;i<5;i++)
			X[i]=(a*X[i-1]+c)%m;
		System.out.println("The  sequnce values are ");
		for(i=0;i<5;i++)
			System.out.println(X[i]+"      ");
		
		
	}

}