import java.util.List;

// This is our Zoo
public class Zoo {

    private List<Animal> animalList;

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void feedAnimal(String name) {
        System.out.println("You are Feeding to " + name);
    }


}
