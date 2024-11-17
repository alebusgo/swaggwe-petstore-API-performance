package features.pet.findPetsByStatus

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class FindPetsByStatusSimulation extends Simulation{
  val getPetsByStatus = scenario("getPetsByStatusCall").exec(karateFeature("classpath:features/pet/findPetsByStatus/findPestByStatus.feature"))

  setUp(
    getPetsByStatus.inject(rampUsers(10) during(5 seconds))
  )

}
