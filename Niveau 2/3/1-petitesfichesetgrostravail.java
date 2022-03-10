import algorea.Scanner;

class Main{
    static Scanner entree = new Scanner(System.in);
    public static void main(String[] args){
       
       for (int i=0; i<6; i++){
          String auteur = entree.nextLine();
          String livre = entree.nextLine();
          
          System.out.println(livre);
          System.out.println(auteur);
       }
    }
}