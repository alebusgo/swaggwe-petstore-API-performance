package features.user.loginUser

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class LoginUserSimulation extends Simulation{
  val loginUser = scenario("loginTheUser").exec(karateFeature("classpath:features/user/loginUser/loginUser.feature"))

  setUp(
    loginUser.inject(rampUsers(10) during(5 seconds))
  )

}
