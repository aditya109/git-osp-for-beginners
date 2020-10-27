// Here is where the Zoo Owner Lives

import java.util.Scanner;

public class ZooKeeper {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Zoo myZoo = new Zoo();
        System.out.println("====Welcome to the Aditya Zoo===");
        try {

            do {
                // choose the operation you need to be
                System.out.println("**** ***** Zoo management system ***** ****");
                System.out.println("**** 1, Add Animals *****");
                System.out.println("**** 2, View Animals *****");
                System.out.println("**** 3, Feed Animal *****");
                System.out.println("**** 4, exit the system *****");
                System.out.println("**** Please select the operation you need to do: *****");
                int sel = in.nextInt();
                switch (sel) {

                    case 1:
                        System.out.println("Please enter animal name");
                        String name = in.next();
                        System.out.println("Please enter animal age");
                        String age = in.next();
                        System.out.println("Please enter animal gender");
                        String gender = in.next();
                        System.out.println("Please enter animal species");
                        String species = in.next();
                        System.out.println("Please enter animal most liked food");
                        String food = in.next();
                        Animal animal = new Animal(name, age, gender, species, food);
                        myZoo.addAnimal(animal);
                        break;

                    case 2:
                        myZoo.viewAnimals();
                        break;
                    // 3 Modify
                    case 3:
                        System.out.println("Please enter animal name you want to feed");
                        String animalFeed = in.next();
                        myZoo.feedAnimal(animalFeed);
                        break;

                    case 4:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Sorry.. Unexpected Error Happens. Please try again!");
        }


    }
}
