import static com.oracle.jrockit.jfr.Transition.From;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PkmnRegistry {


    private void getPokemonMove(){
        Connection conn = SQLiteJDBCDriverConnection.connect();
        java.sql.Statement stmt;

        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select Pokemon From PokemonMoves");
            while (rs.next()) {
                System.out.println(rs.getString("Pokemon"));


                //System.out.println("Group name: " + group);
            }

        }
        catch(SQLException e) {

        }




    }


    PkmnRegistry(String species,PkmnMove[] pkmnMoveList, List<String> weaknesses)
    {
        //Becareful with the String portiton of conditional branch, if there's an extra space It won't work.
        if (species == "Pikachu")
        {


            PkmnMoveRegistry reg1 = new PkmnMoveRegistry();
            //Sent Tackle  to the registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[0] = reg1.getPkmnMove("Tackle");
            //Send Thunderbolt to the registry, store PkmnMove in PkmnMove List array

            pkmnMoveList[1] = reg1.getPkmnMove("Thunderbolt");
            //Send Iron Tail to the registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[2] = reg1.getPkmnMove("Iron Tail");
            //Send Thunder to the  registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[3] = reg1.getPkmnMove("Thunder");

            weaknesses.add("Rock");
            weaknesses.add("Ground");



        }

        if (species == "Charmander")
        {


            PkmnMoveRegistry reg1 = new PkmnMoveRegistry();
            //Sent Tackle  to the registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[0] = reg1.getPkmnMove("Tackle");
            //Send Thunderbolt to the registry, store PkmnMove in PkmnMove List array

            pkmnMoveList[1] = reg1.getPkmnMove("Ember");
            //Send Iron Tail to the registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[2] = reg1.getPkmnMove("Iron Claw");
            //Send Thunder to the  registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[3] = reg1.getPkmnMove("Flamethrower");
            weaknesses.add("Water");


        }


        if (species == "Squirtle")
        {


            PkmnMoveRegistry reg1 = new PkmnMoveRegistry();

            //Sent Move  to the registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[0] = reg1.getPkmnMove("Water Gun");
            //Sent Move  to the registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[1] = reg1.getPkmnMove("Tackle");
            //Sent Move  to the registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[2] = reg1.getPkmnMove("Withdrawl");
            //Sent Move  to the registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[3] = reg1.getPkmnMove("Hydro Pump");

            weaknesses.add("Electric");
        }

        if (species == "Geodude")
        {


            PkmnMoveRegistry reg1 = new PkmnMoveRegistry();
            //Sent Tackle  to the registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[0] = reg1.getPkmnMove("Tackle");
            //Send Thunderbolt to the registry, store PkmnMove in PkmnMove List array

            pkmnMoveList[1] = reg1.getPkmnMove("Rock Throw");
            //Send Iron Tail to the registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[2] = reg1.getPkmnMove("Withdrawl");
            //Send Thunder to the  registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[3] = reg1.getPkmnMove("Earthquake");

            weaknesses.add("Steel");
            weaknesses.add("Water");



        }

    }




}
