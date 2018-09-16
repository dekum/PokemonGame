public class PkmnMoveRegistry {
    int PP;
    int PPMax;

    PkmnMoveRegistry() {

    }

        public PkmnMove getPkmnMove(String name) {
        //Becareful with the String portiton of conditional branch, if there's an extra space It won't work.
        String moveName = name;


        PkmnMove move1 = null;

        if (moveName == "Ember") {

            move1 = new PkmnMove("Ember", "Fire", 110, "None");

        }
        if (moveName == "Flamethrower") {

            move1 = new PkmnMove("Flamethrower", "Fire", 90, "None");

        }

        if (moveName == "Iron Claw") {

            move1 = new PkmnMove("Iron Claw", "Steel", 20, "None");

        }


        if (moveName == "Iron Tail") {

            move1 = new PkmnMove("Iron Tail", "Steel", 5, "+10 Defense");

        }

        if (moveName == "Hydro Pump") {

            move1 = new PkmnMove("Hydro Pump", "Water", 110, "None");

        }

        if (moveName == "Tackle") {

            move1 = new PkmnMove("Tackle", "Normal", 40, "None");
        }
        if (moveName == "Thunderbolt") {

            move1 = new PkmnMove("Thunderbolt", "Normal", 90, "None");

        }

        if (moveName == "Thunder") {

            move1 = new PkmnMove("Thunder", "Electric", 110, "None");

        }

        if (moveName == "Water Gun") {

            move1 = new PkmnMove("Water Gun", "Water", 40, "None");

        }

        if (moveName == "Withdraw") {

            move1 = new PkmnMove("Withdraw", "Steel", 0, "+15 Defense. No Attack");

        }

        if (moveName == "Rock Throw") {

            move1 = new PkmnMove("Rock Throw", "Rock", 20, "None");

        }
        if (moveName == "Earthquake") {

            move1 = new PkmnMove("Earthquake", "Ground", 35, "None");

        }




        return move1;

    }


}
