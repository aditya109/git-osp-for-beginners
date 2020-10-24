import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Zoo here.
 *
 * @author Gustav Sejr Rasmussen
 * @version 05-10-2020
 */
public class Zoo
{
    // instance variables - replace the example below with your own
    private String name;
    private ArrayList<Animal> animals;

    /**
     * Constructor for objects of class Zoo
     */
    public Zoo(String name)
    {
        this.name = name;
        animals = new ArrayList<Animal>();
    }

    public String getName() {
        return name;
    }

    public void add(Animal a) {
        animals.add(a);
    }

    public int animals() {
        int result = 0;
        for(Animal a : animals) {
            if(a.getFemales() > 0 && a.getMales()>0) {
                result += a.getFemales()+a.getMales();
            }
        }
        return result;
    }

    public Animal largestPopulation() {
        Animal result = null;
        for(Animal a : animals) {
            if(result == null || (a.getFemales() + a.getMales()) > (result.getFemales() + result.getMales())) {
                result = a;
            }
        }
        return result;
    }

    public void printZoo() {
        Collections.sort(animals);
        System.out.println(name + ":");
        for(Animal a : animals) {
            System.out.println(a);
        }
    }
}
