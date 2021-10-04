import java.util.Random;

public class Animal extends Kingdom implements Movement{
    private int feet;
    private String name;
    private String type;

    public Animal(int feet, String name, String type) {
        this.feet = feet;
        this.name = name;
        this.type = type;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "feet=" + feet +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move() {
        Random r = new Random();
        int randomNumber = r.nextInt(6);

       switch(randomNumber){
           case 1:
               System.out.println("Octopus move...");
               break;
           case 2:
               System.out.println("Mate");
               break;
           case 3:
               System.out.println("Pig move...");
               break;
           case 4:
               System.out.println("Salmon move...");
               break;
           case 5:
               System.out.println("Fish move.....");
               break;
           case 6:
               System.out.println("Gorilla move....");
               break;

           default:
               System.out.println("not working..");
       }
    }
}
