public class Pkmn {
    private String name;
    private String type;
    private String species;
    private int HP;
    private int HPMax;
    private int atk;
    private int def;
    private PkmnMove[] pkmnMoveList = new PkmnMove[4];

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        species = species;
    }


    public void showPkmnMoveList() {
        for (int i =0; i<4; i++)
        {

            System.out.println((i+1)+". "+ pkmnMoveList[i].getName());

        }

    }

    public void setPkmnMoveList(PkmnMove[] pkmnMoveList) {
        this.pkmnMoveList = pkmnMoveList;
    }

    public PkmnMove getPkmnMoveList(int id) {
        return pkmnMoveList[id-1];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHP() {
        return HP;
    }
    public int getHPMax() {
        return HPMax;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }





    Pkmn(String name, String type, int HP, int ATK, int DEF, String species){
        this.name= name;
        this.type = type;
        this.HP = HP;
        this.HPMax = HP;
        this.atk = ATK;
        this.def = DEF;
        this.species = species;
        PkmnRegistry registry = new PkmnRegistry(species,pkmnMoveList);



    }

}
