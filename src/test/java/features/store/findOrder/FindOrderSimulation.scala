package features.store.findOrder

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class FindOrderSimulation extends Simulation{
  val findOrder = scenario("findOrderById").exec(karateFeature("classpath:features/store/findOrder/findOrderById.feature"))

  setUp(
    findOrder.inject(rampUsers(10) during(5 seconds))
  )

}
