package features.store.placeOrder

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class PlaceOrderSimulation extends Simulation{
  val placeOrder = scenario("placeAnOrder").exec(karateFeature("classpath:features/store/placeOrder/placeOrderFoAPet.feature"))

  setUp(
    placeOrder.inject(rampUsers(500) during(10
      seconds))
  )

}
