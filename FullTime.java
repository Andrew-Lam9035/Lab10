
/**
 * A FullTime object that holds the salary of the person
 *
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 11/7/2026
 */
public class FullTime extends Employee
{
    private double salary;
    
    /**
     * Sets the person's salary to 0.0 along with initializing
     * the inherited Employee fields
     * 
     */
    public FullTime()
    {
        super();
        salary = 0.0;
    
    }
    
    /**
     * Sets the person's salary to provided salary along with initializing
     * the inherited Employee fields with the provided name, hire year, and id num
     * 
     * @param inName Name entered when making the object
     * @param inHireYear Hire year entered when making the object
     * @param inIdNum Id number entered when making the object
     * @param inSalary Salary entered when making the object
     */
    public FullTime(String inName, int inHireYear, String inIdNum, double inSalary)
    {
        super(inName, inHireYear, inIdNum);
        salary = inSalary;
        
    }
    
    /**
     * Sets the person's salary to the new inputed salary
     * 
     * @param inSalary The person's new salary to change to
     */
    public void setSalary(double inSalary)
    {
        salary = inSalary;
        
    }
    
    /**
     * Returns the salary of the person
     * 
     * @return the salary of the person
     */
    public double getSalary()
    {
        return salary;
        
    }
    
    
    
    /**
     * Overrides the toString() method from the Object class
     * to return the Salary nicely formatted
     * along with the string of the name, id number, year hired, and years of service
     *
     * @return String formatted with the name, id number, year hired, years of service, and salary
     */
    public String toString()
    {
        return String.format("%s \nSalary: $%,.2f", super.toString(), salary);
        
    }
}