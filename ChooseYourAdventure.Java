import java.util.Scanner;

public class ChooseYourAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Introduction
        System.out.println("Welcome to the Haunted House Adventure!");
        System.out.println("You find yourself at the entrance of a creepy, old mansion. Do you dare to enter?");
        
        // Track choices with boolean variables
        boolean hasLantern = false; // Player's choice to take or leave a lantern
        boolean foundKey = false;   // Player's choice to search for a key
        boolean ghostEncounter = false; // Indicates if player encounters a ghost

        // First choice: Enter the mansion or leave
        System.out.println("Do you enter the mansion? (yes/no)");
        String choice1 = scanner.nextLine();
        
        if (choice1.equalsIgnoreCase("yes")) {
            System.out.println("You step inside the dark mansion. You see a lantern on a table.");

            // Second choice: Take the lantern or leave it
            System.out.println("Do you take the lantern? (yes/no)");
            String choice2 = scanner.nextLine();
            if (choice2.equalsIgnoreCase("yes")) {
                hasLantern = true;
                System.out.println("You picked up the lantern. This will help you see in the dark.");
            } else {
                System.out.println("You decide to leave the lantern. It might get dark later...");
            }

            // Third choice: Go left or right
            System.out.println("You reach a hallway with two doors. Do you go left or right? (left/right)");
            String choice3 = scanner.nextLine();
            if (choice3.equalsIgnoreCase("left")) {
                System.out.println("You enter a dusty library. There's an old, locked chest here.");

                // Nested choice based on having a key
                System.out.println("Do you want to search for a key in the room? (yes/no)");
                String choice4 = scanner.nextLine();
                if (choice4.equalsIgnoreCase("yes")) {
                    foundKey = true;
                    System.out.println("You found a key hidden under a dusty book!");
                }

                // Check if player has the key
                if (foundKey) {
                    System.out.println("You unlock the chest and find a hidden treasure! You win!");
                } else {
                    System.out.println("The chest remains locked. Maybe there's a key somewhere.");
                }
                
            } else if (choice3.equalsIgnoreCase("right")) {
                System.out.println("You enter a dark room and hear a faint whisper... A ghost appears!");

                // Ghost encounter decision based on lantern
                if (hasLantern) {
                    System.out.println("You hold up your lantern, and the ghost vanishes in the light. You safely leave the room.");
                } else {
                    ghostEncounter = true;
                    System.out.println("Without a light source, you stumble and the ghost gets closer... You run out of the room in fear!");
                }
            }

            // End of adventure
            if (ghostEncounter) {
                System.out.println("You escaped the ghost but feel like you missed out on the mystery. Maybe try again?");
            } else {
                System.out.println("Congratulations on making it through the haunted house adventure!");
            }

        } else {
            System.out.println("You decide not to enter the mansion. Maybe another day...");
        }

        scanner.close();
    }
}
