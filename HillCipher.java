import java.util.Scanner;
public class HillCipher {
	static int keyMat[][]=new int[3][3];
	static void readKeyMatrix()
	{Scanner sc=new Scanner (System.in);
		int i,j;
	   for(i=0;i<3;i++)
		   for(j=0;j<3;j++)
	         keyMat[i][j]=sc.nextInt();
		
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner (System.in);
		String pt;
		System.out.print("enter the plain txt" );
	    pt=sc.next();
		int  i,l,m,ex;
		l=pt.length();
		
		System.out.print(" enter how many characters ? ");
		m=sc.nextInt();
		ex=l%m;
		int a[]=new int[l+ex];
		for(i=0;i<l;i++)
			 a[i]=(int)pt.charAt(i)-65;
		// filling extra values
		for(;i<l+ex;i++)
			a[i]=90;
		for(i=0;i<l+ex;i++)
			System.out.println(a[i]+"  ");
		// multiplication part ciphertext
		readKeyMatrix();
		int j,k;
		int p[][]=new int[m][1];
		int c[][]=new int[m][1];
		for(i=0;i<3;i++)
			p[i][0]=a[i];
		for(i=0;i<3;i++)
			for(j=0;j<1;j++)
			{c[i][j]=0;
			  for(k=0;k<3;k++)
				  c[i][j]+=keyMat[i][k]*p[k][j];
			 	 
			}
		for(int n=0;n<3;n++)
			 System.out.println((char)(c[n][0]%26+65));
			
		
			
	}

}