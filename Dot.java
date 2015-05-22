
/**
 * Write a description of class dot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Dot
{
    private double dx,dy;
    
    public double getVx()
    {
        return dx;
    }
    
    public double getVy()
    {
        return dy;
    }
    
    public abstract void interact(Dot d);
}
