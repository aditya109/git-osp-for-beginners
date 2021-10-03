
/**
 * This is animal Entity
 *
 * @author Yasas Sandeepa
 * @version 25-10-2020
 */
public class Animal {

    private String name;
    private String age;
    private String gender;
    private String species; //we can change this to enum in another version
    private String mostLikedFood;

    public Animal(String name, String age, String gender, String species, String mostLikedFood) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.species = species;
        this.mostLikedFood = mostLikedFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getMostLikedFood() {
        return mostLikedFood;
    }

    public void setMostLikedFood(String mostLikedFood) {
        this.mostLikedFood = mostLikedFood;
    }

    @Override
    public String toString() {
        return "This animal-> " +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", species='" + species + '\'' +
                ", mostLikedFood='" + mostLikedFood + '\'';
    }
  
    //I remove the Comparable implementation and compareTo function

}
