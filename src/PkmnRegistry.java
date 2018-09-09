public class PkmnRegistry {



    PkmnRegistry(String species,PkmnMove[] pkmnMoveList )
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


        }

    }




}
