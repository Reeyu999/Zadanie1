package zoo;
import animal.Animal;

import java.util.ArrayList;

public class ShowEachAnimalTwiceZoo extends Zoo {
    @Override
    public void showAnimals(ArrayList animals) {
        for ( Object n : animals){
            if (n instanceof Animal){
                ((Animal) n).makeNoise();
                ((Animal) n).makeNoise();
            }

        }
    }
}
