import java.util.ArrayList;

public class Player {
    private String name;
    private String trainerClass;
    private int age;
    private Pkmn[] Pkmnlist = new Pkmn[3];//Should be 2 but w/e
    private Pkmn currentPkmn;
    private ArrayList<Item> itemList = new ArrayList<Item>();

    public void showItemList() {
        for (int i = 0; i<itemList.size();i++)
        {

            System.out.println((i+1)+". " + itemList.get(i).getName() +" Amt: " +itemList.get(i).getQuantity());

        }

    }

    public Pkmn[] getPkmnlist() {
        return Pkmnlist;
    }

    public void setPkmnlist(Pkmn[] pkmnlist) {
        this.Pkmnlist = pkmnlist;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public void showPkmnList() {
        for (int i =0; i<3; i++)
        {

            System.out.println((i+1)+ ". "+  Pkmnlist[i].getName() + " "+ Pkmnlist[i].showHP() );

        }

    }

    public Pkmn getCurrentPkmn() { return currentPkmn; }





    public void setCurrentPkmn(Pkmn currentPkmn) {
        this.currentPkmn = currentPkmn;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainerClass() {
        return trainerClass;
    }

    public void setTrainerClass(String trainerClass) {
        this.trainerClass = trainerClass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public void setPkmnList(Pkmn pokemon,int id) {
        id = id-1;
        Pkmnlist[id] = pokemon;


    }

    public Pkmn getPkmnList(int id) {
        id = id-1;
        return Pkmnlist[id];


    }
    Player(String name, String trainerClass, int age ){
        this.name = name;
        this.trainerClass = trainerClass;
        this.age = age;


    }

}
