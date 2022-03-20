import algorea.Scanner;
import java.util.Arrays;


class Main{
   static Scanner entree = new Scanner(System.in);
   public static void main(String[] args){
      int n = entree.nextInt();
      String[] lstring = new String[2*n];
      String[] lstringsort = new String[n];
      
      
      for (int i=0; i<n; i++){
          String francais = entree.next();
          String anglais = entree.next();
          lstring[2*i] = anglais;
          lstring[2*i+1] = francais;
          lstringsort[i] = anglais;
      }
      Arrays.sort(lstringsort); 
      
      for (String s : lstringsort){
         int indexOfboth = Arrays.asList(lstring).indexOf(s);
         System.out.println(lstring[indexOfboth]+" "+lstring[indexOfboth+1]);
      }
   }
}