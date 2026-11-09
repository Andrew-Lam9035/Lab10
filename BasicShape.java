/**
 * A BasicShape object that stores the horizontal and vertical
 * adjustment
 *
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 11/8/2026
 */
public class BasicShape
{
    private int xAdj;
    private int yAdj;

    /**
     * Sets the horizantal and vertical adjustment to 0
     * 
     */
    public BasicShape()
    {
        xAdj = 0;
        yAdj = 0;
        
    }
    
    /**
     * Sets the horizantal and vertical adjustment to provided values
     * 
     * @param inXAdj Provided horizantal adjustment to set to
     * @param inYAdj Provided vertical adjustment to set to
     */
    public BasicShape(int inXAdj, int inYAdj)
    {
        xAdj = inXAdj;
        yAdj = inYAdj;
    
    }

    /**
     * Sets the horizantal adjustment to provided value
     *
     * @param inXAdj The new horizantal adjustment to change to
     */
    public void setXAdj(int inXAdj)
    {
        xAdj = inXAdj;
        
    }
    
    /**
     * Returns the horizantal adjustment of the arrow
     *
     * @return The horizantal adjustment of the arrow
     */
    public int getXAdj()
    {
        return xAdj;
        
    }
    
    /**
     * Sets the vertical adjustment to provided value
     *
     * @param inYAdj The new vertical adjustment to change to
     */
    public void setYAdj(int inYAdj)
    {
        yAdj = inYAdj;
        
    }
    
    /**
     * Returns the vertical adjustment of the arrow
     *
     * @return The vertical adjustment of the arrow
     */
    public int getYAdj()
    {
        return yAdj;
        
    }
    
    /**
     * Positions the shape vertically by printing blank lines
     * based on the current yAdj value
     * 
     */
    //@Override
    public void drawShapeOn()
    {
        for (int i = 0; i < yAdj; i++){
            System.out.println();
        }
        
    }
}
