import java.util.Random;

public class DamangeFormula {
  private double firstDamangePart;
  private double secondDamangePart;
  private double damangeSubTotal;
  private double modifier;
  private double damangeFinal;
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
    firstDamangePart= (  ( (2*atkPokemon.getLevel())/5 ) +2 );
    secondDamangePart= moveUsed.getAtkVal() * (atkPokemon.getAtk() / defPkmn.getDef());
    damangeSubTotal = ((firstDamangePart * secondDamangePart)/50)+2;
    int STAT = 1.0;
    if (moveUsed.getType() == atkPokemon.getType())
       STAT = 1.5;
    Random random = new Random();
    int randoomInt = random.nextInt(15) +85;
    //ADD TYP EEFFECIVENESS\
    modifier = STAT+ randoomInt;

    damangeFinal = damangeSubTotal+ modifier;

  }
}
