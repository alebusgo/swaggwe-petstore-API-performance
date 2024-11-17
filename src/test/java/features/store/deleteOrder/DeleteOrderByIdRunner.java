package features.store.deleteOrder;

import com.intuit.karate.junit5.Karate;

public class DeleteOrderByIdRunner {
    @Karate.Test
    Karate testFindOrderById(){
        return Karate.run("deleteOrderByIdWalkthrough").relativeTo(getClass());
    }
}
