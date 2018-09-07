public class Player {
    private String name;
    private String trainerClass;
    private int age;
    private Pkmn[] Pkmnlist = new Pkmn[3];
    private Pkmn currentPkmn;

    public Pkmn getCurrentPkmn() {
        return currentPkmn;
    }

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
