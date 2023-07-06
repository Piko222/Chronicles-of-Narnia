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
        boolean hasAmulet = false;
        boolean betrayal;
        String deciding;
        int player_decision;
        System.out.println("Do you wish to continue? Enter 1 for yes and 0 for no: \n");
        Scanner userInput = new Scanner(System.in);
        String option = userInput.nextLine();
        int choice = Integer.parseInt(option);
        System.out.println();
        System.out.println("Please enter your preferred name: \n");
        String name = userInput.nextLine();
        if (choice == 1) {
            System.out.println("Okay! Let's go " + name);
        } else {
            System.out.println("But Narnia would be sad to see you go... Bye then :(\n" + name);
            System.exit(0);
        }
        // Narnia Suffers. The player proceeds.
        System.out.println("You find yourself exploring the outskirts of a small Narnian village. As you wander through the quaint streets, you notice an agitated crowd gathered around a notice board.\n");
        System.out.println();
        System.out.println("Curious, you approach the crowd and read the announcement posted on the board. It proclaims a reward offered by the noble King Peter for anyone who can provide information about a powerful artifact known as the 'Frostbane Crystal.'\n");
        System.out.println();
        System.out.println("Villager: You there! Are you an adventurer? We need your help! The Frostbane Crystal, said to have the power to weaken the White Witch's icy magic, has been stolen. Without it, we stand no choice against her tyranny.\n");
        System.out.println();
        System.out.println("What is your reply?\n");
        System.out.println("1. Where is the stolen crystal?" + " Please select the available option by pressing 1: ");
        String answer = userInput.nextLine();
        int reply = Integer.parseInt(answer);
        while (reply == 1) {
            System.out.println();
            System.out.println("Villager: Rumors point to the forest of Everfrost as the hiding place of the Frostbane Crystal. It is a treacherous and enchanted woodland, home to mythical creatures and guarded by ancient magic.\n");
            System.out.println();
            System.out.println("You understand that recovering the Frostbane Crystal is a vital step towards defeating the White Witch and restoring peace to Narnia. Will you decide to venture into the mysterious depths of Everfrost Forest, determined to retrieve the artifact and aid the villagers in their struggle? Select an answer - 1 for Yes and 2 for No: \n");
            String response = userInput.nextLine();
            int selection = Integer.parseInt(response);
            if (selection == 1) {
                System.out.println();
                System.out.println("Villager: Great! Let's go fight beside the rebels for our FREEDOM!");
                // Fight beside the rebels. You go with the Villager to join the rebels.
                System.out.println();
                System.out.println("As you venture through the Winter's Veil Forest, you encounter a group of woodland creatures who have fallen victim to the White Witch's icy grip. The creatures are frozen in place, their expressions frozen in fear and despair.");
                System.out.println();
                System.out.println("Your response: " + " Please enter 1 to select the option below: \n");
                System.out.println();
                System.out.println(" 1. I must stop the White Witch.");
                String comment = userInput.nextLine();
                int speech = Integer.parseInt(comment);
                if (speech == 1) {
                    System.out.println();
                    System.out.println("I feel so bad for all these creatures here. They look and must be feeling so helpless. It makes me really angry that they are like this. I have to stop the White Witch for the sake of Narnia and for these innocent creatures' sake. The White Witch must be thrown in prison.\n");
                    System.out.println();
                    System.out.println("You hear a distant cry for help all of a sudden. You follow the sound, stumbling upon a small clearing where you witness the White Witch's forces terrorizing a group of Narnian rebels.\n");
                    System.out.println();
                    System.out.println("Rebel Leader: We can't hold out much longer! The Witch's minions are relentless!\n");
                    System.out.println();
                    System.out.println("Your response: " + "Please enter 1 to select the option below: \n");
                    System.out.println();
                    System.out.println(" 1. This reign of cruelty and oppression has to stop. I need to step in now.\n");
                    String reaction = userInput.nextLine();
                    int agree = Integer.parseInt(reaction);
                    if (agree == 1) {
                        System.out.println();
                        System.out.println("You exchange determined glances, silently agreeing that you cannot stand idly by while Narnia suffers. It is time to rally your allies, organize a resistance, and confront the White Witch in a decisive battle.\n");
                        System.out.println();
                        System.out.println("Your response: Let's do this!\n");
                        System.out.println();
                        System.out.println("You rush to aid the rebels, fighting side by side with your newfound allies. Your bravery and skill in the battle inspire hope among the rebels, and together you manage to repel the Witch's forces.\n");
                        System.out.println();
                        System.out.println("With the battle won, you and the rebels gather in the aftermath, reflecting on the cost of the Witch's tyranny and the importance of their cause. You share a resolute determination to continue the fight, vowing to assemble an army to challenge the White Witch head-on.\n");
                        System.out.println();
                    } else {
                        continue;
                    }
                }

            } else {
                // The Wisdom Tree. The Villager takes you on a tour round Narnia.
                System.out.println();
                System.out.println("Villager: Alright! Let's move over to the Wisdom Tree instead.\n");
                System.out.println();
                System.out.println("Because you feel uncertain about the risks involved and question your abilities to undertake such a task, you hesitate to embark on the search for the Frostbane Crystal despite the villager's pleas. You decide to continue your exploration of Narnia in the hopes of finding an alternative solution.\n");
                System.out.println();
                System.out.println("As you journey deeper into the Narnian wilderness, you come across a serene glade where a magnificent and ancient tree stands tall. This tree, known as The Wisdom Tree, is said to possess profound knowledge and offer guidance to those who seek it.\n");
                System.out.println();
                System.out.println("Your response: " + " Please enter 1 to select the option below: \n");
                System.out.println(" 1. Wow! So this is The legendary Wisdom Tree?\n");
                String your_take = userInput.nextLine();
                int remark = Integer.parseInt(your_take);
                if (remark == 1) {
                    System.out.println();
                    System.out.println("Your words: Dear Wisdom Tree, *bows* Greetings. I am here to humbly express my doubts as to how I must defeat the White Witch, retrieving the Frostbane Crystal and restoring peace to Narnia. If I must be honest, I do not think I have the full capability to pull off such exploit. Therefore, I plead for your guidance on how I could accomplish this mission successfully.\n");
                    System.out.println();
                    System.out.println("The Wisdom Tree senses your sincerity and recognizes the urgency of your quest. It responds in a deep and resonating voice.\n");
                    System.out.println();
                    System.out.println("The Wisdom Tree: Child of Narnia, the path you seek may not lie in the search for the Frostbane Crystal alone. The true strength to face the White Witch resides within the unity and resilience of Narnia's diverse inhabitants. Seek out those who have been touched by her tyranny and listen to their stories. Unite the hearts of Narnia, and a new path shall be revealed.\n");
                    System.out.println();
                    System.out.println("Your thoughts: You are struck by the profound words of the Wisdom Tree. You realize that your initial focus on acquiring the Frostbane Crystal was limited, and true victory against the White Witch lies in rallying the oppressed, fostering unity, and igniting hope among Narnians.\n");
                    System.out.println();
                    System.out.println("You bow in Thanks and reverence to The Wisdom Tree. Determined and inspired, you set out on a new mission: to uncover the tales of those affected by the Witch's rule, build alliances, and ignite a spark of resistance within the hearts of Narnians.\n");
                    System.out.println();
                } else {
                    continue;
                }
            }
            break;
        }
        // To fight or not to fight.
        System.out.println("You now have a full understanding of the struggles the inhabitants of Narnia face and the dire need for change. Now it's up to you to decide, how will you address this situation? Please, enter 1 for Option 1 and enter 2 for Option 2: ");
        System.out.println();
        System.out.println(" 1. Gather Allies and forces and fight the White Witch.");
        System.out.println();
        System.out.println(" 2. Seek to broker peace between the White Witch and the rest of Narnia.");
        String your_choice = userInput.nextLine();
        int your_decision = Integer.parseInt(your_choice);

        if (your_decision == 1) {
            System.out.println();
            System.out.println("Your response: Alright! Let's go gather the Allies and forces. We'll fight and defeat the White Witch, gain our freedom and peace!");
            System.out.println();
            System.out.println("Professor Alden (an ally and a wise Narnian): I know something we really need to win this battle. It is an artefact... not just an ordinary artefact, but a magical one and it's called The Amulet of Thawing. The Amulet of Thawing can change the tide of the battle and grant us victory. It possesses the ability to restore life and vitality to frozen or withered elements of Narnia. It can also reverse the effects of the White Witch's eternal winter, gradually melting away the ice and bringing back the beauty and vibrancy of the land. The Amulet of Thawing can also weaken the White Witch's powers, making her more vulnerable to attacks. It disrupts the source of her magic and diminishes her control over ice and cold.\n");
            System.out.println();
            System.out.println("Your response: Cool! Let's find the artefact then...\n");
            System.out.println();
            System.out.println("As you follow the advice of the wise Narnian allies, you venture deep into the heart of the frozen wilderness. The path is fraught with peril, with icy winds howling and blinding snowstorms threatening to obscure your way. The landscape is a frozen expanse, where shimmering ice crystals glisten like diamonds under the pale sunlight.\n");
            System.out.println();
            System.out.println("After enduring a series of challenging trials, such as navigating treacherous icy slopes, traversing frozen ravines, and overcoming frosty guardians, you finally reach the foot of the Frostpeak Citadel. The fortress stands as a solitary sentinel against the relentless winter, its imposing walls coated in the thick layers of ice, creating an ethereal and formidable sight.\n");
            System.out.println();
            System.out.println("To reach the Amulet of Thawing hidden within, you must ascend the frost-bitten steps carved into the mountainside, braving biting winds and numbing temperatures. Along the way, you encounter intricate ice sculptures and frozen puzzles that test your wits and determination.\n");
            System.out.println();
            System.out.println("Upon reaching the summit, you find yourself standing before the Citadel's grand entrance - an immense door carved from solid ice, adorned with intricate frost motifs. The door, enchanted to only open to those who solve the riddle guarding the amulet. A rumbling voice asks you a riddle, the answer of which will show you are deserving and grant you entrance to the amulet.\n");
            System.out.println();
            System.out.println("Rumbling voice: I am a fire without heat, a cold flame that does not burn. I can conquer the strongest fortress, yet my touch is gentle. What am I? \n");
            System.out.println();
            System.out.println("A. Love\n");
            System.out.println("B. Ice\n");
            System.out.println("C. Time\n");
            System.out.println("D. Music\n");
            System.out.println();
            System.out.println("Your response: " + " Please choose/enter a letter for your answer, A, B, C, or D: \n");
            String correct_answer = "B";
            String user_answer = userInput.nextLine();
            if (user_answer.equalsIgnoreCase(correct_answer)) {
                System.out.println();
                System.out.println("Rumbling voice: Correct! You are worthy. You may go in now!\n");
                System.out.println();
                System.out.println("The massive ice door groans and cracks open, granting you entry into the heart of the Frostpeak Citadel. Within lies a chamber bathed in a soft, pulsating glow, revealing the coveted Amulet of Thawing resting atop a pedestal of shimmering ice crystals. You approach, your breath visible in the frigid air, as you reach out to claim the Amulet of Thawing - a symbol of hope and the key to countering the White Witch's icy dominion over Narnia.\n");
                System.out.println();
                hasAmulet = true;
                System.out.println("To solve Narnia's plight with your newfound artefact, you have two options: \n");
                System.out.println();
                System.out.println(
                        "Option 1: Diplomatic approach - You and your allies gather and meet the White Witch to find a middle ground.\n");
                System.out.println();
                System.out.println(
                        "Option 2: Solo Diplomacy - You go to meet the White Witch alone with hopes that you can appeal to her remaining humanity.\n");
                System.out.println();
                System.out.println("Please, choose wisely. What option, enter 1 for Option 1 and 2 for Option 2: \n");
                String take = userInput.nextLine();
                int user_choice = Integer.parseInt(take);
                if (user_choice == 1) {
                    System.out.println();
                    System.out.println(
                            "You: As I contemplate my approach to the White Witch, I can't shake the feeling that I shouldn't face her alone. I have fought alongside my allies throughout this journey, and their support has been invaluable. Seeking guidance, I turn to a wise and trusted friend, the courageous and loyal badger, Bramble.\n");
                    System.out.println();
                    System.out.println(
                            "You: Bramble, I have chosen the path of diplomacy to engage the White Witch, but I'm hesitant to face her alone. What if she refuses to listen or turns hostile? Should I go with my allies by my side?\n");
                    System.out.println();
                    System.out.println(
                            "Bramble: *The steadfast Badger regards me with a knowing gaze, his voice filled with wisdom.* Dear friend, your allies have stood beside you through thick and thin. Their loyalty and strength will bolster your cause and provide a united front. Together, you can face any challenge that comes your way. Trust in the power of unity and let your allies join you in this crucial endeavour.\n");
                    System.out.println();
                    System.out.println(
                            "Your response: *Bramble's words strike a chord within you. The journey has forged deep bonds of friendship, and I realize that facing the White Witch with my allies by my side is not only practical but also symbolic.* Thank you, Bramble. I am going to gather my trusted companions because I know that their presence will strengthen our message and increase our chances of success.\n");
                    System.out.println();
                    System.out.println("Bramble: *nods in agreement*\n");
                    System.out.println();
                    System.out.println(
                            "You set up a meeting with the White Witch at The Stone Table. The following conversation ensues.\n");
                    System.out.println();
                    System.out.println(
                            "You: White Witch, I stand before you today to extend an offer of peace. The battles we have fought have brought nothing but suffering and despair. Let us put an end to this cycle of violence and find a way to coexist in harmony.\n");
                    System.out.println();
                    System.out.println(
                            "White Witch: (Eyes narrowed with suspicion) Peace, you say? Why should I believe your words, mere mortal? You and your kind have defied me time and time again. What guarantee do I have that this isn't some ploy?\n");
                    System.out.println();
                    System.out.println(
                            "You: I understand your doubts. White Witch, and I cannot erase the past. But I come to you sincerely, seeking a path that avoids further bloodshed. Look into your heart, and you will see the weariness of perpetual conflict. Let us find common ground and forge a future where both Narnians and your reign can exist without enmity.\n");
                    System.out.println();
                    System.out.println(
                            "White Witch: (Contemplative silence follows as the White Witch ponders the player's words). You speak of coexistence, of a future free from strife. But what assurance can you provide that your allies won't turn against me once more? Why should I trust your intentions?\n");
                    System.out.println();
                    System.out.println(
                            "You: I offer you my word, White Witch. I pledge to uphold the terms of any agreement we reach, and I will work tirelessly to foster understanding and maintain peace among all Narnians. I cannot control the actions of others, but I can assure you of my commitment to a lasting resolution.\n");
                    System.out.println("Does the White Witch accept this offer of peace? Please select 1 for yes and 0 for no: \n");
                    String path = userInput.nextLine();
                    int your_thoughts = Integer.parseInt(path);
                    if (your_thoughts == 1) {
                        System.out.println();
                        System.out.println(
                                "White Witch: (Pausing, her expression softening slightly) A lasting resolution... It is an enticing prospect. Very well, player, I will entertain this notion of peace. But know that I do so with caution. Should you or your allies betray me, there will be dire consequences.\n");
                        System.out.println();
                        System.out.println(
                                "You: I appreciate your willingness to consider the path of peace, White Witch. Let us set aside our grievances and strive for a future where both sides can flourish. Together, we can bring an end to this era of conflict and bring a new dawn for Narnia.\n");
                        System.out.println();
                    } else {
                        System.out.println(
                                "The White Witch has refused your offer for peace. She is enraged by your request and so she attacks!\n");
                        System.out.println();
                        System.out.println(
                                "As the White Witch ruthlessly rejects the player's offer of peace, she reveals her true intentions and decides to unleash her full power upon you and all your allies. In a cruel and devastating turn of events, she employs her icy magic to imprison everyone in a frozen prison, leaving them helpless and trapped within a frigid, icy landscape.\n");
                        System.out.println();
                        System.out.println(
                                "Defeat is near... As the White Witch's decision becomes apparent, the air grows colder, and a sense of impending doom settles over the battlefield. The sky darkens, and a bone-chilling wind whips through the area, carrying with it the White Witch's malevolent presence.\n");
                        System.out.println();
                        System.out.println(
                                "With a wave of her hand, the White Witch conjures a swirling vortex of icy energy. The vortex expands rapidly, engulfing you, your allies, and everything in its path. The biting cold cuts through your armor, freezing the ground beneath your feet and encasing you all in a solid wall of ice.\n");
                        System.out.println();
                        System.out.println(
                                "You are now surrounded by an icy prison and you try to summon your strength and break free. Desperate attempts to shatter the ice prove futile, as the White Witch's magic is overpowering. The more you struggle, the more the ice constricts, making it impossible to move or escape.\n");
                        System.out.println();
                        System.out.println(
                                "As time passes, you and your allies remain trapped in the frozen prison, your bodies immobilized and your spirits slowly fading. The cold saps your strength, and despair begins to take hold.\n");
                        System.out.println();
                        System.out.println(
                                "The White Witch, reveling in her victory, taunts you and your captured allies, relishing in your helplessness. She leaves you imprisoned as a symbol of her dominance, a reminder to any who dare challenge her reign. Your defeat is complete, and the White Witch's icy grip tightens hold on Narnia. THE END.\n");
                        System.exit(0);
                    }

                } else {
                    System.out.println();
                    System.out.println(
                            "You: (in your deep thoughts) As you prepare to approach the White Witch alone, you can't help but consider the possibility that she may respond with hostility instead of engaging in a peaceful dialogue. It's crucial to be prepared for any outcome. You decide to seek counsel from a trusted Narnian ally, the wise Centaur, Arion.\n");
                    System.out.println();
                    System.out.println(
                            "You: Arion, I have chosen the path of solo diplomacy, but I can't ignore the potential danger that lies ahead. What if the White Witch refuses to negotiate and turns aggressive? I need to be ready to protect myself and secure victory if words fail. What do you suggest I do?\n");
                    System.out.println();
                    System.out.println(
                            "Arion: (ponders for a moment, his eyes filled with concern) My dear friend, while diplomacy is commendable, the White Witch is known for her treachery. You must prepare for the worst. Consider an ambush strategy.\n");
                    System.out.println();
                    System.out.println("You: (the ambush strategy seems like a cool idea to you) Tell me more, Arion.\n");
                    System.out.println();
                    System.out.println(
                            "Arion: Indeed. Set a trap, gathering your most skilled fighters and placing them strategically near the location of your intended dialogue. Conceal them amidst the natural surroundings of Narnia, ready to strike at a moment's notice. If the White Witch reveals her true intentions, your allies can swiftly join the fray, catching her off guard and providing you with a chance of victory.\n");
                    System.out.println();
                    System.out.println(
                            "You: (contemplates Arion's advice) I see what you're saying. It's a brilliant idea. Though it is difficult, I now understand the need to be prepared for the worst-case scenario. And it is with a heavy heart that I agree to pursue this ambush strategy. I promise to use it only if all peaceful avenues have been exhausted.\n");
                    System.out.println();
                    System.out.println("The Narnians then prepare for an ambush and wait for your signal to attack if needed.\n");
                    System.out.println();
                    System.out.println(
                            "You set up a meeting with the White Witch at The Stone Table. The following conversation ensues.\n");
                    System.out.println();
                    System.out.println(
                            "You: White Witch, I stand before you today to extend an offer of peace. The battles we have fought have brought nothing but suffering and despair. Let us put an end to this cycle of violence and find a way to coexist in harmony.\n");
                    System.out.println();
                    System.out.println(
                            "White Witch: (Eyes narrowed with suspicion) Peace, you say? Why should I believe your words, mere mortal? You and your kind have defied me time and time again. What guarantee do I have that this isn't some ploy?\n");
                    System.out.println();
                    System.out.println(
                            "You: I understand your doubts. White Witch, and I cannot erase the past. But I come to you sincerely, seeking a path that avoids further bloodshed. Look into your heart, and you will see the weariness of perpetual conflict. Let us find common ground and forge a future where both Narnians and your reign can exist without enmity.\n");
                    System.out.println();
                    System.out.println(
                            "White Witch: (Contemplative silence follows as the White Witch ponders the player's words). You speak of coexistence, of a future free from strife. But what assurance can you provide that your allies won't turn against me once more? Why should I trust your intentions?\n");
                    System.out.println();
                    System.out.println(
                            "You: I offer you my word, White Witch. I pledge to uphold the terms of any agreement we reach, and I will work tirelessly to foster understanding and maintain peace among all Narnians. I cannot control the actions of others, but I can assure you of my commitment to a lasting resolution.\n");
                    System.out.println("Does the White Witch accept this offer of peace? Please select 1 for yes and 0 for no: \n");
                    String user_option = userInput.nextLine();
                    int user_thoughts = Integer.parseInt(user_option);
                    if (user_thoughts == 1) {
                        System.out.println();
                        System.out.println(
                                "White Witch: (Pausing, her expression softening slightly) A lasting resolution... It is an enticing prospect. Very well, player, I will entertain this notion of peace. But know that I do so with caution. Should you or your allies betray me, there will be dire consequences.\n");
                        System.out.println();
                        System.out.println(
                                "You: I appreciate your willingness to consider the path of peace, White Witch. Let us set aside our grievances and strive for a future where both sides can flourish. Together, we can bring an end to this era of conflict and bring a new dawn for Narnia.\n");
                        System.out.println();
                    } else {
                        System.out.println(
                                "The White Witch has refused your offer for peace. She is enraged by your request and so she attacks!\n");
                        System.out.println();
                        System.out.println(
                                "As the White Witch rejects your offer of peace, tensions escalate, and the necessity of the prepared ambush becomes apparent. You and your allies put your plan into action, strategically positioning yourselves to intercept the White Witch's forces.\n");
                        System.out.println();
                        System.out.println(
                                "Under the cover of darkness, you and your allies, hidden amidst the dense foliage of a wooded area near the designated meeting place, patiently awaits the White Witch's arrival. You remain vigilant, your eyes keenly scanning the surroundings for any signs of movement.\n");
                        System.out.println();
                        System.out.println(
                                "The silence is shattered as the White Witch's entourage emerges, her loyal minions trailing behind her, their weapons gleaming ominously in the moonlight. Your heart races, knowing that the success of their mission hinges on this moment.\n");
                        System.out.println();
                        System.out.println(
                                "As the White Witch's forces advance, your allies unleash a coordinated assault. Archers release a volley of arrows from the treetops, raining down upon the enemy, creating chaos and confusion. Warriors charge forward, wielding swords and shields, engaging in fierce combat with the Witch's minions.\n");
                        System.out.println();
                        System.out.println(
                                "You, fully engaged in the battle, use your skills and abilities to target the White Witch herself. With every swing of your weapon, you strike at her defenses, aiming to weaken her resolve and turn the tide in favour of your cause.\n");
                        System.out.println();
                        System.out.println(
                                "Throughout the fierce clash, your allies fight valiantly, their determination fueled by the desire to protect Narnia and bring an end to the White Witch's tyranny. The sounds of clashing steel and battle cries fill the air as the struggle intensifies.\n");
                        System.out.println();
                        System.out.println(
                                "Amidst the chaos, you spot an opening, an opportunity to confront the White Witch directly. You press forward, defying her dark magic and meeting her gaze with unwavering resolve. Your strength, both physical and moral, serves as a beacon of hope, inspiring your allies to fight with renewed vigor.\n");
                        System.out.println();
                        System.out.println(
                                "As the battle reaches its climax, your combined efforts with that of your allies begin to turn the tide. The White Witch's forces falter, their ranks thinning as they struggle against the relentless assault. Your unwavering determination and strategic preparations prove pivotal, creating a path towards victory.\n");
                        System.out.println();
                        System.out.println(
                                "Ultimately, the ambush succeeds in weakening the White Witch's forces, forcing her to retreat and granting you and your allies a temporary respite. The battle is won, but the war is far from over. You must now regroup, strengthen your resolve, and continue the fight to liberate Narnia from the clutches of the White Witch's oppressive rule.\n");
                        System.out.println();
                        System.out.println(
                                "Professor Alden (the wise Narnian): The Amulet of Thawing is a magical artefact that can change the tide of the battle and grant you victory. The Amulet of Thawing possesses the ability to restore life and vitality to frozen and withered elements of Narnia. It can reverse the effects of the White Witch's eternal winter, gradually melting away the ice and bringing back the beauty and vibrancy of the land. It also weakens her powers, making her more vulnerable to attacks. It disrupts the source of her magic and diminishes her control over ice and cold.\n");
                        System.out.println();
                        System.out.println(
                                "Do you have the Amulet of Thawing? If yes, move along. If no, you have one more chance to get it. Please answer the coming question.\n");
                        if (hasAmulet == true) {
                            System.out.println();
                            System.out.println("Great! Let's move on then!\n");
                        } else {
                            System.out.println();
                            System.out.println(
                                    "I am a fire without heat, a cold flame that does not burn. I can conquer the strongest fortress, yet my touch is gentle. What am I? \n");
                            System.out.println();
                            System.out.println("A. Love\n");
                            System.out.println("B. Ice\n");
                            System.out.println("C. Time\n");
                            System.out.println("D. Music\n");
                            System.out.println();
                            System.out.println("Your response: " + " Please choose/enter a letter for your answer, A, B, C, or D: \n");
                            String right_answer = "B";
                            String player_answer = userInput.nextLine();
                            if (player_answer.equalsIgnoreCase(right_answer)) {
                                hasAmulet = true;
                                System.out.println();
                                System.out.println("Rumbling voice: Correct! You are worthy. You may go in now!\n");
                                System.out.println();
                                System.out.println("The massive ice door groans and cracks open, granting you entry into the heart of the Frostpeak Citadel. Within lies a chamber bathed in a soft, pulsating glow, revealing the coveted Amulet of Thawing resting atop a pedestal of shimmering ice crystals. You approach, your breath visible in the frigid air, as you reach out to claim the Amulet of Thawing - a symbol of hope and the key to countering the White Witch's icy dominion over Narnia.\n");
                                System.out.println();
                                System.out.println("Let's move on then.\n");

                            } else {
                                hasAmulet = false;
                                System.out.println("Rumbling voice: Wrong! Leave now or I would crash down on you!\n");
                                System.out.println();
                                System.out.println("The entire structure begins to shake in a massive earthquake and threatens to swallow you whole. You run back down the mountain and escape being engulfed by a giant snowball that forms almost magically. On your return to the village, you let everyone know of your failure to retrieve the amulet. They are downcast but decide to proceed without it, hoping the power of their number will save them.\n");

                                // The Betrayal.
                                System.out.println();
                                System.out.println("As you progress in your quest, you come across Edmund, who has strayed from the path. He appears conflicted and vulnerable, standing before a magnificent sleigh driven by the White Witch herself.\n");
                                System.out.println();
                                System.out.println("White Witch: (smiling) Ah little Edmund, the curious one. What a shame that your siblings don't appreciate your desire for power and recognition. But fear not, dear child, for I can offer you everything you desire. Join me, and you shall be a prince in my eternal winter. You'll have dominion over Narnia, ruling beside me.\n");
                                System.out.println();
                                System.out.println("You'll find yourself facing a critical decision, how will you respond to this? Select the following options. Press 1 for option 1 and 2 for option 2: \n");
                                System.out.println();
                                System.out.println("1. Encourage Edmund's Temptation\n");
                                System.out.println();
                                System.out.println("2. Disapprove of Edmund's Temptation\n");
                                System.out.println();
                                System.out.println("Remember, whatever you decide determines the fate of Narnia. Think before you choose.\n");
                                deciding = userInput.nextLine();
                                player_decision = Integer.parseInt(deciding);
                                if (player_decision == 1) {
                                    betrayal = true;
                                    System.out.println();
                                    System.out.println("You: Edmund, perhaps there is truth in the Witch's offer. Imagine the power and influence you could wield at her side. It's an opportunity that should not be squandered.\n");
                                // The final battle


                                } else {
                                    betrayal = false;
                                    System.out.println();
                                    System.out.println("You: Edmund, don't be swayed by the Witch's empty promises. She seeks to deceive and control you. Remember your family, your loyalty, and true meaning of Narnia. Choose wisely.\n");
                                   // The final battle


                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("Rumbling voice: Wrong! Leave now or I would crash down on you!\n");
                System.out.println();
                System.out.println("The entire structure begins to shake in a massive earthquake and threatens to swallow you whole. You run back down the mountain and escape being engulfed by a giant snowball that forms almost magically. On your return to the village, you let everyone know of your failure to retrieve the amulet. They are downcast but decide to proceed without it, hoping the power of their number will save them.\n");
                System.out.println();
                hasAmulet = false;
                System.out.println("To solve Narnia's plight, you have two options: \n");
                System.out.println();
                System.out.println("Option 1: Diplomatic approach - You and your allies gather and meet the White Witch to find a middle ground.\n");
                System.out.println();
                System.out.println("Option 2: Solo Diplomacy - You go to meet the White Witch alone with hopes that you can appeal to her remaining humanity.\n");
                System.out.println();
                System.out.println("Please, choose wisely. What option, enter 1 for Option 1 and 2 for Option 2: \n");
                String take = userInput.nextLine();
                int user_choice = Integer.parseInt(take);
                if (user_choice == 1) {
                    System.out.println();
                    System.out.println("You: As I contemplate my approach to the White Witch, I can't shake the feeling that I shouldn't face her alone. I have fought alongside my allies throughout this journey, and their support has been invaluable. Seeking guidance, I turn to a wise and trusted friend, the courageous and loyal badger, Bramble.\n");
                    System.out.println();
                    System.out.println("You: Bramble, I have chosen the path of diplomacy to engage the White Witch, but I'm hesitant to face her alone. What if she refuses to listen or turns hostile? Should I go with my allies by my side?\n");
                    System.out.println();
                    System.out.println("Bramble: *The steadfast Badger regards me with a knowing gaze, his voice filled with wisdom.* Dear friend, your allies have stood beside you through thick and thin. Their loyalty and strength will bolster your cause and provide a united front. Together, you can face any challenge that comes your way. Trust in the power of unity and let your allies join you in this crucial endeavour.\n");
                    System.out.println();
                    System.out.println("Your response: *Bramble's words strike a chord within you. The journey has forged deep bonds of friendship, and I realize that facing the White Witch with my allies by my side is not only practical but also symbolic.* Thank you, Bramble. I am going to gather my trusted companions because I know that their presence will strengthen our message and increase our chances of success.\n");
                    System.out.println();
                    System.out.println("Bramble: *nods in agreement*\n");
                    System.out.println();
                    System.out.println("You set up a meeting with the White Witch at The Stone Table. The following conversation ensues.\n");
                    System.out.println();
                    System.out.println("You: White Witch, I stand before you today to extend an offer of peace. The battles we have fought have brought nothing but suffering and despair. Let us put an end to this cycle of violence and find a way to coexist in harmony.\n");
                    System.out.println();
                    System.out.println("White Witch: (Eyes narrowed with suspicion) Peace, you say? Why should I believe your words, mere mortal? You and your kind have defied me time and time again. What guarantee do I have that this isn't some ploy?\n");
                    System.out.println();
                    System.out.println("You: I understand your doubts. White Witch, and I cannot erase the past. But I come to you sincerely, seeking a path that avoids further bloodshed. Look into your heart, and you will see the weariness of perpetual conflict. Let us find common ground and forge a future where both Narnians and your reign can exist without enmity.\n");
                    System.out.println();
                    System.out.println("White Witch: (Contemplative silence follows as the White Witch ponders the player's words). You speak of coexistence, of a future free from strife. But what assurance can you provide that your allies won't turn against me once more? Why should I trust your intentions?\n");
                    System.out.println();
                    System.out.println("You: I offer you my word, White Witch. I pledge to uphold the terms of any agreement we reach, and I will work tirelessly to foster understanding and maintain peace among all Narnians. I cannot control the actions of others, but I can assure you of my commitment to a lasting resolution.\n");
                    System.out.println("Does the White Witch accept this offer of peace? Please select 1 for yes and 0 for no: \n");
                    String path = userInput.nextLine();
                    int your_thoughts = Integer.parseInt(path);
                    if (your_thoughts == 1) {
                        System.out.println();
                        System.out.println("White Witch: (Pausing, her expression softening slightly) A lasting resolution... It is an enticing prospect. Very well, player, I will entertain this notion of peace. But know that I do so with caution. Should you or your allies betray me, there will be dire consequences.\n");
                        System.out.println();
                        System.out.println("You: I appreciate your willingness to consider the path of peace, White Witch. Let us set aside our grievances and strive for a future where both sides can flourish. Together, we can bring an end to this era of conflict and bring a new dawn for Narnia.\n");
                        System.out.println();
                    } else {
                        System.out.println("The White Witch has refused your offer for peace. She is enraged by your request and so she attacks!\n");
                        System.out.println();
                        System.out.println("As the White Witch ruthlessly rejects the player's offer of peace, she reveals her true intentions and decides to unleash her full power upon you and all your allies. In a cruel and devastating turn of events, she employs her icy magic to imprison everyone in a frozen prison, leaving them helpless and trapped within a frigid, icy landscape.\n");
                        System.out.println();
                        System.out.println("Defeat is near... As the White Witch's decision becomes apparent, the air grows colder, and a sense of impending doom settles over the battlefield. The sky darkens, and a bone-chilling wind whips through the area, carrying with it the White Witch's malevolent presence.\n");
                        System.out.println();
                        System.out.println("With a wave of her hand, the White Witch conjures a swirling vortex of icy energy. The vortex expands rapidly, engulfing you, your allies, and everything in its path. The biting cold cuts through your armor, freezing the ground beneath your feet and encasing you all in a solid wall of ice.\n");
                        System.out.println();
                        System.out.println("You are now surrounded by an icy prison and you try to summon your strength and break free. Desperate attempts to shatter the ice prove futile, as the White Witch's magic is overpowering. The more you struggle, the more the ice constricts, making it impossible to move or escape.\n");
                        System.out.println();
                        System.out.println("As time passes, you and your allies remain trapped in the frozen prison, your bodies immobilized and your spirits slowly fading. The cold saps your strength, and despair begins to take hold.\n");
                        System.out.println();
                        System.out.println("The White Witch, reveling in her victory, taunts you and your captured allies, relishing in your helplessness. She leaves you imprisoned as a symbol of her dominance, a reminder to any who dare challenge her reign. Your defeat is complete, and the White Witch's icy grip tightens hold on Narnia. THE END.\n");
                        System.exit(0);
                    }

                } else {
                    System.out.println();
                    System.out.println("You: (in your deep thoughts) As you prepare to approach the White Witch alone, you can't help but consider the possibility that she may respond with hostility instead of engaging in a peaceful dialogue. It's crucial to be prepared for any outcome. You decide to seek counsel from a trusted Narnian ally, the wise Centaur, Arion.\n");
                    System.out.println();
                    System.out.println("You: Arion, I have chosen the path of solo diplomacy, but I can't ignore the potential danger that lies ahead. What if the White Witch refuses to negotiate and turns aggressive? I need to be ready to protect myself and secure victory if words fail. What do you suggest I do?\n");
                    System.out.println();
                    System.out.println("Arion: (ponders for a moment, his eyes filled with concern) My dear friend, while diplomacy is commendable, the White Witch is known for her treachery. You must prepare for the worst. Consider an ambush strategy.\n");
                    System.out.println();
                    System.out.println("You: (the ambush strategy seems like a cool idea to you) Tell me more, Arion.\n");
                    System.out.println();
                    System.out.println("Arion: Indeed. Set a trap, gathering your most skilled fighters and placing them strategically near the location of your intended dialogue. Conceal them amidst the natural surroundings of Narnia, ready to strike at a moment's notice. If the White Witch reveals her true intentions, your allies can swiftly join the fray, catching her off guard and providing you with a chance of victory.\n");
                    System.out.println();
                    System.out.println("You: (contemplates Arion's advice) I see what you're saying. It's a brilliant idea. Though it is difficult, I now understand the need to be prepared for the worst-case scenario. And it is with a heavy heart that I agree to pursue this ambush strategy. I promise to use it only if all peaceful avenues have been exhausted.\n");
                    System.out.println();
                    System.out.println("The Narnians then prepare for an ambush and wait for your signal to attack if needed.\n");
                    System.out.println();
                    System.out.println("You set up a meeting with the White Witch at The Stone Table. The following conversation ensues.\n");
                    System.out.println();
                    System.out.println("You: White Witch, I stand before you today to extend an offer of peace. The battles we have fought have brought nothing but suffering and despair. Let us put an end to this cycle of violence and find a way to coexist in harmony.\n");
                    System.out.println();
                    System.out.println("White Witch: (Eyes narrowed with suspicion) Peace, you say? Why should I believe your words, mere mortal? You and your kind have defied me time and time again. What guarantee do I have that this isn't some ploy?\n");
                    System.out.println();
                    System.out.println("You: I understand your doubts. White Witch, and I cannot erase the past. But I come to you sincerely, seeking a path that avoids further bloodshed. Look into your heart, and you will see the weariness of perpetual conflict. Let us find common ground and forge a future where both Narnians and your reign can exist without enmity.\n");
                    System.out.println();
                    System.out.println("White Witch: (Contemplative silence follows as the White Witch ponders the player's words). You speak of coexistence, of a future free from strife. But what assurance can you provide that your allies won't turn against me once more? Why should I trust your intentions?\n");
                    System.out.println();
                    System.out.println("You: I offer you my word, White Witch. I pledge to uphold the terms of any agreement we reach, and I will work tirelessly to foster understanding and maintain peace among all Narnians. I cannot control the actions of others, but I can assure you of my commitment to a lasting resolution.\n");
                    System.out.println("Does the White Witch accept this offer of peace? Please select 1 for yes and 0 for no: \n");
                    String user_option = userInput.nextLine();
                    int user_thoughts = Integer.parseInt(user_option);
                    if (user_thoughts == 1) {
                        System.out.println();
                        System.out.println("White Witch: (Pausing, her expression softening slightly) A lasting resolution... It is an enticing prospect. Very well, player, I will entertain this notion of peace. But know that I do so with caution. Should you or your allies betray me, there will be dire consequences.\n");
                        System.out.println();
                        System.out.println("You: I appreciate your willingness to consider the path of peace, White Witch. Let us set aside our grievances and strive for a future where both sides can flourish. Together, we can bring an end to this era of conflict and bring a new dawn for Narnia.\n");
                        System.out.println();
                    } else {
                        System.out.println("The White Witch has refused your offer for peace. She is enraged by your request and so she attacks!\n");
                        System.out.println();
                        System.out.println("As the White Witch rejects your offer of peace, tensions escalate, and the necessity of the prepared ambush becomes apparent. You and your allies put your plan into action, strategically positioning yourselves to intercept the White Witch's forces.\n");
                        System.out.println();
                        System.out.println("Under the cover of darkness, you and your allies, hidden amidst the dense foliage of a wooded area near the designated meeting place, patiently awaits the White Witch's arrival. You remain vigilant, your eyes keenly scanning the surroundings for any signs of movement.\n");
                        System.out.println();
                        System.out.println("The silence is shattered as the White Witch's entourage emerges, her loyal minions trailing behind her, their weapons gleaming ominously in the moonlight. Your heart races, knowing that the success of their mission hinges on this moment.\n");
                        System.out.println();
                        System.out.println("As the White Witch's forces advance, your allies unleash a coordinated assault. Archers release a volley of arrows from the treetops, raining down upon the enemy, creating chaos and confusion. Warriors charge forward, wielding swords and shields, engaging in fierce combat with the Witch's minions.\n");
                        System.out.println();
                        System.out.println("You, fully engaged in the battle, use your skills and abilities to target the White Witch herself. With every swing of your weapon, you strike at her defenses, aiming to weaken her resolve and turn the tide in favour of your cause.\n");
                        System.out.println();
                        System.out.println("Throughout the fierce clash, your allies fight valiantly, their determination fueled by the desire to protect Narnia and bring an end to the White Witch's tyranny. The sounds of clashing steel and battle cries fill the air as the struggle intensifies.\n");
                        System.out.println();
                        System.out.println("Amidst the chaos, you spot an opening, an opportunity to confront the White Witch directly. You press forward, defying her dark magic and meeting her gaze with unwavering resolve. Your strength, both physical and moral, serves as a beacon of hope, inspiring your allies to fight with renewed vigor.\n");
                        System.out.println();
                        System.out.println("As the battle reaches its climax, your combined efforts with that of your allies begin to turn the tide. The White Witch's forces falter, their ranks thinning as they struggle against the relentless assault. Your unwavering determination and strategic preparations prove pivotal, creating a path towards victory.\n");
                        System.out.println();
                        System.out.println("Ultimately, the ambush succeeds in weakening the White Witch's forces, forcing her to retreat and granting you and your allies a temporary respite. The battle is won, but the war is far from over. You must now regroup, strengthen your resolve, and continue the fight to liberate Narnia from the clutches of the White Witch's oppressive rule.\n");
                        System.out.println();
                        System.out.println("Professor Alden (the wise Narnian): The Amulet of Thawing is a magical artefact that can change the tide of the battle and grant you victory. The Amulet of Thawing possesses the ability to restore life and vitality to frozen and withered elements of Narnia. It can reverse the effects of the White Witch's eternal winter, gradually melting away the ice and bringing back the beauty and vibrancy of the land. It also weakens her powers, making her more vulnerable to attacks. It disrupts the source of her magic and diminishes her control over ice and cold.\n");
                        System.out.println();
                        System.out.println("Do you have the Amulet of Thawing? If yes, move along. If no, you have one more chance to get it. Please answer the coming question.\n");
                        if (hasAmulet == true) {
                            System.out.println();
                            System.out.println("Great! Let's move on then!\n");
                        } else {
                            System.out.println();
                            System.out.println("I am a fire without heat, a cold flame that does not burn. I can conquer the strongest fortress, yet my touch is gentle. What am I? \n");
                            System.out.println();
                            System.out.println("A. Love\n");
                            System.out.println("B. Ice\n");
                            System.out.println("C. Time\n");
                            System.out.println("D. Music\n");
                            System.out.println();
                            System.out.println("Your response: " + " Please choose/enter a letter for your answer, A, B, C, or D: \n");
                            String right_answer = "B";
                            String player_answer = userInput.nextLine();
                            if (player_answer.equalsIgnoreCase(right_answer)) {
                                hasAmulet = true;
                                System.out.println();
                                System.out.println("Rumbling voice: Correct! You are worthy. You may go in now!\n");
                                System.out.println();
                                System.out.println("The massive ice door groans and cracks open, granting you entry into the heart of the Frostpeak Citadel. Within lies a chamber bathed in a soft, pulsating glow, revealing the coveted Amulet of Thawing resting atop a pedestal of shimmering ice crystals. You approach, your breath visible in the frigid air, as you reach out to claim the Amulet of Thawing - a symbol of hope and the key to countering the White Witch's icy dominion over Narnia.\n");
                                System.out.println();
                                System.out.println("Let's move on then.\n");

                                System.out.println();
                                // The Betrayal
                                System.out.println("As you progress in your quest, you come across Edmund, who has strayed from the path. He appears conflicted and vulnerable, standing before a magnificent sleigh driven by the White Witch herself.\n");
                                System.out.println();
                                System.out.println("White Witch: (smiling) Ah little Edmund, the curious one. What a shame that your siblings don't appreciate your desire for power and recognition. But fear not, dear child, for I can offer you everything you desire. Join me, and you shall be a prince in my eternal winter. You'll have dominion over Narnia, ruling beside me.\n");
                                System.out.println();
                                System.out.println("You'll find yourself facing a critical decision, how will you respond to this? Select the following options. Press 1 for option 1 and 2 for option 2: \n");
                                System.out.println();
                                System.out.println("1. Encourage Edmund's Temptation\n");
                                System.out.println();
                                System.out.println("2. Disapprove of Edmund's Temptation\n");
                                System.out.println();
                                System.out.println("Remember, whatever you decide determines the fate of Narnia. Think before you choose.\n");
                                deciding = userInput.nextLine();
                                player_decision = Integer.parseInt(deciding);
                                if (player_decision == 1) {
                                    betrayal = true;
                                    System.out.println();
                                    System.out.println("You: Edmund, perhaps there is truth in the Witch's offer. Imagine the power and influence you could wield at her side. It's an opportunity that should not be squandered.\n");
                                 // The final battle


                                } else {
                                    betrayal = false;
                                    System.out.println();
                                    System.out.println("You: Edmund, don't be swayed by the Witch's empty promises. She seeks to deceive and control you. Remember your family, your loyalty, and true meaning of Narnia. Choose wisely.\n");
                                // The final battle


                                }

                            } else {
                                hasAmulet = false;
                                System.out.println("Rumbling voice: Wrong! Leave now or I would crash down on you!\n");
                                System.out.println();
                                System.out.println("The entire structure begins to shake in a massive earthquake and threatens to swallow you whole. You run back down the mountain and escape being engulfed by a giant snowball that forms almost magically. On your return to the village, you let everyone know of your failure to retrieve the amulet. They are downcast but decide to proceed without it, hoping the power of their number will save them.\n");

                                // The Betrayal.
                                System.out.println();
                                System.out.println("As you progress in your quest, you come across Edmund, who has strayed from the path. He appears conflicted and vulnerable, standing before a magnificent sleigh driven by the White Witch herself.\n");
                                System.out.println();
                                System.out.println("White Witch: (smiling) Ah little Edmund, the curious one. What a shame that your siblings don't appreciate your desire for power and recognition. But fear not, dear child, for I can offer you everything you desire. Join me, and you shall be a prince in my eternal winter. You'll have dominion over Narnia, ruling beside me.\n");
                                System.out.println();
                                System.out.println("You'll find yourself facing a critical decision, how will you respond to this? Select the following options. Press 1 for option 1 and 2 for option 2: \n");
                                System.out.println();
                                System.out.println("1. Encourage Edmund's Temptation\n");
                                System.out.println();
                                System.out.println("2. Disapprove of Edmund's Temptation\n");
                                System.out.println();
                                System.out.println("Remember, whatever you decide determines the fate of Narnia. Think before you choose.\n");
                                deciding = userInput.nextLine();
                                player_decision = Integer.parseInt(deciding);
                                if (player_decision == 1) {
                                    betrayal = true;
                                    System.out.println();
                                    System.out.println("You: Edmund, perhaps there is truth in the Witch's offer. Imagine the power and influence you could wield at her side. It's an opportunity that should not be squandered.\n");
                                 // The final battle
                                } else {
                                    betrayal = false;
                                    System.out.println();
                                    System.out.println("You: Edmund, don't be swayed by the Witch's empty promises. She seeks to deceive and control you. Remember your family, your loyalty, and true meaning of Narnia. Choose wisely.\n");
                                // The final battle
                                }
                            }

                        }
                    }

                }
            }
        } else {
            // Seek to broker peace.
            System.out.println();
            System.out.println("You have two options: \n");
            System.out.println();
            System.out.println("Option 1: Diplomatic approach - You and your allies gather and meet the White Witch to find a middle ground.\n");
            System.out.println();
            System.out.println("Option 2: Solo Diplomacy - You go to meet the White Witch alone with hopes that you can appeal to her remaining humanity.\n");
            System.out.println();
            System.out.println("Please, choose wisely. What option, enter 1 for Option 1 and 2 for Option 2: \n");
            String take = userInput.nextLine();
            int user_choice = Integer.parseInt(take);
            if (user_choice == 1) {
                System.out.println();
                System.out.println("You: As I contemplate my approach to the White Witch, I can't shake the feeling that I shouldn't face her alone. I have fought alongside my allies throughout this journey, and their support has been invaluable. Seeking guidance, I turn to a wise and trusted friend, the courageous and loyal badger, Bramble.\n");
                System.out.println();
                System.out.println("You: Bramble, I have chosen the path of diplomacy to engage the White Witch, but I'm hesitant to face her alone. What if she refuses to listen or turns hostile? Should I go with my allies by my side?\n");
                System.out.println();
                System.out.println("Bramble: *The steadfast Badger regards me with a knowing gaze, his voice filled with wisdom.* Dear friend, your allies have stood beside you through thick and thin. Their loyalty and strength will bolster your cause and provide a united front. Together, you can face any challenge that comes your way. Trust in the power of unity and let your allies join you in this crucial endeavour.\n");
                System.out.println();
                System.out.println("Your response: *Bramble's words strike a chord within you. The journey has forged deep bonds of friendship, and I realize that facing the White Witch with my allies by my side is not only practical but also symbolic.* Thank you, Bramble. I am going to gather my trusted companions because I know that their presence will strengthen our message and increase our chances of success.\n");
                System.out.println();
                System.out.println("Bramble: *nods in agreement*\n");
                System.out.println();
                System.out.println("You set up a meeting with the White Witch at The Stone Table. The following conversation ensues.\n");
                System.out.println();
                System.out.println("You: White Witch, I stand before you today to extend an offer of peace. The battles we have fought have brought nothing but suffering and despair. Let us put an end to this cycle of violence and find a way to coexist in harmony.\n");
                System.out.println();
                System.out.println("White Witch: (Eyes narrowed with suspicion) Peace, you say? Why should I believe your words, mere mortal? You and your kind have defied me time and time again. What guarantee do I have that this isn't some ploy?\n");
                System.out.println();
                System.out.println("You: I understand your doubts. White Witch, and I cannot erase the past. But I come to you sincerely, seeking a path that avoids further bloodshed. Look into your heart, and you will see the weariness of perpetual conflict. Let us find common ground and forge a future where both Narnians and your reign can exist without enmity.\n");
                System.out.println();
                System.out.println("White Witch: (Contemplative silence follows as the White Witch ponders the player's words). You speak of coexistence, of a future free from strife. But what assurance can you provide that your allies won't turn against me once more? Why should I trust your intentions?\n");
                System.out.println();
                System.out.println("You: I offer you my word, White Witch. I pledge to uphold the terms of any agreement we reach, and I will work tirelessly to foster understanding and maintain peace among all Narnians. I cannot control the actions of others, but I can assure you of my commitment to a lasting resolution.\n");
                System.out.println("Does the White Witch accept this offer of peace? Please select 1 for yes and 0 for no: \n");
                String path = userInput.nextLine();
                int your_thoughts = Integer.parseInt(path);
                if (your_thoughts == 1) {
                    System.out.println();
                    System.out.println("White Witch: (Pausing, her expression softening slightly) A lasting resolution... It is an enticing prospect. Very well, player, I will entertain this notion of peace. But know that I do so with caution. Should you or your allies betray me, there will be dire consequences.\n");
                    System.out.println();
                    System.out.println("You: I appreciate your willingness to consider the path of peace, White Witch. Let us set aside our grievances and strive for a future where both sides can flourish. Together, we can bring an end to this era of conflict and bring a new dawn for Narnia.\n");
                    System.out.println();
                } else {
                    System.out.println("The White Witch has refused your offer for peace. She is enraged by your request and so she attacks!\n");
                    System.out.println();
                    System.out.println("As the White Witch ruthlessly rejects the player's offer of peace, she reveals her true intentions and decides to unleash her full power upon you and all your allies. In a cruel and devastating turn of events, she employs her icy magic to imprison everyone in a frozen prison, leaving them helpless and trapped within a frigid, icy landscape.\n");
                    System.out.println();
                    System.out.println("Defeat is near... As the White Witch's decision becomes apparent, the air grows colder, and a sense of impending doom settles over the battlefield. The sky darkens, and a bone-chilling wind whips through the area, carrying with it the White Witch's malevolent presence.\n");
                    System.out.println();
                    System.out.println("With a wave of her hand, the White Witch conjures a swirling vortex of icy energy. The vortex expands rapidly, engulfing you, your allies, and everything in its path. The biting cold cuts through your armor, freezing the ground beneath your feet and encasing you all in a solid wall of ice.\n");
                    System.out.println();
                    System.out.println("You are now surrounded by an icy prison and you try to summon your strength and break free. Desperate attempts to shatter the ice prove futile, as the White Witch's magic is overpowering. The more you struggle, the more the ice constricts, making it impossible to move or escape.\n");
                    System.out.println();
                    System.out.println("As time passes, you and your allies remain trapped in the frozen prison, your bodies immobilized and your spirits slowly fading. The cold saps your strength, and despair begins to take hold.\n");
                    System.out.println();
                    System.out.println("The White Witch, reveling in her victory, taunts you and your captured allies, relishing in your helplessness. She leaves you imprisoned as a symbol of her dominance, a reminder to any who dare challenge her reign. Your defeat is complete, and the White Witch's icy grip tightens hold on Narnia. THE END.\n");
                    System.exit(0);
                }

            } else {
                System.out.println();
                System.out.println("You: (in your deep thoughts) As you prepare to approach the White Witch alone, you can't help but consider the possibility that she may respond with hostility instead of engaging in a peaceful dialogue. It's crucial to be prepared for any outcome. You decide to seek counsel from a trusted Narnian ally, the wise Centaur, Arion.\n");
                System.out.println();
                System.out.println("You: Arion, I have chosen the path of solo diplomacy, but I can't ignore the potential danger that lies ahead. What if the White Witch refuses to negotiate and turns aggressive? I need to be ready to protect myself and secure victory if words fail. What do you suggest I do?\n");
                System.out.println();
                System.out.println("Arion: (ponders for a moment, his eyes filled with concern) My dear friend, while diplomacy is commendable, the White Witch is known for her treachery. You must prepare for the worst. Consider an ambush strategy.\n");
                System.out.println();
                System.out.println("You: (the ambush strategy seems like a cool idea to you) Tell me more, Arion.\n");
                System.out.println();
                System.out.println("Arion: Indeed. Set a trap, gathering your most skilled fighters and placing them strategically near the location of your intended dialogue. Conceal them amidst the natural surroundings of Narnia, ready to strike at a moment's notice. If the White Witch reveals her true intentions, your allies can swiftly join the fray, catching her off guard and providing you with a chance of victory.\n");
                System.out.println();
                System.out.println("You: (contemplates Arion's advice) I see what you're saying. It's a brilliant idea. Though it is difficult, I now understand the need to be prepared for the worst-case scenario. And it is with a heavy heart that I agree to pursue this ambush strategy. I promise to use it only if all peaceful avenues have been exhausted.\n");
                System.out.println();
                System.out.println("The Narnians then prepare for an ambush and wait for your signal to attack if needed.\n");
                System.out.println();
                System.out.println("You set up a meeting with the White Witch at The Stone Table. The following conversation ensues.\n");
                System.out.println();
                System.out.println("You: White Witch, I stand before you today to extend an offer of peace. The battles we have fought have brought nothing but suffering and despair. Let us put an end to this cycle of violence and find a way to coexist in harmony.\n");
                System.out.println();
                System.out.println("White Witch: (Eyes narrowed with suspicion) Peace, you say? Why should I believe your words, mere mortal? You and your kind have defied me time and time again. What guarantee do I have that this isn't some ploy?\n");
                System.out.println();
                System.out.println("You: I understand your doubts. White Witch, and I cannot erase the past. But I come to you sincerely, seeking a path that avoids further bloodshed. Look into your heart, and you will see the weariness of perpetual conflict. Let us find common ground and forge a future where both Narnians and your reign can exist without enmity.\n");
                System.out.println();
                System.out.println("White Witch: (Contemplative silence follows as the White Witch ponders the player's words). You speak of coexistence, of a future free from strife. But what assurance can you provide that your allies won't turn against me once more? Why should I trust your intentions?\n");
                System.out.println();
                System.out.println("You: I offer you my word, White Witch. I pledge to uphold the terms of any agreement we reach, and I will work tirelessly to foster understanding and maintain peace among all Narnians. I cannot control the actions of others, but I can assure you of my commitment to a lasting resolution.\n");
                System.out.println("Does the White Witch accept this offer of peace? Please select 1 for yes and 0 for no: \n");
                String user_option = userInput.nextLine();
                int user_thoughts = Integer.parseInt(user_option);
                if (user_thoughts == 1) {
                    System.out.println();
                    System.out.println("White Witch: (Pausing, her expression softening slightly) A lasting resolution... It is an enticing prospect. Very well, player, I will entertain this notion of peace. But know that I do so with caution. Should you or your allies betray me, there will be dire consequences.\n");
                    System.out.println();
                    System.out.println("You: I appreciate your willingness to consider the path of peace, White Witch. Let us set aside our grievances and strive for a future where both sides can flourish. Together, we can bring an end to this era of conflict and bring a new dawn for Narnia.\n");
                    System.out.println();
                } else {
                    System.out.println("The White Witch has refused your offer for peace. She is enraged by your request and so she attacks!\n");
                    System.out.println();
                    System.out.println("As the White Witch rejects your offer of peace, tensions escalate, and the necessity of the prepared ambush becomes apparent. You and your allies put your plan into action, strategically positioning yourselves to intercept the White Witch's forces.\n");
                    System.out.println();
                    System.out.println("Under the cover of darkness, you and your allies, hidden amidst the dense foliage of a wooded area near the designated meeting place, patiently awaits the White Witch's arrival. You remain vigilant, your eyes keenly scanning the surroundings for any signs of movement.\n");
                    System.out.println();
                    System.out.println("The silence is shattered as the White Witch's entourage emerges, her loyal minions trailing behind her, their weapons gleaming ominously in the moonlight. Your heart races, knowing that the success of their mission hinges on this moment.\n");
                    System.out.println();
                    System.out.println("As the White Witch's forces advance, your allies unleash a coordinated assault. Archers release a volley of arrows from the treetops, raining down upon the enemy, creating chaos and confusion. Warriors charge forward, wielding swords and shields, engaging in fierce combat with the Witch's minions.\n");
                    System.out.println();
                    System.out.println("You, fully engaged in the battle, use your skills and abilities to target the White Witch herself. With every swing of your weapon, you strike at her defenses, aiming to weaken her resolve and turn the tide in favour of your cause.\n");
                    System.out.println();
                    System.out.println("Throughout the fierce clash, your allies fight valiantly, their determination fueled by the desire to protect Narnia and bring an end to the White Witch's tyranny. The sounds of clashing steel and battle cries fill the air as the struggle intensifies.\n");
                    System.out.println();
                    System.out.println("Amidst the chaos, you spot an opening, an opportunity to confront the White Witch directly. You press forward, defying her dark magic and meeting her gaze with unwavering resolve. Your strength, both physical and moral, serves as a beacon of hope, inspiring your allies to fight with renewed vigor.\n");
                    System.out.println();
                    System.out.println("As the battle reaches its climax, your combined efforts with that of your allies begin to turn the tide. The White Witch's forces falter, their ranks thinning as they struggle against the relentless assault. Your unwavering determination and strategic preparations prove pivotal, creating a path towards victory.\n");
                    System.out.println();
                    System.out.println("Ultimately, the ambush succeeds in weakening the White Witch's forces, forcing her to retreat and granting you and your allies a temporary respite. The battle is won, but the war is far from over. You must now regroup, strengthen your resolve, and continue the fight to liberate Narnia from the clutches of the White Witch's oppressive rule.\n");
                    System.out.println();
                    System.out.println("Professor Alden (the wise Narnian): The Amulet of Thawing is a magical artefact that can change the tide of the battle and grant you victory. The Amulet of Thawing possesses the ability to restore life and vitality to frozen and withered elements of Narnia. It can reverse the effects of the White Witch's eternal winter, gradually melting away the ice and bringing back the beauty and vibrancy of the land. It also weakens her powers, making her more vulnerable to attacks. It disrupts the source of her magic and diminishes her control over ice and cold.\n");
                    System.out.println();
                    System.out.println("Do you have the Amulet of Thawing? If yes, move along. If no, you have just one chance to get it now. Please answer the coming question.\n");
                    if (hasAmulet) {
                        System.out.println();
                        System.out.println("Great! Let's move on then!\n");
                    } else {
                        System.out.println();
                        System.out.println("I am a fire without heat, a cold flame that does not burn. I can conquer the strongest fortress, yet my touch is gentle. What am I? \n");
                        System.out.println();
                        System.out.println("A. Love\n");
                        System.out.println("B. Ice\n");
                        System.out.println("C. Time\n");
                        System.out.println("D. Music\n");
                        System.out.println();
                        System.out.println("Your response: " + " Please choose/enter a letter for your answer, A, B, C, or D: \n");
                        String right_answer = "B";
                        String player_answer = userInput.nextLine();
                        if (player_answer.equalsIgnoreCase(right_answer)) {
                            hasAmulet = true;
                            System.out.println();
                            System.out.println("Rumbling voice: Correct! You are worthy. You may go in now!\n");
                            System.out.println();
                            System.out.println("The massive ice door groans and cracks open, granting you entry into the heart of the Frostpeak Citadel. Within lies a chamber bathed in a soft, pulsating glow, revealing the coveted Amulet of Thawing resting atop a pedestal of shimmering ice crystals. You approach, your breath visible in the frigid air, as you reach out to claim the Amulet of Thawing - a symbol of hope and the key to countering the White Witch's icy dominion over Narnia.\n");
                            System.out.println();
                            System.out.println("Let's move on then.\n");
                            System.out.println();
                            // The Betrayal
                            System.out.println("As you progress in your quest, you come across Edmund, who has strayed from the path. He appears conflicted and vulnerable, standing before a magnificent sleigh driven by the White Witch herself.\n");
                            System.out.println();
                            System.out.println("White Witch: (smiling) Ah little Edmund, the curious one. What a shame that your siblings don't appreciate your desire for power and recognition. But fear not, dear child, for I can offer you everything you desire. Join me, and you shall be a prince in my eternal winter. You'll have dominion over Narnia, ruling beside me.\n");
                            System.out.println();
                            System.out.println("You'll find yourself facing a critical decision, how will you respond to this? Select the following options. Press 1 for option 1 and 2 for option 2: \n");
                            System.out.println();
                            System.out.println("1. Encourage Edmund's Temptation\n");
                            System.out.println();
                            System.out.println("2. Disapprove of Edmund's Temptation\n");
                            System.out.println();
                            System.out.println("Remember, whatever you decide determines the fate of Narnia. Think before you choose.\n");
                            deciding = userInput.nextLine();
                            player_decision = Integer.parseInt(deciding);
                            if (player_decision == 1) {
                                betrayal = true;
                                System.out.println();
                                System.out.println("You: Edmund, perhaps there is truth in the Witch's offer. Imagine the power and influence you could wield at her side. It's an opportunity that should not be squandered.\n");
                                // The final battle
                            } else {
                                betrayal = false;
                                System.out.println();
                                System.out.println("You: Edmund, don't be swayed by the Witch's empty promises. She seeks to deceive and control you. Remember your family, your loyalty, and true meaning of Narnia. Choose wisely.\n");
                                // The final battle
                            }

                        } else {
                            hasAmulet = false;
                            System.out.println("Rumbling voice: Wrong! Leave now or I would crash down on you!\n");
                            System.out.println();
                            System.out.println("The entire structure begins to shake in a massive earthquake and threatens to swallow you whole. You run back down the mountain and escape being engulfed by a giant snowball that forms almost magically. On your return to the village, you let everyone know of your failure to retrieve the amulet. They are downcast but decide to proceed without it, hoping the power of their number will save them.\n");

                            // The Betrayal.
                            System.out.println();
                            System.out.println("As you progress in your quest, you come across Edmund, who has strayed from the path. He appears conflicted and vulnerable, standing before a magnificent sleigh driven by the White Witch herself.\n");
                            System.out.println();
                            System.out.println("White Witch: (smiling) Ah little Edmund, the curious one. What a shame that your siblings don't appreciate your desire for power and recognition. But fear not, dear child, for I can offer you everything you desire. Join me, and you shall be a prince in my eternal winter. You'll have dominion over Narnia, ruling beside me.\n");
                            System.out.println();
                            System.out.println("You'll find yourself facing a critical decision, how will you respond to this? Select the following options. Press 1 for option 1 and 2 for option 2: \n");
                            System.out.println();
                            System.out.println("1. Encourage Edmund's Temptation\n");
                            System.out.println();
                            System.out.println("2. Disapprove of Edmund's Temptation\n");
                            System.out.println();
                            System.out.println("Remember, whatever you decide determines the fate of Narnia. Think before you choose.\n");
                            deciding = userInput.nextLine();
                            player_decision = Integer.parseInt(deciding);
                            if (player_decision == 1) {
                                betrayal = true;
                                System.out.println();
                                System.out.println("You: Edmund, perhaps there is truth in the Witch's offer. Imagine the power and influence you could wield at her side. It's an opportunity that should not be squandered.\n");
                            } else {
                                betrayal = false;
                                System.out.println();
                                System.out.println("You: Edmund, don't be swayed by the Witch's empty promises. She seeks to deceive and control you. Remember your family, your loyalty, and true meaning of Narnia. Choose wisely.\n");
                            }
                        }
                    }

                }

            }
        }
        // The final battle.
    }
}