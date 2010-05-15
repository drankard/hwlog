package dk.yousee.hwlog.context

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import dk.yousee.hwlog.contexts.{CarrierToSalesagent, WarehouseToCarrier}

/**
 * Created by IntelliJ IDEA.
 * User: m14758
 * Date: May 15, 2010
 * Time: 9:54:13 AM
 * To change this template use File | Settings | File Templates.
 */

class TestWarehouseToSalesagent extends FlatSpec with ShouldMatchers {

  val serialnumber = "ABC-123"
  val salesagentCode = "T3456"


  "Warehouse" should "handover hardware to the carrier" in {
    val  uc = new WarehouseToCarrier(serialnumber)
    uc.handOver 
  }


  "Salesagent" should "receive hardware from carrier" in {
       val uc = new CarrierToSalesagent(serialnumber, salesagentCode)
       uc.handOver
  }
}