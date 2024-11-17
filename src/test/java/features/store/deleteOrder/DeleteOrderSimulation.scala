package features.store.deleteOrder

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class DeleteOrderSimulation extends Simulation{
  val deleteOrder = scenario("deleteOrderById").exec(karateFeature("classpath:features/store/deleteOrder/deleteOrderById.feature"))

  setUp(
    deleteOrder.inject(rampUsers(10) during(5 seconds))
  )

}
