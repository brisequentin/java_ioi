import algorea.Scanner;

class Main{
  static Scanner entree = new Scanner(System.in);
  public static void main(String[] args){
     int lg = entree.nextInt()*16*60*60;
     System.out.print(lg);
  }
}