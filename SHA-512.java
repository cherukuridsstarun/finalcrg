import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.math.*;

 class SHA512 {
	public static String encryptThisString(String input)
	{
		try {
			// getInstance() method is called with algorithm SHA-512
			MessageDigest md = MessageDigest.getInstance("SHA-512");

			// digest() method is called
			// to calculate message digest of the input string
			// returned as array of byte
			byte[] messageDigest = md.digest(input.getBytes());

			// Convert byte array into signum representation
			BigInteger no = new BigInteger(1, messageDigest);

			// Convert message digest into hex value
			String hashtext = no.toString(16);

			// Add preceding 0s to make it 32 bit
			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}

			// return the HashText
			return hashtext;
		}

		// For specifying wrong message digest algorithms
		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	// Driver code
	SHA512() 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter text of your choice ");
        String s=sc.nextLine();
		System.out.println("HashCode Generated by SHA-512 for: ");

		String s1 = "tarun";
		System.out.println("\n" + s + " : " + encryptThisString(s1));

	 
	}
}
class Main
{ public static void main(String args[])

  { SHA512 obj=new SHA512();
  }
    
}