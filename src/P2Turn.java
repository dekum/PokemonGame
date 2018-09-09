import java.util.Random;

public class P2Turn {


    P2Turn(Player P1, Player P2){
        //Enemy Turn
        //When I get real fancy cpu can choose to heal or change pokemon
        //but I"m going simple now and CPU will only attack and pick 4 attacks to choose from

        Pkmn pokemon1= P1.getCurrentPkmn();
        Pkmn pokemon2 = P2.getCurrentPkmn();

        System.out.println(pokemon2.getName() + " is going to attack!");
        Random random = new Random();
        int randoomInt = random.nextInt(4) +1; //Random code includes 0 so range is 0,1,2,3 so I want to add 1 so range is 1 thru 4

        PkmnMove moveUsed = pokemon2.getPkmnMoveList(randoomInt);
        //Tackle Attack
        System.out.println(pokemon2.getName() + " is using"+ moveUsed.getName()+ "!");
        CalculateDamange calc1 = new CalculateDamange(pokemon2,pokemon1, moveUsed,"none" );


        if(pokemon1.getHP() <= 0)
        {
            System.out.println("End of battle you lose! Try again!");
            System.exit(0);

        }
        BattleMenu bat1 = new BattleMenu(P1, P2);




    }
}
