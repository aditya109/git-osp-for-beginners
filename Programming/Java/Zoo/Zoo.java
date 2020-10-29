
/**
 * This is our Zoo
 *
 * @author Yasas Sandeepa
 * @version 25-10-2020
 */
import java.util.Iterator;
import java.util.LinkedList;

public class Zoo {

    private LinkedList<Animal> animalList;

    public Zoo() {
        this.animalList = new LinkedList<Animal>();
    }

    public LinkedList<Animal> getAnimalList() {
        return animalList;
    }

    public void addAnimal(Animal animal) {
        this.getAnimalList().add(animal);

    }

    // todo: adding proper logic to get the animal
    public void feedAnimal(String name) {
        System.out.println("You are Feeding to " + name);
    }

    public void viewAnimals() {
        System.out.println("==========All animals in the ZOO===========");
        LinkedList<Animal> list = this.getAnimalList();
        Iterator<Animal> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================================");
        System.out.println("Thank you!");

    }
//I removed the largestPopulation method

}
