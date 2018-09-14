import java.util.ArrayList;

public class Item {
  int amtHeal;
  String name;
  int quantity;
  ArrayList<String>effects = new ArrayList<String>();
  String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getAmtHeal() {
    return amtHeal;
  }

  public void setAmtHeal(int amtHeal) {
    this.amtHeal = amtHeal;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void changeItemQuantity( int ammount){
    //Works for both add and substraction
    this.quantity = this.quantity + ammount;

  }

  public ArrayList<String> getEffects() {
    return effects;
  }

  public void setEffects(ArrayList<String> effects) {
    this.effects = effects;
  }

  Item(String name){
    this.name = name;
    if (name == "Potion"){
      amtHeal = 50;
      effects.add("Heal HP");


    }
    if (name == "Lemonade"){
        amtHeal = 120;
        effects.add("Heal HP");

    }


  }

  public void useItem(Item item, Pkmn target)
  {

      for (int i = 0;  i <effects.size();i++)
      {
        if (effects.get(i) == "Heal HP"){
          target.setHP(target.getHP()+item.getAmtHeal());
          item.setMessage(target.getName()+" recovered " + item.getAmtHeal()+" HP! ");
          System.out.println(target.getName() +" Current HP: " + target.showHP());

        }
      }



  }

}
