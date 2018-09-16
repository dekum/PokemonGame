import java.util.Random;

public class DamangeFormula {
  private double firstDamangePart;
  private double secondDamangePart;
  private double damangeSubTotal;
  private double modifier;

  public int getDamangeFinal() {
    return (int)Math.round(damangeFinal);
  }

  public void setDamangeFinal(double damangeFinal) {
    this.damangeFinal = damangeFinal;
  }

  private double damangeFinal;
  private double critical;
  private int numOfWeakness;
  private String specialAtr;
  private double  typeEffectiness;
  //Here I use the offical pokemon damange formula
  /*
  [Damange = Top  ([2*Level]/5+2)*Power* A/D)    Then +2 ]
  [BottomDenomoter    All divied by  50                   ]
     All that is times by a Multiplayer

     Multiplayer = Critical * randdom * StatBonus* Type Adv * Other
     Wow this is complicated

     Critical is 1/16 = 6.66% It does change but will decide later in program. simple
     Random is a random  number from .85 to 1. simple.
     STAT is will 1.5 if Pokemon Type and Move type are same. 1.0 if not the same
     Type Advantage can be .25 .5 1 2 or 4(super effective) based on move and pomnn type
     other usualyy stays 1

   */
  DamangeFormula(PkmnMove moveUsed, Pkmn atkPokemon, Pkmn defPkmn){
    firstDamangePart= (  ( (2*atkPokemon.getLevel())/5 ) +2 ); //First part
    secondDamangePart=  ((double)atkPokemon.getAtk() / (double)defPkmn.getDef()) *(double)moveUsed.getAtkVal()  ; // Second part
//    System.out.println(moveUsed.getAtkVal()*(double)atkPokemon.getAtk() / (double)defPkmn.getDef() ) ;
//    System.out.println("Should be 100.51..."+moveUsed.getAtkVal()+"\n"+atkPokemon.getAtk()+"\n"+defPkmn.getDef());

    damangeSubTotal = ((firstDamangePart * secondDamangePart)/50)+2; //Add up sall damage before multiplier
    double STAT = 1.0; //Default;
    if (moveUsed.getType() == atkPokemon.getType())
       STAT = 1.5; //If move type and pokemon type are same 1.h bonus
    Random random = new Random(); //intalize a random number
    double randoomInt = random.nextInt(15) +85; //randomInt will get a random number been 85 amd 100
    randoomInt = randoomInt /100; //divide by 100  so damage fluctuates
    // each attack will have between 85 to 100% full power
    critical =1;
    int criticalChance = random.nextInt(16);// 1/16 change to get a critical
    if (criticalChance ==1)
      critical = 2; // Critcal wil double damage
    //ADD TYP EEFFECIVENESS\
    typeEffectiness = 1;
    for (int i = 0; i<defPkmn.getWeaknesses().size();i++)
    {
      if (defPkmn.getWeaknesses().get(i) == moveUsed.getType() )
        numOfWeakness++;

    }
    if (numOfWeakness == 1)
    {
      typeEffectiness= typeEffectiness * 2;

    }
    if (numOfWeakness == 2)
    {
      typeEffectiness= typeEffectiness * 4;

    }

    // *Special will ad later

    modifier = STAT * randoomInt * critical * typeEffectiness;

    damangeFinal = damangeSubTotal * modifier;

//    System.out.println(typeEffectiness+
//            "Eff\n"+
//            critical +"crit\n"+
//            randoomInt+ "rand \n"+
//            criticalChance+"critch \n"+
//            firstDamangePart+ "first\n"+
//            secondDamangePart+ "sec\n"+
//            damangeFinal + "final\n"+
//            damangeSubTotal+"sub\n"+
//            modifier);

  }
}
