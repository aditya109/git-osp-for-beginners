
/**
 * Write a description of class Animal here.
 *
 * @author Gustav Sejr Rasmussen
 * @version 05-10-2020
 */
public class Animal implements Comparable<Animal>
{
    // instance variables - replace the example below with your own
    private String name;
    private int females;
    private int males;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(String name, int females, int males)
    {
        this.name = name;
        this.females = females;
        this.males = males;
    }

    public String getName() {
        return this.name;
    }

    public int getFemales() {
        return this.females;
    }

    public int getMales() {
        return this.males;
    }

    public String toString() {
        return name + ": "  + females + " female and " + males + " male";
    }

    public int compareTo(Animal other) {
        if(females != other.females) {
            return other.females-females;
        } else
            return other.males-males;
    }

}
