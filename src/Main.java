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



        System.out.println("Hello World!");
        //Opening open1 = new Opening();


        Pkmn P1Pkmn1 = new Pkmn("Pikachu", "Electric", 200, 25, 15);
        Pkmn Pkmn2 = new Pkmn("Charmander", "Fire", 70, 40, 20);
        Pkmn P2Pkmn1 = new Pkmn("Squirtle", "Water", 220, 25, 30);

        //Print out pokemon Info
        System.out.println("Your current Pkmn is: "+ P1Pkmn1.getName() +" Type: " + P1Pkmn1.getType() + "\nCurrent HP = " +
                P1Pkmn1.getHP() + " ATK = " + P1Pkmn1.getAtk()+ " DEF = " + P1Pkmn1.getDef() );
        System.out.println("Enemy current Pkmn is: "+ P2Pkmn1.getName() +" Type: " + P2Pkmn1.getType() + "\nCurrent HP = " +
                P2Pkmn1.getHP() + " ATK = " + P2Pkmn1.getAtk()+ " DEF = " + P2Pkmn1.getDef() );



        System.out.println("Blue wants to fight!");
        System.out.println("Blue sends out " + P2Pkmn1.getName() +"!");
        System.out.println("Go " + P1Pkmn1.getName()+ "!");
        BattleSituation bat1 = new BattleSituation(P1Pkmn1, P2Pkmn1);




        //BattleMenu menu1 = new BattleMenu(P1Pkmn1, P2Pkmn1);



        //System.out.println(BattleSitutation()); //Batttle situation class show Enemy pkmn HP LVL and name and player's hp lvl name
        //Show battle menu 1. FIGHT 2. PKMN 3. Item 4.Run



    }
}
