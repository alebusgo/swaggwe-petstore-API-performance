package features.pet.addNewPet;

import com.intuit.karate.junit5.Karate;

public class AddNewPetToTheStoreRunner {
    @Karate.Test
    Karate testAddNewPet(){
        return Karate.run("addNewPetToTheStore").relativeTo(getClass());
    }
}
