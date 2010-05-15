package dk.yousee.hwlog.roles

import dk.yousee.hwlog.model.{Location, Hardware}

/**
 * Created by IntelliJ IDEA.
 * User: m14758
 * Date: May 15, 2010
 * Time: 9:21:09 AM
 * To change this template use File | Settings | File Templates.
 */

trait Sender {  self: Location =>

  def send(hardware: Hardware) {
    println(this.loc + "sending hardware: " + hardware.serialnumber)
  }
}