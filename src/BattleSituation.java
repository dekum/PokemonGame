public class BattleSituation {
    //Call this to print the situation of the battle
    /*Output looks like
    Enemy1 Pkmn HP/FullHP (Pokemon Left)

    Player1 Pkmn HP/FullHP (Pokemon left)

    */


    BattleSituation(Pkmn P1, Pkmn P2 ){
        System.out.println("Battle Situation.");
        System.out.println("Blue: " + P2.getName() +" " + P2.getHP() +"/"+ P2.getHPMax() );
        System.out.println("Player: " + P1.getName() + " "+ P1.getHP()+ "/"+  P1.getHPMax() );

    }

}
