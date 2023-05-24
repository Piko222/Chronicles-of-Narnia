import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // The Introduction
        System.out.println("Welcome to the enchanting world of Narnia, a realm of magic and adventure hidden beyond the boundaries of our own world.\n");
        System.out.println();
        System.out.println("As you step through the mystical wardrobe, you find yourself surrounded by the whispering pines of the Narnian forest, the crunch of snow beneath your feet, and a chilling breeze that speaks of mysteries yet to be unveiled.\n");
        System.out.println();
        System.out.println("You soon discover that Narnia is trapped in an eternal winter, ruled by the tyrannical White Witch. Talking animals, mythical creatures, and courageous beings yearn for liberation from her icy grip. It is foretold that a group of brave heroes shall rise to challenge the Witch's reign and restore balance to the land.\n");
        System.out.println();
        System.out.println("You have been chosen to embark on this epic quest, where your decisions and actions will shape the destiny of Narnia. The fate of this wondrous realm rests in your hands.\n");
        System.out.println();
        System.out.println("Prepare to explore vast landscapes, solve intricate puzzles, and interact with unforgettable characters. Gather allies, uncover hidden artifacts, and face thrilling challenges as you navigate through treacherous paths and confront the forces of darkness. Along the way, you will discover the true power of courage, friendship, and sacrifice.\n");
        System.out.println();
        System.out.println("Remember, the White Witch's reign must be brought to an end, and the rightful ruler of Narnia must be restored. The adventure awaits. Are you ready to step forward and embrace your destiny?\n");
        System.out.println();
        System.out.println("Do you wish to continue? Enter 1 for yes and 0 for no: ");
        Scanner userInput = new Scanner(System.in);
        String option = userInput.nextLine();
        int choice = Integer.parseInt(option);
        if (choice == 1){
        System.out.println("Okay! Let's go...\n");
        }
        else{
            System.out.println("But Narnia would be sad to see you go... Bye then :(\n");
            System.exit(0);
        }
        // Narnia Suffers. The player proceeds.
        System.out.println("You find yourself exploring the outskirts of a small Narnian village. As you wander through the quaint streets, you notice an agitated crowd gathered around a notice board.\n");
        System.out.println("Curious, you approach the crowd and read the announcement posted on the board. It proclaims a reward offered by the noble King Peter for anyone who can provide information about a powerful artifact known as the 'Frostbane Crystal.'\n");
        System.out.println("Villager: You there! Are you an adventurer? We need your help! The Frostbane Crystal, said to have the power to weaken the White Witch's icy magic, has been stolen. Without it, we stand no choice against her tyranny.\n");
        System.out.println("What is your reply?" +
                "1. Where is the stolen crystal?" + "Please select the available option by pressing 1: ");
        String answer = userInput.nextLine();
        int reply = Integer.parseInt(answer);
        while (reply == 1) {
            System.out.println("Villager: Rumors point to the forest of Everfrost as the hiding place of the Frostbane Crystal. It is a treacherous and enchanted woodland, home to mythical creatures and guarded by ancient magic.\n");
            System.out.println("You understand that recovering the Frostbane Crystal is a vital step towards defeating the White Witch and restoring peace to Narnia. Will you decide to venture into the mysterious depths of Everfrost Forest, determined to retrieve the artifact and aid the villagers in their struggle? Select an answer - 1 for Yes and 2 for No: \n");
            String response = userInput.nextLine();
            int selection = Integer.parseInt(response);
            if (selection == 1) {
                System.out.println("Villager: Great! Let's go fight beside the rebels for our FREEDOM!");
            }
            else {
                System.out.println("Villager: Alright! Let's move over to the Wisdom Tree instead.");
            }
            break;
        }

    }
    }