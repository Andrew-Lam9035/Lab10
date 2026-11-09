/**
 * A RightArrow object that creates an arrow pointing right
 *
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 11/8/2026
 */
public class RightArrow extends BasicShape
{
    private int tail;
    private int width;

    /**
     * Sets the tail and width of the arrow to 5
     * 
     */
    public RightArrow()
    {
        super();
        tail = 5;
        width = 5;
        
    }
    
    /**
     * Sets the tail and width to provided values along with 
     * initializing the inherited BasicShape with inXAdj and inYAdj
     * 
     * @param inXAdj Provided horizantal adjustment to set to
     * @param inYAdj Provided vertical adjustment to set to
     * @param inTail Provided tail to set to
     * @param inWidth Provided width to set to
     */
    public RightArrow(int inXAdj, int inYAdj, int inTail, int inWidth)
    {
        super(inXAdj, inYAdj);
        tail = inTail;
        width = inWidth;
    
    }

    /**
     * Sets the tail and width to provided value
     *
     * @param inTail The new tail to change to
     * @param inWidth The new width to change to
     */
    public void setArrowDim(int inTail, int inWidth)
    {
        tail = inTail;
        width = inWidth;
        
    }
    
    /**
     * Draws the tail of * before the arrow head
     * 
     */
    private void drawTail()
    {
        for (int i = 0; i < tail; i++){
            System.out.print("*");
        }
    }
    
    /**
     * Add spaces in front of the arrow moving the arrow to the right
     * 
     */
    private void moveArrowForward()
    {
        int spaceAmount = super.getXAdj();
        for (int i = 0; i < spaceAmount; i++){
            System.out.print(" ");
        }
        
    }
    
    /**
     * Fills in the necessary spaces before the arrow head
     * 
     */
    private void drawSpaces()
    {
        int spaceAmount = tail;
        for (int i = 0; i < spaceAmount; i++){
            System.out.print(" ");
        }
        
    }
    
    /**
     * Draws an arrow pointing to the right
     * 
     */
    //@Override
    public void drawShape()
    {
        int halfWidth = width / 2;
        
        //Top of the arrow head
        moveArrowForward();
        drawSpaces();
        System.out.println("*");
        
        //Upper half
        for(int i = 0; i < halfWidth-1; i++)
        {
            moveArrowForward();
            drawSpaces();
            System.out.print("*");
            
            for(int v = 0; v < i; v++) {
                System.out.print(" ");
            }
            System.out.println("*");
            
        }
        
        //Middle
        moveArrowForward();
        drawTail();
        System.out.print("*");        
        
        for(int i = 0; i < (halfWidth-1); i++){
            System.out.print(" ");
        }
        System.out.println("*");    
        
        //Lower half
        
        for(int i = halfWidth-1; i > 0; i--)
        {
            moveArrowForward();
            drawSpaces();
            System.out.print("*");
            
            for(int v = i-1; v > 0; v--) {
                System.out.print(" ");
            }
            System.out.println("*");
            
        }
        
        //Bottom of the arrow head
        moveArrowForward();
        drawSpaces();
        System.out.println("*");
        
    }
}
