package features.store.inventory

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

class RetursInventorySimulation extends Simulation{
  val returnsInventory = scenario("returnsPetInventory").exec(karateFeature("classpath:features/store/inventory/returnsPetInventoryByStatus.feature"))

  setUp(
    returnsInventory.inject(rampUsers(10) during(5 seconds))
  )

}
