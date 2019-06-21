package zoo;
import animal.Bird;
import java.util.ArrayList;

public class ShowEachBirdTwiceZoo extends Zoo {
    @Override
    public void showAnimals(ArrayList animals) {
        for ( Object n : animals){
            if (((Bird) n).canFly ){
                ((Bird) n).makeNoise();
                ((Bird) n).makeNoise();
            }
        }


    }


}
