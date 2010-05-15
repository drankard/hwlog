package dk.yousee.hwlog.context

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import dk.yousee.hwlog.contexts.WarehouseToSalesagent

/**
 * Created by IntelliJ IDEA.
 * User: m14758
 * Date: May 15, 2010
 * Time: 9:54:13 AM
 * To change this template use File | Settings | File Templates.
 */

class TestWarehouseToSalesagent extends FlatSpec with ShouldMatchers {

  "WarehouseToSalesagent" should "send handover hardware to the carrier" in {
    val  uc = new WarehouseToSalesagent("ABC-123", "T5555")
    uc.send
  }
}