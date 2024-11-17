package features.pet.findPetById;

import com.intuit.karate.junit5.Karate;

public class FindPetByIdRunner {
    @Karate.Test
    Karate testFindPetById(){
        return Karate.run("findPetById").relativeTo(getClass());
    }
}
