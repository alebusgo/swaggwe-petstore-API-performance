package features.store.placeOrder;

import com.intuit.karate.junit5.Karate;

public class PlaceOrderFoAPetRunner {
    @Karate.Test
    Karate testAddNewPet(){
        return Karate.run("placeOrderFoAPetWalkthrough").relativeTo(getClass());
    }
}
