package dk.yousee.hwlog.roles

import dk.yousee.hwlog.model.Hardware

/**
 * Created by IntelliJ IDEA.
 * User: m14758
 * Date: May 15, 2010
 * Time: 9:21:09 AM
 * To change this template use File | Settings | File Templates.
 */

trait Sender {

  def send(hardware: Hardware) {
    println("Sending hardware: " + hardware.serialnumber)
  }
}