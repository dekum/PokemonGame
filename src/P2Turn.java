import java.util.Random;

public class P2Turn {


    P2Turn(Pkmn P1, Pkmn P2){
        //Enemy Turn
        //When I get real fancy cpu can choose to heal or change pokemon
        //but I"m going simple now and CPU will only attack and pick 4 attacks to choose from

        System.out.println(P2.getName() + "is going to attack!");
        Random random = new Random();
        int randoomInt = random.nextInt(4) +1; //Random code includes 0 so range is 0,1,2,3 so I want to add 1 so range is 1 thru 4

        //Should make pokmn ID to make this easy but I know were using squrtle for test
        randoomInt = 1;
        if (randoomInt == 1)
        {
            //Tackle Attack
            System.out.println(P2.getName() + "is using Tackle!");
            CalculateDamange calc1 = new CalculateDamange(P2, P1, 10, 1);
            //So lets see how easy Java switches P1 and P2 stats, could save alot of time


        }

        if(P1.getHP() <= 0)
        {
            System.out.println("End of battle you lose! Try again!");
            System.exit(0);

        }
        BattleMenu bat1 = new BattleMenu(P1, P2);




    }
}
