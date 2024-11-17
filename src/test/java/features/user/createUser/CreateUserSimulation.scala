package features.user.createUser

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class CreateUserSimulation extends Simulation{
  val createUser = scenario("createNewUser").exec(karateFeature("classpath:features/user/createUser/createUser.feature"))

  setUp(
    createUser.inject(rampUsers(10) during(5 seconds))
  )

}
