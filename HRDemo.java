
/**
 * Demo to run the FullTime and Adjunct classes
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 11/7/2026
 */
public class HRDemo{
public static void main(String[] args){
    
    FullTime fred = new FullTime("Flinstone, Fred", 2013, "BR-1", 75000.1234);
    
    Adjunct barney = new Adjunct("Rubble, Barney", 2014, "BR-2", 320, 60.55);
    
    FullTime wilma = new FullTime();
    
    wilma.setName("Flintstone, Wilma");
    wilma.setIdNum("BR-3");
    wilma.setHireYear(2016);
    wilma.setSalary(78123.2468);
    
    Employee betty = new Employee("Rubble, Betty", 2020, "BR-4");
    
    FullTime wilma2 = new FullTime("Slate, Wilma", 2016, "BR-3", 78123.2468);
    
    Person[] staff = {fred, barney, wilma, betty, wilma2};
    
    for (int i = 0; i < staff.length; i++)
    {
        System.out.println("Employee" + (i+1));
        
        System.out.println(staff[i].toString());
        
        System.out.println();
        
    }
    
    System.out.printf("wilma and wilma2 are the same person: %B", wilma.equals(wilma2));
    
    System.out.println("\n");
    
    wilma.setName("Slate, Wilma");
    
    Person[] staff2 = {fred, barney, wilma, betty};
    
    for (int i = 0; i < staff2.length; i++)
    {
        System.out.println("Employee" + (i+1));
        
        System.out.println(staff2[i].toString());
        
        System.out.println();
        
    }
}
}