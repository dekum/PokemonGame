public class PkmnMoveRegistry {
    int PP;
    int PPMax;

    PkmnMoveRegistry() {

    }

    public PkmnMove getPkmnMove(String name) {
        String moveName = name;


        PkmnMove move1 = null;
        if (moveName == "Tackle") {

            move1 = new PkmnMove("Tackle", "Normal", 10, "None");
        }
        if (moveName == "Thunderbolt") {

            move1 = new PkmnMove("Tackle", "Normal", 10, "None");

        }

        return move1;
    }


}
