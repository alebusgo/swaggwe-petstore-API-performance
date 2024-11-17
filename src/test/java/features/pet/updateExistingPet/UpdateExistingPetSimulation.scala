package features.pet.updateExistingPet

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class UpdateExistingPetSimulation extends Simulation{
  val updatePet = scenario("updateExistingPet").exec(karateFeature("classpath:features/pet/updateExistingPet/updateAnExistingPet.feature"))

  setUp(
    updatePet.inject(rampUsers(10) during(5 seconds))
  )

}
