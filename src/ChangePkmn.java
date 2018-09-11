public class ChangePkmn {
    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    private boolean cancel;



   ChangePkmn(Player P1){
        P1.showPkmnList();
       System.out.println("Enter 0 to cancel.");
        ValidateIntInput  valid1 = new ValidateIntInput(0,3);

        int value1 = valid1.getValue();
       Pkmn pokemon1 = P1.getCurrentPkmn();

       if (value1 ==0)
       {
            cancel = true;
       }else if(value1 != 1)
       {
           if (P1.getPkmnList(value1).getHP() < 0){
               System.out.printf("Sorry %s fainted try again",P1.getName());

           }else{
               P1.setCurrentPkmn(P1.getPkmnList(value1));

           }


           System.out.println("You switched " + pokemon1.getName() + " to " + P1.getCurrentPkmn().getName() );

           Pkmn Pokemon1 = P1.getPkmnList(value1);
           System.out.println("Your current Pkmn is: "+ Pokemon1.getName() +" Type: " + Pokemon1.getType() + "\nCurrent HP = " +
                   Pokemon1.getHP() + " ATK = " + Pokemon1.getAtk()+ " DEF = " + Pokemon1.getDef() );
           cancel = false;
       }






   }
}

