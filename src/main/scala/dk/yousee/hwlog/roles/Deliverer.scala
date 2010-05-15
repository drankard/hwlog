package dk.yousee.hwlog.roles

import dk.yousee.hwlog.model.{Hardware, Location}

/**
 * Created by IntelliJ IDEA.
 * User: m14758
 * Date: May 15, 2010
 * Time: 9:21:37 AM
 * To change this template use File | Settings | File Templates.
 */

trait Deliverer {  self: Location =>

  def handOver(hardware : Hardware) {
      println(this.loc + " handed over hardware: " + hardware.serialnumber)
  }

}