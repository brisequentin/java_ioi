/* Sachant qu'il y a actuellement 1337 crapauds et que leur nombre double chaque semaine, votre programme devra afficher le nombre de crapauds qu'il y aura après la 12e semaine. */

class Main {
    public static void main(String[] args){
       int crapeau = 1337;
       for (int i = 1; i<=12; i++){
          crapeau = crapeau * 2;
       }
       System.out.println(crapeau);
    }
 }