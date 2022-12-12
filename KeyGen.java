import java.util.*;
class keygen{
 public static void main(String args[]){
    int i;
   Scanner sc=new Scanner(System.in);
    int key[]=new int[10];
  System.out.println("enteer key number :");
   for(i=0;i<key.length;i++){
    key[i]=sc.nextInt();
    }
    int p10[]=new int[10];
      p10[0]=key[2];
        p10[1]=key[4];
       p10[2]=key[1];
        p10[3]=key[6];
        p10[4]=key[3];
         p10[5]=key[9];
         p10[6]=key[0];
         p10[7]=key[8];
          p10[8]=key[7];
           p10[9]=key[5];
           System.out.println("p10 is ");
      for(int k=0;k<key.length;k++)
        System.out.print(""+p10[k]);
        int L11[]=new int[5];
        L11[0]=p10[1];
        L11[1]=p10[2];
        L11[2]=p10[3];
        L11[3]=p10[4];
        L11[4]=p10[0];
         System.out.println("\n    ");
        int L12[]=new int[5];
        L12[0]=p10[6];
        L12[1]=p10[7];
        L12[2]=p10[8];
        L12[3]=p10[9];
        L12[4]=p10[5];
         
        System.out.println("L11=");
        for(int j=0;j<L11.length;j++){
            System.out.print(""+L11[j]);
           
        }
          System.out.println("\n L12=");
           for(int j=0;j<L12.length;j++){
           System.out.print(""+L12[j]);
           
        } 
            System.out.println("\n ");
            
            int p81[]=new int[8];
            p81[0]=L12[0];
            p81[1]=L11[2];
            p81[2]=L12[2];
            p81[3]=L11[3];
            p81[4]=L12[2];
            p81[5]=L11[4];
            p81[6]=L12[4];
            p81[7]=L12[3];
  System.out.println("the firstkey is ");
        for(int j=0;j<p81.length;j++){
            System.out.print(""+p81[j]);
        }
          System.out.println("\n ");
        int L21[]=new int[5];
        L21[0]=L11[2];
         L21[1]=L11[3];
          L21[2]=L11[4];
           L21[3]=L11[0];
            L21[4]=L11[1];
            int L22[]=new int[5];
            L22[0]=L12[2];
            L22[1]=L12[3];
            L22[2]=L12[4];
            L22[3]=L12[0];
            L22[4]=L12[1];
            System.out.print("\n L21==");
            for(int j=0;j<L21.length;j++){
                System.out.print(L21[j]);
            }
            System.out.println("\n ");
             System.out.println("L22==");
              for(int j=0;j<L22.length;j++){
                System.out.print(L22[j]);
            }
            int p82[]=new int[8];
            p82[0]=L22[0];
            p82[1]=L21[2];
            p82[2]=L22[2];
            p82[3]=L21[3];
            p82[4]=L22[2];
            p82[5]=L21[4];
            p82[6]=L22[4];
            p82[7]=L22[3];
            System.out.println(" \n   ");
            System.out.println("\n the second key is  P82==");
      for(int j=0;j<p82.length;j++){
          System.out.print(""+p82[j]);
      }
}}