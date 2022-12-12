import java.util.Scanner;
public class Playfair {

	public static void main(String args[])
	{  Scanner sc=new Scanner(System.in);
		String kw=sc.next();
		String pt;
		char mat[]=new char[25];
		char matrix[][]=new char[5][5];
		int l,i,j,k,r1=0,r2=0,c1=0,c2=0;
		char c;
		
		mat[0]=kw.charAt(0);
		l=1;
		for(i=1;i<kw.length();i++)
		{System.out.println(kw.charAt(i));
		 for(j=0;j<l;j++)
			 if (mat[j]==kw.charAt(i))
				 break;
		 if (j==l)
			 {mat[j]=kw.charAt(i);l++;}
			 
		}
		for(c='A';c<91;c++)
			
			{
			 if(c=='I')
				 continue;
			 for(j=0;j<l;j++)
				 if (mat[j]==c)
					 break;
			 if (j==l)
				 {mat[j]=c;l++;}
				 
			 
			}
		for(j=0;j<25;j++)
			System.out.print(mat[j]+"   ");
		k=0;
		for(i=0;i<5;i++)
			for(j=0;j<5;j++)
			{matrix[i][j]=mat[k++];}
		for(i=0;i<5;i++) 
		{
			
		  System.out.println();
			for(j=0;j<5;j++)
			 System.out.print(matrix[i][j]+"  ");
		}
		System.out.println("enter the plain text");
		pt=sc.next();
		char dg[]=new char[25];
		char ct[]=new char[25];
		dg[0]=pt.charAt(0);
		dg[1]=pt.charAt(1);
		for(i=0;i<25;i++)
			if(mat[i]==dg[0])
			{r1=i/5;c1=i%5;}
		for(i=0;i<25;i++)
			if(mat[i]==dg[1])
			{r2=i/5;c2=i%5;}
		if(r1==r2)
			{ct[0]=matrix[r1][(c1+1)%5];
		    ct[1]=matrix[r1][(c2+1)%5];}
		else if(c1==c2)
		{ct[0]=matrix[(r1+1)%5][c1];
	    ct[1]=matrix[(r2+1)%5][c2];}
		else 
		{ct[0]=matrix[r2][c1];
	    ct[1]=matrix[r1][c2];}	
		System.out.println(ct[0]+"  "+ct[1]);
	 }
	}