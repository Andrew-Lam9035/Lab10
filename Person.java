
/**
 * A Person object that holds the name of the person
 *
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 11/7/2026
 */
public class Person
{
    private String name;
    public static final int CURRENT_YEAR = 2025;

    /**
     * Sets the person's name to "No name yet"
     * 
     */
    public Person()
    {
        name = "No name yet";
    
    }
    
    /**
     * Sets the person's name to the provided name when the object is created
     * 
     * @param inName Name entered when making the object
     */
    public Person(String inName)
    {
        name = inName;
    
    }

    /**
     * Sets the person's name to the new provided name
     *
     * @param inName The person's new name to change to
     */
    public void setName(String inName)
    {
        name = inName;
        
    }
    
    /**
     * Returns the name of the person
     *
     * @return The name of the person
     */
    public String getName()
    {
        return name;
        
    }
    
    /**
     * Overrides the toString() method from the Object class
     * to return the person's name in a formatted String.
     *
     * @return String formatted with the person's name
     */
    @Override
    public String toString()
    {
        return String.format("Name: %s", name);
        
    }
}