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

            move1 = new PkmnMove("Thunderbolt", "Normal", 15, "None");

        }
        if (moveName == "Iron Tail") {

            move1 = new PkmnMove("Iron Tail", "Steel", 5, "+10 Defense");

        }
        if (moveName == "Thunder") {

            move1 = new PkmnMove("Thunder", "Electric", 20, "None");

        }

        return move1;

    }


}
