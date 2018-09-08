import java.util.Scanner;
import java.util.InputMismatchException;;
public class BattleMenu {


    BattleMenu(Player P1,Player P2) {
//Print out Insrtuctiosn for player to do
        System.out.println("1.Fight\n" +
                "2.Pkmn\n" +
                "3.Bag\n" +
                "4.Run\n" +
                "5.ReviewBattle\n");

//Scanner input=new Scanner(System.in);
//ystem.out.println("Pick a number to continue:");
//int input1=input.nextInt();
//ValidateIntInput val=new ValidateIntInput(input1,1,4);
//System.out.println(input1);
//Validate


        Pkmn pokemon1= P1.getCurrentPkmn();
        Pkmn pokemon2 = P2.getCurrentPkmn();
        ValidateIntInput valid1 = new ValidateIntInput();
        int userInput = valid1.getValue();
        boolean p1Turn = true;
        while (p1Turn == true) {
            if (userInput == 1)
            {
                //Fight Menu
                boolean keepMenu = true;
                while (keepMenu == true) //pokemon2.getHP() > 1 former conditon
                    {

                        System.out.println("Fight");
                        //Call Fight Menu
                        System.out.println("1.Tackle\n" +
                                "2.Thunderbolt\n" +
                                "3.Iron Tail\n" +
                                "4.Thunder\n" +
                                "5.ReviewBattle\n");
                        valid1 = new ValidateIntInput();
                        userInput = valid1.getValue();
                        if (userInput == 1) {
                        //My Damange forumla for the example is simple
                        //(Attack power + Damagne power(*2 for weakness)) - (def/20

                        //Using tackle attack value 10
                            System.out.println(pokemon1.getName() + " uses Tackle! ");
                            CalculateDamange calc1 = new CalculateDamange(pokemon1, pokemon2, 10, 1);
                            System.out.println(
                                    "Damange = " + calc1.getDamange() + "Current HP " + pokemon2.getHP() + " / " + pokemon2
                                            .getHPMax());
                            keepMenu = false;
                        }

                        if (userInput == 2) {
                        //My Damange forumla for the example is simple
                        //(Attack power + Damagne power(*2 for weakness)) - (def/20

                        //Using tackle attack value 10
                            System.out.println(pokemon1.getName() + " uses Thunderstock! ");
                            CalculateDamange calc1 = new CalculateDamange(pokemon1, pokemon2, 15, 2);
                            //System.out.println(
                            //        "Damange = " + calc1.getDamange() + "Current HP " + pokemon2.getHP() + " / " + pokemon2
                            //                .getHPMax());
                            keepMenu = false;
                        }

                        if (userInput == 3) {
                            //My Damange forumla for the example is simple
                            //(Attack power + Damagne power(*2 for weakness)) - (def/20

                            //Using tackle attack value 10
                            System.out.println(pokemon1.getName() + " uses Irontail! ");
                            CalculateDamange calc1 = new CalculateDamange(pokemon1, pokemon2, 5, 1);
                            pokemon1.setDef(pokemon1.getDef() + 3);
//                            System.out.println(
//                                    "Damange = " + calc1.getDamange() + "Current HP " + pokemon2.getHP() + " / " + pokemon2
//                                            .getHPMax());
                            keepMenu = false;
                        }

                        if (userInput == 4) {
                            //My Damange forumla for the example is simple
                            //(Attack power + Damagne power(*2 for weakness)) - (def/20

                            //Using tackle attack value 10
                            System.out.println(pokemon1.getName() + " uses Thunder! ");
                            CalculateDamange calc1 = new CalculateDamange(pokemon1, pokemon2, 30, 2);
//                            System.out.println(
//                                    "Damange = " + calc1.getDamange() + "Current HP " + pokemon2.getHP() + " / " + pokemon2
//                                            .getHPMax());
                            keepMenu = false;
                        }


                    }

                p1Turn = false;
                }
                else if (userInput != 1) {
                System.out.println("Sorry Option isn't available.");
                    valid1 = new ValidateIntInput();
                userInput = valid1.getValue();
                    }

            }
        //Here would be post attack code?
        //Start enemy turn
        if(pokemon2.getHP() <= 0)
        {
            System.out.println("End of battle you win!");
            System.exit(0);

        }


        //This only happens if Above code doesn't run

        P2Turn turn2 = new P2Turn(P1, P2);


    }
}
