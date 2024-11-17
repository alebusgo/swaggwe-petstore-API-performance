package features.pet.findPetsByStatus;

import com.intuit.karate.junit5.Karate;

class FindPetsByStatusUsersRunner {
    
    @Karate.Test
    Karate testFindPestByStatus() {
        return Karate.run("findPestByStatus").relativeTo(getClass());
    }    

}
