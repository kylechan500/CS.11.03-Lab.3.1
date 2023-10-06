import java.util.Scanner;

// 2 roads
// 1 leads to death the other one leads to a volcano
// pour water on volcano
// jump in the volcano
//(pour water) volcano reacts with the water and the whole mountain explode (U DIE)
//(jump in the volcano) u see batman
// talk to batman
// or run away
// (talk to batman) he kills you
// (run away) u live and happy
public class AdventureGame {
    public static void main(String[] args) {
        intro();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        boolean chosenPath1 = false;
        while (!chosenPath1) {
            if (choice == 1) {
                //say whatever happens in path 1
                die();
            } else if (choice == 2) {
                //say what happens in 2
                System.out.println("Damn! You survived. But you are facing a massive super-volcano right now.");
                System.out.println(".  .  .");
                System.out.println("Option 1: Pour water on the volcano!");
                System.out.println("Option 2: Jump into the volcano!");
                choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("You stupid boy! The volcano reacted with the water and it exploded.");
                    die();
                }
                else if (choice == 2) {
                    System.out.println("You fall through the lava");
                    System.out.println("BAM");
                    System.out.println("You land in a massive bat-cave and stare straight at BATMAN");
                    System.out.println("Option 1: You approach Batman to talk to him.");
                    System.out.println("Option 2: You run away, like a scaredy cat.");
                    choice = scanner.nextInt();
                    if (choice == 1) {
                        System.out.println("Batman has a request.");
                        math();
                        System.out.println("Batman thinks you are smart! He has adopted you as his son.");
                        System.out.println("Batman: Kill Robin to fulfill your mission");
                        System.out.println("Option 1: Kill Robin.");
                        System.out.println("Option 2: Reject Batman's offer.");
                        choice = scanner.nextInt();
                        if (choice == 1){
                            System.out.println("Beat Robin at some Math, and you kill him.");
                            System.out.println("What is 2 + 3 * 5 - 6 ");
                            choice = scanner.nextInt();
                            if (choice == 3 * 5 +2 - 6){
                                System.out.println("You beat Robin! Batman has now adopted you.");
                                end();
                            }
                        else if (choice == 2){
                                System.out.println("Batman didn't like that, he chases after you.");
                                die();
                            }
                        }


                    }
                    else if (choice == 2) {
                        System.out.println("You started running. Batman chases after you, but you got on his bike and ride away. \nCongratulations, you won the game! ");
                        System.exit(0);
                    }

                    chosenPath1 = true;
                } else {
                    //if user inputted stuff like 1328123 then it will go here so tell them to pick again
                    System.out.println("Pick an actual option.  ");
                }
            }
        }

    }
    public static void intro() {
        System.out.println("Hello big mans! Choose your path (1 or 2).");
    }
    public static void choice1() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        boolean chosenPath = false;
        while (!chosenPath) {
            if (choice == 1) {
                die();
            }
            else if (choice == 2) {
                chosenPath = true;
            }
            else {
                System.out.println("Choose an actual option. ");
            }
        }
    }


    public static void die() {
        System.out.println("You have died. ");
        System.exit(0);
    }
    public static void math(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a odd number");
        int number = scanner.nextInt();
        if (number % 2 == 1){
            System.out.println("Good job!");
        }
        System.out.println("You succeeded. ");

    }
    public static void end(){
        System.exit(0);
    }

}

