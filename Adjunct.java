
/**
 * An Adjunct object that holds hours and hourly rate of the person
 *
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 11/7/2026
 */
public class Adjunct extends Employee
{
    private double hours;
    private double hrRate;
    
    /**
     * Sets the person's hours and hrRate to 0.0 along with initializing
     * the inherited Employee fields
     * 
     */
    public Adjunct()
    {
        super();
        hours = 0.0;
        hrRate = 0.0;
    
    }
    
    /**
     * Sets the person's hours to provided hours and hrRate to inputted hourly rate along with initializing
     * the inherited Employee fields with the provided name, hire year, and id num
     * 
     * @param inName Name entered when making the object
     * @param inHireYear Hire year entered when making the object
     * @param inIdNum Id number entered when making the object
     * @param inHours Hours entered when making the object
     * @param inHrRate Hourly rate entered when making the object
     */
    public Adjunct(String inName, int inHireYear, String inIdNum, double inHours, double inHrRate)
    {
        super(inName, inHireYear, inIdNum);
        hours = inHours;
        hrRate = inHrRate;
        
    }
    
    /**
     * Calculates the salary of the person by multiplying the hours the person worked with the hourly rate
     *
     * @return The salary of the person from the hours and hrRate
     */
    public double getSalary()
    {
        return hours * hrRate;
        
    }
    
    /**
     * Overrides the toString() method from the Object class
     * to return the hours, hrRate, salary nicely formatted
     * along with the string of the name, id number, year hired, and years of service
     *
     * @return String formatted with the name, id number, year hired, years of service, hours, hourly rate and salary
     */
    @Override
    public String toString()
    {
        return String.format("%s \nHours: %.1f, Hourly Rate: %.2f, Salary: $%,.2f", super.toString(), hours, hrRate, getSalary());
        
    }
}