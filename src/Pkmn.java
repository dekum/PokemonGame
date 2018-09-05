public class Pkmn {
    private String name;
    private String type;
    private int HP;
    private int HPMax;
    private int atk;
    private int def;
    private int PkmnID;
    private String[] PkmnOrderNo = new String[3];


    public int getPkmnID() {
        return PkmnID;
    }

    public void setPkmnID(int pkmnID) {
        PkmnID = pkmnID;
    }

    public String[] getPkmnOrderNo() {
        return PkmnOrderNo;
    }

    public void setPkmnOrderNo(String name,int id) {
        PkmnOrderNo[id] = name;
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



    Pkmn(){

    }

    Pkmn(String n, String t, int h, int a, int d){
        name= n;
        type = t;
        HP = h;
        HPMax = h;
        atk = a;
        def = d;

    }

}
