
/**
 * Write a description of class Driver here.
 *
 * @author Gustav Sejr Rasmussen
 * @version 05-10-2020
 */
public class Driver
{
    public static void exam() {
        Animal a1 = new Animal("Elephant" , 10, 15);
        Animal a2 = new Animal("Tiger", 9, 2);
        Animal a3 = new Animal("Elephant", 11, 13);
        Animal a4 = new Animal("Monkey", 20, 20);
        Animal a5 = new Animal("Lion", 9, 5);

        System.out.println("Opgave 3:");
        System.out.println("************************");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
        System.out.println(a5.toString());
        System.out.println("************************");
        System.out.println("");

        Zoo z = new Zoo("Zoo");
        z.add(a1);
        z.add(a2);
        z.add(a3);
        z.add(a4);
        z.add(a5);

        System.out.println("Opgave 8:");
        System.out.println("************************");
        System.out.println("No. of animals in zoo: " + z.animals());
        System.out.println("************************");
        System.out.println("");
        System.out.println("");

        System.out.println("Opgave 9:");
        System.out.println("************************"); 
        System.out.println("Største dyrepopulation:");
        System.out.println(z.largestPopulation());
        System.out.println("************************");
        System.out.println("");
        System.out.println("");

        System.out.println("Opgave 10:");
        System.out.println("************************"); 
        z.printZoo();
        System.out.println("************************"); 
    }
}
