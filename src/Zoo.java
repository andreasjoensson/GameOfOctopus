import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Zoo{
    ArrayList <Animal> zooArr = new ArrayList<>();
    List<Animal> toRemove = new ArrayList<>();


    public void addAnimalToZoo(Animal animal){
        zooArr.add(animal);
    }

    public ArrayList<Animal> getZooArr() {
        return zooArr;
    }

    public void KillAnimal(String animal){
        for(Animal ani : zooArr){
            if(ani.getName().equals(animal)){
                toRemove.add(ani);
                System.out.println(ani.getName() + " Has been killed.");
            }
        }
        zooArr.removeAll(toRemove);
        System.out.println(zooArr);
    }
}
