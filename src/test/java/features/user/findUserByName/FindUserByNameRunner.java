package features.user.findUserByName;

import com.intuit.karate.junit5.Karate;

public class FindUserByNameRunner {
    @Karate.Test
    Karate testFindUserByName(){
        return Karate.run("findUserByNameWalkthrough").relativeTo(getClass());
    }
}
