/**
 * Demo to run the RightArrow and LeftArrow classes
 *
 * @author Andrew Lam, alam001@student.sdccd.edu
 * @version v1.0
 * @since 11/8/2026
 */
public class ArrowDemo{
public static void main(String[] args){
    
    
    RightArrow right1 = new RightArrow();
    
    
    right1.drawShapeOn();
    right1.drawShape();
    
    
    right1.setXAdj(10);
    
    right1.drawShapeOn();
    right1.drawShape();
    
    
    right1.setYAdj(5);
    
    right1.drawShapeOn();
    right1.drawShape();
    
    right1.setArrowDim(10, 15);
    
    right1.drawShapeOn();
    right1.drawShape();
    
    RightArrow right2 = new RightArrow(5, 10, 15, 14);
    
    right2.drawShapeOn();
    right2.drawShape();
    
    
    LeftArrow left1 = new LeftArrow(13, 0, 15, 15);
    
    left1.drawShapeOn();
    left1.drawShape();
    
    left1.setArrowDim(10, 10);
    
    left1.drawShapeOn();
    left1.drawShape();
    
    left1.setXAdj(5);
    
    left1.drawShapeOn();
    left1.drawShape();
    
    left1.setYAdj(5);
    
    left1.drawShapeOn();
    left1.drawShape();
   
    LeftArrow left2 = new LeftArrow();
    
    left2.drawShapeOn();
    left2.drawShape();
    
}
}
