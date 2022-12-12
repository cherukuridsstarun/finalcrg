import java.util.Scanner;
public class EllipticCurve {
	public static void main(String arg[])
	{
     float x1,y1,x2,y2,x3,y3,m,a,b;
     Scanner sc= new Scanner(System.in);
     System.out.println(" enter thee coordiantee of two points");
    		 x1=sc.nextFloat();
    		 y1=sc.nextFloat();
    		 x2=sc.nextFloat();
    		 y2=sc.nextFloat(); 
    		 a=sc.nextFloat();
    	if(x1!=x2)
    	{ m=(y1-y2)/(x1-x2);
    	
    		 x3=m*m-x1-x2;
    		 y3=-y1+m*(x1-x3);
    		 System.out.print(x3+"  "+y3);
    	}
    	else if(y1==-y2)
    	{System.out.println(" identity");
    	}
    	else if(x1==y1 && y1==y2)
    	{System.out.println(" c==b or c==a");}
    	else
    	{
    		m=(3*x1*x1+a)/(2*y1);
    		x3=m*m- 2 * x1;
    		y3= -y1+m*(x1-x3); 
    		System.out.print(x3+"  "+y3);
    	}
	}
             
}