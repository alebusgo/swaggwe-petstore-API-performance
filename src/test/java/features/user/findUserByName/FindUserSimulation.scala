package features.user.findUserByName

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class FindUserSimulation extends Simulation{
  val findUser = scenario("findUserByName").exec(karateFeature("classpath:features/user/findUserByName/findUserByName.feature"))

  setUp(
    findUser.inject(rampUsers(10) during(5 seconds))
  )

}
