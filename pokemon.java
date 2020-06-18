/* 
 * Contains data about pokemon
 *
 */
import move;

public class pokemon
{
    //Instance Variables
    private int pokedexNum;
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private move moveslot1;
    private move moveslot2;
    private move moveslot3;
    private move moveslot4;

    //Pokemon constructor
    public Pokemon(int pNum, String name, int health, int attack, int defense,
            int spAtt, int spDef, int speed, move move1, move move2, move move3,
            move move4)
    {
        this.pokedexNum = pNum;
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = spAtt;
        this.specialDefense = spDef;
        this.speed = speed;
        this.moveslot1 = move1;
        this.moveslot2 = move2;
        this.moveslot3 = move3;
        this.moveslot4 = move4;
    }

    /**
     * Returns Pokedex Number of Pokemon
     * 
     * @return int - Pokedex number
     */
    public int getPokedexNum()
    {
        return this.pokedexNum;
    }

    /**
     * Returns name of Pokemon
     *
     * @return String - Pokemon name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Returns health of Pokemon
     *
     * @return int - Health of Pokemon
     */
    public int getHealth()
    {
        return this.health;
    }

    /**
     * Returns attack of Pokemon
     *
     * @return int - Attack of Pokemon
     */
    public int getAttack()
    {
        return this.attack;
    }

    /**
     * Returns defense of Pokemon
     *
     * @return int - Defense of Pokemon
     */
    public int getDefense()
    {
        return this.defense;
    }

    /**
     * Returns special attack of Pokemon
     *
     * @return int - Special attack of Pokemon
     */
    public int getSpAtt()
    {
        return this.specialAttack;
    }

    /**
     * Returns special defense of Pokemon
     *
     * @return int - Special defense of Pokemon 
     */
    public int getSpDef()
    {
        return this.specialDefense;
    }

    /**
     * Returns speed of Pokemon
     *
     * @return int - Speed of Pokemon
     */
    public int getSpeed()
    {
        return this.speed;
    }

    /**
     * Returns first move of Pokemon
     *
     * @return move - First moveslot
     */
    public move getMove1()
    {
        return this.moveslot1;
    }
    
    /**
     * Returns second move of Pokemon
     *
     * @return move - Second moveslot
     */
     public move getMove2()
     {
         return this.moveslot2;
     }

     /**
      * Returns third move of Pokemon
      *
      * @return move - Third moveslot
      */
      public move getMove3()
      {
          return this.moveslot3;
      }

      /**
       * Returns fourth move of Pokemon
       *
       * @return move - Fourth moveslot
       */
       public move getMove4()
       {
           return this.moveslot4;
       }

}
