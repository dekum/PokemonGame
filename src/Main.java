/* Pokemon Project
Started 8/20/2018
Philemon Petit-Frere
OOP Project

Goals:
Run a pokemon battle with 2 trainer each with 3 pokemon
3 Pokemon, all stats 4 attacks
Have the battle run to end
Eventually turn program into GUI

Don't extended any futhur from there until its done


*/
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        //Opening open1 = new Opening();

        Player P1 = new Player("Red","Trainer", 14);
        Player P2 = new Player("Blue","Master Trainer",15);



        Pkmn createPkmn = new Pkmn("Pikachu", "Electric", 200, 25, 15,"Pikachu");
        P1.setPkmnList(createPkmn,1);
        createPkmn = new Pkmn("Charmander", "Fire", 123, 54, 29,"Charmander"); //think about adding a number at the end of createPkmn
        P1.setPkmnList(createPkmn,2);
        createPkmn = new Pkmn("Charma3nder", "Fire", 123, 54, 29,"Charmander"); //think about adding a number at the end of createPkmn
        P1.setPkmnList(createPkmn,3);

         createPkmn = new Pkmn("Squirtle", "Water", 220, 25, 30,"Squirtle");
        P2.setPkmnList(createPkmn,1);
         createPkmn = new Pkmn("Geodude", "Rock", 420, 42, 39,"Geodude");
        P2.setPkmnList(createPkmn,2);



        Pkmn Pokemon1 = P1.getPkmnList(1);

        for (int i = 1 ; i<3; i++)
        {
            Pokemon1 = P1.getPkmnList(i);
            System.out.println("Yaaaaaa Pkmn is: "+ Pokemon1.getName() +" Type: " + Pokemon1.getType() + "\nCurrent HP = " +
                    Pokemon1.getHP() + " ATK = " + Pokemon1.getAtk()+ " DEF = " + Pokemon1.getDef() );

        }

        Pokemon1.showPkmnMoveList();

        System.exit(0);

        System.out.println("Name:"+P1.getName() +" Class: "+P1.getTrainerClass()+ " Age: " + P1.getAge());
        //Print out pokemon Info
        System.out.println("Your current Pkmn is: "+ Pokemon1.getName() +" Type: " + Pokemon1.getType() + "\nCurrent HP = " +
                Pokemon1.getHP() + " ATK = " + Pokemon1.getAtk()+ " DEF = " + Pokemon1.getDef() );




        Pokemon1 = P1.getPkmnList(2);
        System.out.println("Your other Pkmn is: "+ Pokemon1.getName() +" Type: " + Pokemon1.getType() + "\nCurrent HP = " +
                Pokemon1.getHP() + " ATK = " + Pokemon1.getAtk()+ " DEF = " + Pokemon1.getDef() );

        Pkmn Pokemon2 = P2.getPkmnList(1);

        System.out.println("Enemy current Pkmn is: "+ Pokemon2.getName() +" Type: " + Pokemon2.getType() + "\nCurrent HP = " +
                Pokemon2.getHP() + " ATK = " + Pokemon2.getAtk()+ " DEF = " + Pokemon2.getDef() );

        Pokemon2 = P2.getPkmnList(2);

        System.out.println("Enemy current Pkmn is: "+ Pokemon2.getName() +" Type: " + Pokemon2.getType() + "\nCurrent HP = " +
                Pokemon2.getHP() + " ATK = " + Pokemon2.getAtk()+ " DEF = " + Pokemon2.getDef() );



        System.out.println("Blue wants to fight!");
        System.out.println("Blue sends out " + Pokemon2.getName() +"!");
        System.out.println("Go " + Pokemon1.getName()+ "!");


        Pokemon1 = P1.getPkmnList(1);
        Pokemon2 = P2.getPkmnList(1);
        P1.setCurrentPkmn(Pokemon1);
        P2.setCurrentPkmn(Pokemon2);

        BattleSituation bat1 = new BattleSituation(P1.getCurrentPkmn(), P2.getCurrentPkmn());




        BattleMenu menu1 = new BattleMenu(P1,P2);



        //System.out.println(BattleSitutation()); //Batttle situation class show Enemy pkmn HP LVL and name and player's hp lvl name
        //Show battle menu 1. FIGHT 2. PKMN 3. Item 4.Run



    }
}
