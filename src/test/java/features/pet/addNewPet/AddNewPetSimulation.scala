package features.pet.addNewPet

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class AddNewPetSimulation extends Simulation{
  val addNewPet = scenario("addNewPetToTheStore").exec(karateFeature("classpath:features/pet/addNewPet/addNewPetToTheStore.feature"))

  setUp(
    addNewPet.inject(rampUsers(10) during(10 seconds))
  )

}
