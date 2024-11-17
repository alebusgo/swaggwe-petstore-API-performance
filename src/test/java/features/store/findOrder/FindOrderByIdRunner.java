package features.store.findOrder;

import com.intuit.karate.junit5.Karate;

public class FindOrderByIdRunner {
    @Karate.Test
    Karate testFindOrderById(){
        return Karate.run("findOrderByIdWalkthrough").relativeTo(getClass());
    }
}
