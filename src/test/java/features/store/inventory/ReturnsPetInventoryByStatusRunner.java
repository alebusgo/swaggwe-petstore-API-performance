package features.store.inventory;

import com.intuit.karate.junit5.Karate;

public class ReturnsPetInventoryByStatusRunner {

    @Karate.Test
    Karate testInventory(){
        return Karate.run("returnsPetInventoryByStatusWalkthrough").relativeTo(getClass());
    }

}
