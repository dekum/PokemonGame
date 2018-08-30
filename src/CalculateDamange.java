public class CalculateDamange {
    int damange;

    public int getDamange() {
        return damange;
    }

    public void setDamange(int damange) {
        this.damange = damange;
    }

    CalculateDamange(Pkmn atkPlayer, Pkmn defPlayer, int atkVal, int mulitipier){
        //In here we are assuming P1 is attacking
        //We we get serious in the code, THe multipler wont be initlziaed here
        //but this is a sample so keep it here

        damange = (atkPlayer.getAtk()*2 +  atkVal * mulitipier) - (defPlayer.getDef()/2);
        defPlayer.getDef();
        defPlayer.getHP();
        System.out.println(damange);
        //Subtract damange from defending pkmn's hp
        defPlayer.setHP(defPlayer.getHP()- damange);
        System.out.println(defPlayer.getName() + " Damange = " + damange + " Current HP " + defPlayer.getHP()+ " / " + defPlayer.getHPMax());






    }



}

