package dk.yousee.hwlog.roles

import dk.yousee.hwlog.model.{Location, Hardware}

/**
 * Created by IntelliJ IDEA.
 * User: m14758
 * Date: May 15, 2010
 * Time: 9:27:55 AM
 * To change this template use File | Settings | File Templates.
 */

class Warehouse extends Location  {
  def this() = {
    this("DISTRIBU")
  }

}