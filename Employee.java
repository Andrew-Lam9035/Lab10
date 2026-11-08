
/**
 * An Employee object that holds the hire year and id number of the person
 *
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 11/7/2026
 */
public class Employee extends Person
{
    private int hireYear;
    private String idNum;

    /**
     * Sets the person's hireYear to 0 and idNum to No Id yet along with initializing
     * the inherited Person fields
     */
    public Employee()
    {
        super();
        hireYear = 0;
        idNum = "Onboarding";
    
    }
    
    /**
     * Sets the person's hireYear to provided hire year and idNum to provided Id Number 
     * along with initializing the inherited Person fields with provided name
     * 
     * @param inName Name entered when making the object
     * @param inHireYear Hire year entered when making the object
     * @param inIdNum Id number entered when making the object
     */
    public Employee(String inName, int inHireYear, String inIdNum)
    {
        super(inName);
        hireYear = inHireYear;
        idNum = inIdNum;
        
    }
    
    /**
     * Sets the person's hire year to the new inputed hire year
     *
     * @param inHireYear The person's new hire year to change to
     */
    public void setHireYear(int inHireYear)
    {
        hireYear = inHireYear;
        
    }
    
    /**
     * Returns the person's hire year
     * 
     * @return The person's hire year
     */
    public int getHireYear()
    {
        return hireYear;
        
    }

    /**
     * Sets the person's id number to the new inputed id number
     *
     * @param inIdNum The person's new id number to change to
     */
    public void setIdNum(String inIdNum)
    {
        idNum = inIdNum;
        
    }
    
    /**
     * Returns the person's id number
     *
     * @return The person's id number
     */
    public String getIdNum()
    {
        return idNum;
        
    }
    
    /**
     * Find the person's years of service by subtracting the current year with the person's year of hire
     *
     * @return The person's years of service
     */
    public int getServiceYears()
    {
        return super.CURRENT_YEAR - hireYear;
        
    }
    
    /**
     * Checks if the person is the same as another person by checking their id number
     *
     * @param o A person object to compare to
     * @return A boolean whether if this person is the same that the other person
     */
    public boolean equals (Object o)
    {
    boolean isEqual = false;
    
    if (o != null && getClass()==o.getClass())
    {
        
        Employee copy = (Employee)o;
        
        if (idNum.equalsIgnoreCase(copy.idNum)) {
            isEqual = true;
        }
        
    }
    
    return isEqual;
    
    }
    
    
    /**
     * Overrides the toString() method from the Object class
     * to return the id number, year hired, years of service nicely formatted
     * along with the string of the name
     *
     * @return String formatted with the name, id number, year hired, and years of service
     */
    @Override
    public String toString()
    {
        return String.format("%s \nID Number: %s\nYear Hired: %d, Years Of Service: %d", super.toString(), idNum, hireYear, getServiceYears());
        
    }
}