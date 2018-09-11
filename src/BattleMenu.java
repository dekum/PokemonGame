import java.util.Scanner;
import java.util.InputMismatchException;;
public class BattleMenu {



    BattleMenu(Player P1,Player P2) {
        PkmnMove moveUsed;
//Print out Insrtuctiosn for player to do


        Pkmn pokemon1= P1.getCurrentPkmn();
        boolean p1Turn = true;
        Pkmn pokemon2 = P2.getCurrentPkmn();


        while (p1Turn == true) {
            System.out.println("\n\n1.Fight\n" +
                    "2.Pkmn\n" +
                    "3.Bag\n" +
                    "4.Run\n" +
                    "5.ReviewBattle\n");

            ValidateIntInput valid1 = new ValidateIntInput(1,4);
            int userInput1 = valid1.getValue();
            if (userInput1 == 1)
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
                        int userInput2 = valid1.getValue();


                        moveUsed = pokemon1.getPkmnMoveList(userInput2);
                        System.out.println(pokemon1.getName() + " uses "+ moveUsed.getName() +"!" );
                        CalculateDamange calc1 = new CalculateDamange(pokemon1,pokemon2,moveUsed,"none ");
                        //System.out.println("Damange = " + calc1.getDamange() + "Current HP " + pokemon2.getHP() + " / " + pokemon2.getHPMax());
                            keepMenu = false;



                 }
                 //Done battle now P1 turn should end
                p1Turn = false;
                }
                    if(userInput1 == 2)
                    {
                        //Change pokemon
                        ChangePkmn change1 = new ChangePkmn(P1);

                        if (change1.isCancel() == true){
                            System.out.println("I cancled");

                        }else if(change1.isCancel() == false){
                        System.out.println("I didn't cancel");
                            p1Turn = false; //If there no cancel, end the turn and start P2 turn
                    }




                    }
//                    if (userInput == 3)
////                    {
                    //FOR SOME REASON WHEN I BATTLEE IT COMES DOWN HERE WHEN I DO 3 FOR IRON TAIL FIX LATER 9.10
////                        System.out.println("A potion will recover 100HP for one pokemon");
////                        P1.showPkmnList();
////                        System.out.println("Pick a pokemon to use potion on");
////                        valid1 = new ValidateIntInput(1,3);
////                        userInput =valid1.getValue();
////                        P1.getPkmnList(userInput).setHP(P1.getPkmnList(userInput).getHP()+100);
////                        System.out.println( P1.getPkmnList(userInput).getName() + "recovers 100 HP! Current: "+ pokemon1.showHP());
////
////                    }
                else if (userInput1 != 1) {
                System.out.println("Sorry Option isn't available.");
                    valid1 = new ValidateIntInput();
                userInput1 = valid1.getValue();
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
