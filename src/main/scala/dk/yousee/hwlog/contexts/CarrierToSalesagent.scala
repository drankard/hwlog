package dk.yousee.hwlog.contexts

import dk.yousee.hwlog.model.Hardware
import dk.yousee.hwlog.roles.{DeliverRole, ReceiverRole, Carrier, Salesagent}

/**
 * Created by IntelliJ IDEA.
 * User: m14758
 * Date: May 15, 2010
 * Time: 1:45:48 PM
 * To change this template use File | Settings | File Templates.
 */

class CarrierToSalesagent(serialnumber: String, salesagentCode : String) {
  val carrier = new Carrier with DeliverRole
  val salesagent = new Salesagent(salesagentCode) with ReceiverRole
  val hardware = new Hardware(serialnumber, carrier)


  def handOver {
    carrier.handOver(hardware)
    salesagent.reveive(hardware)
    println(carrier.loc + " has now handed over hardware: "+ hardware.serialnumber + " to salesagent: " + salesagent.loc)
  }
}