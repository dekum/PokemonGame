public class ItemMenu {

  public boolean isCancel() {
    return cancel;
  }

  public void setCancel(boolean cancel) {
    this.cancel = cancel;
  }

  private boolean cancel;

  ItemMenu(Player P1){
    System.out.println("Item List");
    P1.showItemList();
    System.out.println("Choose the item you want to use, 0 to Cancel");
    ValidateIntInput valid1 = new ValidateIntInput(0,P1.getItemList().size());
    if (valid1.getValue() != 0)
    {
      int input1 = valid1.getValue();
      Item itemUsed = P1.getItemList().get(input1);
      //Now I have the item that the user choose

      //Need a pokemon Target
      System.out.println("Select Pokemon to use item on");
      P1.showPkmnList();
      valid1 = new ValidateIntInput(1,3);
      int value1 = valid1.getValue();
      Pkmn targetPkmn = P1.getCurrentPkmn();
      //Now I have the target pokemon is going to use the item on


      itemUsed.useItem(itemUsed, targetPkmn);
      System.out.println(itemUsed.message);
      itemUsed.changeItemQuantity(-1);


    }



  }


}
