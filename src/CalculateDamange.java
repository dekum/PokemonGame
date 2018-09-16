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
        DamangeFormula dam1 = new DamangeFormula(moveUsed,atkPlayer, defPlayer);

        damange = dam1.getDamangeFinal();
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

