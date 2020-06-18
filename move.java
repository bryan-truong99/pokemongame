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
    boolean isPhysical;

    //Constructor
    public move(String name, int bp, int pp, String des, isPhysical)
    {
        this.name = name;
        this.basePower = bp;
        this.pp = pp;
        this.description = des;
        this.isPhysical = isPhysical;
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

    //Returns if the move if physical 
    public boolean getPhys()
    {
        return this.isPhysical;
    }
}

