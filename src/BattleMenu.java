import java.util.Scanner;
import java.util.InputMismatchException;;
public class BattleMenu {



    BattleMenu(Player P1,Player P2) {
        PkmnMove moveUsed;
//Print out Insrtuctiosn for player to do
        System.out.println("1.Fight\n" +
                "2.Pkmn\n" +
                "3.Bag\n" +
                "4.Run\n" +
                "5.ReviewBattle\n");




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
                        pokemon1.showPkmnMoveList();
                        //User chooses 1 thur 4
                        //move 1
                        // move 2
                        //move 3
                        //move 4
                        valid1 = new ValidateIntInput(1,4);
                        userInput = valid1.getValue();


                        moveUsed = pokemon1.getPkmnMoveList(userInput);
                        System.out.println(pokemon1.getName() + " uses "+ moveUsed.getName() +"!" );
                        CalculateDamange calc1 = new CalculateDamange(pokemon1,pokemon2,moveUsed,"none ");
                        //System.out.println("Damange = " + calc1.getDamange() + "Current HP " + pokemon2.getHP() + " / " + pokemon2.getHPMax());
                            keepMenu = false;



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
