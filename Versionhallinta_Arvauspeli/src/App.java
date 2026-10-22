import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
       
        
        Scanner lukija = new Scanner(System.in);
        int guesses = 0; 

            while (true) {
            System.out.println("Guess my name (type stop to exit)");
            String name= lukija.nextLine();
            guesses++; 

         //lisätty if lause, että jos arvaa oikein niin siitä tulee ilmoitus ja arvausten määrä ilmoitetaan   

        if (name.equalsIgnoreCase("Emma")) 
            {
            System.out.println("Congratulations!");
            System.out.println("You guessed " + guesses + " times" +".");
            break;
            }   
            
                    else if (name.equalsIgnoreCase("Stop"))
            {
                guesses--;
                System.out.println("You guessed " + guesses + " times" +".");
                break;
            }

            else {
                System.out.println("Arvasit väärin, yritä uudestaan");
            }

        }

       

  }

}
    