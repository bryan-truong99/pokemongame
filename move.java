/**
 * Moves interface and moves are stored here
 */
public class move
{
    //Instance variables
    String name;
    int basePower;
    int pp;
    String description;

    //Constructor
    public move(String name, int bp, int pp, String des)
    {
        this.name = name;
        this.basePower = bp;
        this.pp = pp;
        this.description = des;
    }

    //Returns name
    public String getName()
    {
        return this.name;
    }

    //Returns base power
    public int getBasePower()
    {
        return this.basePower;
    }

    //Returns pp
    public int getPP()
    {
        return this.pp;
    }

    //Returns description of the move
    public int getDescription()
    {
        return this.description;
    }
}

