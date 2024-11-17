package features.pet.updateExistingPet;

import com.intuit.karate.junit5.Karate;

public class UpdateAnExistingPetRunner {
    @Karate.Test
    Karate testAddNewPet(){
        return Karate.run("updateAnExistingPet").relativeTo(getClass());
    }
}
