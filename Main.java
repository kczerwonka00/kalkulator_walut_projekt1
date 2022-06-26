import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double PLN, USD, EURO, CHC;
    int wymiana=0;
  
    Scanner sc = new Scanner (System.in);
    
   while(wymiana!=13){ 
    System.out.println("Wybierz jedną z opcji");
    System.out.println("1. PLN na $");
    System.out.println("2. PLN na €");
    System.out.println("3. PLN na CHF");
    System.out.println("4. $ na PLN");
    System.out.println("5. $ na €");
    System.out.println("6. $ na CHF");
    System.out.println("7. € na PLN");
    System.out.println("8. € na $");
    System.out.println("9. € na CHF");
    System.out.println("10. CHF na PLN");
    System.out.println("11. CHF na $");
    System.out.println("12. CHF na €");
    System.out.println("13. Wyjście z programu");
     wymiana = sc.nextInt();
   switch (wymiana){
      case 1:
        System.out.println("Podaj ilośc PLN");
        PLN = sc.nextDouble();
        if (PLN >=0){
          System.out.println(PLN + "PLN to "+PLN*0.23 +"$.");
          
        }
        else {
          System.out.println("Proszę podać właściwą sumę PLN");
        }
        break;
      case 2:
         System.out.println("Podaj ilośc PLN");
        PLN = sc.nextDouble();
        if (PLN >=0){
          System.out.println(PLN + "PLN to "+PLN*0.21 +"€.");
          
        }
        else {
          System.out.println("Proszę podać właściwą sumę PLN");
        }
        break;
      case 3:
         System.out.println("Podaj ilośc PLN");
        PLN = sc.nextDouble();
        if (PLN >=0){
          System.out.println(PLN + "PLN to "+PLN*0.22 +"CHF.");
          
        }
        else {
          System.out.println("Proszę podać właściwą sumę PLN");
        }
        break;
      case 4:
         System.out.println("Podaj ilośc dolarów");
        USD = sc.nextDouble();
        if (USD >=0){
          System.out.println(USD + "$ to "+USD*4.44 +"PLN.");
          
        }
        else {
          System.out.println("Proszę podać właściwą sumę dolarów");
        }
        break;
      case 5:
         System.out.println("Podaj ilośc dolarów");
        USD = sc.nextDouble();
        if (USD >=0){
          System.out.println(USD + "$ to "+USD*0.95 +"Euro.");
          
        }
        else {
          System.out.println("Proszę podać właściwą sumę dolarów");
        }
        break;
      case 6:
         System.out.println("Podaj ilośc dolarów");
        USD = sc.nextDouble();
        if (USD >=0){
          System.out.println(USD + "$ to "+USD*0.96 +"CHC.");
          
        }
        else {
          System.out.println("Proszę podać właściwą sumę dolarów");
        }
        break;
      case 7:
         System.out.println("Podaj ilośc euro");
        EURO = sc.nextDouble();
        if (EURO >=0){
          System.out.println(EURO + "EURO to "+EURO*4.69 +"PLN.");
          
        }
        else {
          System.out.println("Proszę podać właściwą sumę euro");
        }
        break;
      case 8:
         System.out.println("Podaj ilośc euro");
        EURO = sc.nextDouble();
        if (EURO >=0){
          System.out.println(EURO + "EURO to "+EURO*1.06 +"$.");
          
        }
        else {
          System.out.println("Proszę podać właściwą sumę euro");
        }
        break;
      case 9:
         System.out.println("Podaj ilośc euro");
        EURO = sc.nextDouble();
        if (EURO >=0){
          System.out.println(EURO + "EURO to "+EURO*1.01 +"CHC.");
          
        }
        else {
          System.out.println("Proszę podać właściwą sumę euro");
        }
        break;
      case 10:
         System.out.println("Podaj ilośc franków szwajcarskich");
        CHC = sc.nextDouble();
        if (CHC >=0){
          System.out.println(CHC + "CHC to "+CHC*4.61 +"PLN.");
          
        }
        else {
          System.out.println("Proszę podać właściwą sumę franków szwajcarskich");
        }
        break;
      case 11:
         System.out.println("Podaj ilośc franków szwajcarskich");
        CHC = sc.nextDouble();
        if (CHC >=0){
          System.out.println(CHC + "CHC to "+CHC*1.04 +"$.");
          
        }
        else {
          System.out.println("Proszę podać właściwą sumę franków szwajcarskich");
        }
        break;
      case 12:
         System.out.println("Podaj ilośc franków szwajcarskich");
        CHC = sc.nextDouble();
        if (CHC >=0){
          System.out.println(CHC + "CHC to "+CHC*0.99 +"euro.");
          
        }
        else {
          System.out.println("Proszę podać właściwą sumę franków szwajcarskich");
        }
        
    break;
     case 13:
       System.exit(0);
    break;
   }
     }
  sc.close();    
    
  }
}