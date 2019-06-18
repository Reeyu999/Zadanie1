package zoo;
import animal.Bird;



import java.util.ArrayList;

public class ShowOnlyBirdsZoo extends Zoo{
    @Override
    public void showAnimals(ArrayList animal) {
        for (Object n : animal){
            if (n instanceof Bird){
                ((Bird) n).makeNoise();
            }
        }


    }
}
