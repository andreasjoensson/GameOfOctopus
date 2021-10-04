import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {
       // GameOfOctopus game = new GameOfOctopus();
        //game.start();

        //ZOO
        Zoo zoo = new Zoo();
        Octopus otto = new Octopus(0,"Leonardo", "Fish",8);
        otto.move();
        zoo.addAnimalToZoo(otto);
        for(Animal dyr:zoo.getZooArr()){
            System.out.println(dyr);
        }

        //NAME A THREAD
        GameOfOctopus nameThread = new GameOfOctopus();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name for the new thread");
        nameThread.setName(sc.nextLine());
        System.out.println("Nu hedder den her tread det du har kaldt den: "+ nameThread.getName());

        //KILL ANIMAL
        zoo.KillAnimal("Leonardo");
    }
}
