public class CalculateDamange {
    //(Attack power + Damagne power(*2 for weakness)) - (def/20

    //Using tackle attack value 10

    //May need a better dmangae formula

    private int damange;
    private int atkVal;
    private int mulitipier;
    private int numOfWeakness;
    private String specialAtr;

    public int getDamange() {
        return damange;
    }

    public void setDamange(int damange) {
        this.damange = damange;
    }

    CalculateDamange(Pkmn atkPlayer, Pkmn defPlayer, PkmnMove moveUsed, String specialAtr){
        //In here we are assuming P1 is attacking
        //We we get serious in the code, THe multipler wont be initlziaed here
        //but this is a sample so keep it here
        atkVal = moveUsed.getAtkVal();
        mulitipier = 1;

        for (int i = 0; i<defPlayer.getWeaknesses().size();i++)
        {
            if (defPlayer.getWeaknesses().get(i) == moveUsed.getType() )
                numOfWeakness++;

        }
        if (numOfWeakness == 1)
        {
            mulitipier= mulitipier * 2;

        }
        if (numOfWeakness == 2)
        {
            mulitipier= mulitipier * 4;

        }


        damange = (atkPlayer.getAtk()*2 +  atkVal * mulitipier) - (defPlayer.getDef()/2);
        defPlayer.getDef();
        defPlayer.getHP();
        System.out.println(damange);
        //Subtract damange from defending pkmn's hp
        //Before doing so check if moveUsed speical attrivute to see if it is a non attacking move
        if (moveUsed.getSpecialAttribute() == "+15 Defense. No Attack") {
            damange = 0;
            atkPlayer.setDef(atkPlayer.getDef() + 15);
            System.out.println("Here?");
        }

        if (moveUsed.getSpecialAttribute() == "+10 Defense") {
            atkPlayer.setDef(atkPlayer.getDef() + 10);
            System.out.println("Here?");
        }

        defPlayer.setHP(defPlayer.getHP()- damange);
        System.out.println(defPlayer.getName() + " Damange = " + damange + " Current HP " + defPlayer.getHP()+ " / " + defPlayer.getHPMax());






    }



}

