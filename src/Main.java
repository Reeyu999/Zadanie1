import animal.*;
import zoo.ShowEachAnimalTwiceZoo;
import zoo.ShowEachBirdTwiceZoo;
import zoo.ShowOnlyBirdsZoo;
import zoo.Zoo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> list = new ArrayList<Animal>();

        list.add(new Eagle());
        list.add(new Pigeon());
        list.add(new Cat());
        list.add(new Dog());

        ShowOnlyBirdsZoo showBirds = new ShowOnlyBirdsZoo();
        ShowEachAnimalTwiceZoo showEachAnimalTwicee = new ShowEachAnimalTwiceZoo();
        ShowEachBirdTwiceZoo showEachBirdTwice = new ShowEachBirdTwiceZoo();

        showBirds.showAnimals(list);
        showEachAnimalTwicee.showAnimals(list);



    }
}
