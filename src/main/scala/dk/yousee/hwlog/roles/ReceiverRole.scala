package dk.yousee.hwlog.roles

import dk.yousee.hwlog.model.{Location, Hardware}

/**
 * Created by IntelliJ IDEA.
 * User: m14758
 * Date: May 15, 2010
 * Time: 9:21:20 AM
 * To change this template use File | Settings | File Templates.
 */

trait ReceiverRole { self: Location =>
  def reveive(hardware: Hardware) {
    println(this.loc + " reeived the hardware with serial: " + hardware.serialnumber)    
  }
}