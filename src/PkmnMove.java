public class PkmnMove {
    //All pkmn moves will be an object of this class
    //Pkmn classes objects willh have their own PkmnMoveList array which will store each move

    private String name, type;
    private int atkVal;
    private String specialAttribute;

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

    public int getAtkVal() {
        return atkVal;
    }

    public void setAtkVal(int atkVal) {
        this.atkVal = atkVal;
    }

    public String getSpecialAttribute() {
        return specialAttribute;
    }

    public void setSpecialAttribute(String specialAttribute) {
        this.specialAttribute = specialAttribute;
    }
    PkmnMove(String name, String type, int atkVal, String specialAttribute){
            this.name= name;
            this.type = type;
            this.atkVal = atkVal;

        }

    }

