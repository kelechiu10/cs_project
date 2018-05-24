/**
 * Knight Unit Class
 * Attack: 20
 * Defence: 20
 * Health: 65
 * Movement: 5
 * Abilities:
 * -(no abilities)
 *
 * @author Matthew Oh
 * @version 5/22/18
 */
public class Knight extends Unit
{
    /**
     * Constructor for Knight
     */
    public Knight()
    {
        super(20,20,65,5);
    }
    
    /**
     * Gets Knight's ability
     * @param target target of the ability
     */
    public Action getAbility(Position target)
    {
        return attack();
    }
    
    /**
     * Returns the range of the unit's ability
     * @return the range of the ability 
     */
    public double getRange()
    {
        return 1.5;
    }
}