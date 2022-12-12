import java.io.*;

class InverseModul {

	static int modInverse(int a, int m)
	{
	
		for (int x = 1; x < m; x++)
			if (((a%m) * (x%m)) % m == 1)
				return x;
		return 1;
	}

	public static void main(String args[])
	{
		int a = 3, m = 11;
	
		System.out.println(modInverse(a, m));
	}
}