package dk.yousee.hwlog.contexts

import dk.yousee.hwlog.model.{Location, Hardware}
import dk.yousee.hwlog.roles.{Receiver, Carrier, Sender, Warehouse}

/**
 * Created by IntelliJ IDEA.
 * User: m14758
 * Date: May 15, 2010
 * Time: 9:47:25 AM
 * To change this template use File | Settings | File Templates.
 */

class WarehouseToSalesagent(serialnumber: String , salesagentCode: String) {
  val hardware = new Hardware(serialnumber, new Warehouse())
  val warehouse = new Location(salesagentCode) with Sender
  val carrier = new Carrier() with Receiver
  def send {
    println("Handing over hw: " + hardware.serialnumber + " to the carrier")
    warehouse.send(hardware)
    carrier.reveive(hardware)
    

  }
}