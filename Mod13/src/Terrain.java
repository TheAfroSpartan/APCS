/**
 * This class defines a basic Terrain.
 * Contains a getter method.
 *
 * @author (Andrew Owens)
 * @version (1/31/19)
 */

public class Terrain
{
    // instance variables
    private int length, width;

    // Constructor for objects of class Terrain
    public Terrain(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }
     // Concatenates a String to show the dimensions of the land
    public String getTerrainSize()
    {
        return "Land has dimensions " + length + " X " + width;
    }
}