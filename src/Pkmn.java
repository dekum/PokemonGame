import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Pkmn {
    private String name;
    private String type;
    private String species;
    private int HP;
    private int HPMax;
    private int atk;
    private int def;
    private int level;

    private String Weakness;
    List<String> weaknesses = new ArrayList<>();
    private PkmnMove[] pkmnMoveList = new PkmnMove[4];

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<String> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<String> weaknesses) {
        this.weaknesses = weaknesses;
    }

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
    public String showHP()
    {
        String output = HP+"/"+HPMax;
        //System.out.println(HP+"/"+HPMax);
        return output;
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

//        Connection conn = SQLiteJDBCDriverConnection.connect();
//        java.sql.Statement stmt;
//
//        try {
//            stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("Select HP From PokemonRegistry");
//            while (rs.next()) {
//                System.out.println(rs.getString("HP"));
//
//
//                //System.out.println("Group name: " + group);
//            }
//
//        }
//        catch(SQLException e) {
//            System.out.println("sql exception caught");
//            e.printStackTrace();
//        }
//        System.exit(0);

        this.name= name;
        this.type = type;
        this.HP = HP;
        this.HPMax = HP;
        this.atk = ATK;
        this.def = DEF;
        this.species = species;
        PkmnRegistry registry = new PkmnRegistry(species,pkmnMoveList, weaknesses, this);



    }

}
