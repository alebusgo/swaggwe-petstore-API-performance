package features.user.createUser;

import com.intuit.karate.junit5.Karate;

public class createUserRunner {
    @Karate.Test
    Karate testAddNewPet(){
        return Karate.run("createUserWalkthrough").relativeTo(getClass());
    }
}
