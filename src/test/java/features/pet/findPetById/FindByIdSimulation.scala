package features.pet.findPetById

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class FindByIdSimulation extends Simulation{
  val findById = scenario("findPetById").exec(karateFeature("classpath:features/pet/findPetById/findPetById.feature"))

  setUp(
    findById.inject(rampUsers(10) during(5 seconds))
  )

}
