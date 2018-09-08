public class PkmnRegistry {



    PkmnRegistry(String species,PkmnMove[] pkmnMoveList )
    {
        if (species == "Pikachu")
        {
            //Sent Tackle
            System.out.println(pkmnMoveList[0].getName() );
            pkmnMoveList[0].setName("In Pkmn Registry start");
            System.out.println(pkmnMoveList[0].getName() );
            PkmnMoveRegistry reg1 = new PkmnMoveRegistry();
            pkmnMoveList[0] = reg1.getPkmnMove("Tackle");
            //Send Thunderbolt

            pkmnMoveList[1] = reg1.getPkmnMove("Thunderbolt");
            //Send Iron Tail to the registry, store PkmnMove in PkmnMove List array
            pkmnMoveList[2] = reg1.getPkmnMove("Iron Tail");
            //Send Thunder
            //pkmnMoveList[3] = reg1.getPkmnMove("Thunder");

        }



    }




}
