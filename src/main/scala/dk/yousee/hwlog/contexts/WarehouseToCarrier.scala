package dk.yousee.hwlog.contexts

import dk.yousee.hwlog.model.{Location, Hardware}
import dk.yousee.hwlog.roles._

/**
 * Created by IntelliJ IDEA.
 * User: m14758
 * Date: May 15, 2010
 * Time: 9:47:25 AM
 * To change this template use File | Settings | File Templates.
 */

class WarehouseToCarrier(serialnumber: String) {
  val warehouse = new Warehouse with DeliverRole
  val hardware = new Hardware(serialnumber, warehouse)

  val carrier = new Carrier() with ReceiverRole


  def handOver {
    warehouse.handOver(hardware)
    carrier.reveive(hardware)
    println("Hardware: " + hardware.serialnumber + " is now handed over from " + warehouse.loc + " to " + carrier.loc)

  }
}