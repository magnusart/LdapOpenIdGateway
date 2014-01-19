package org.forgerock.opendj.ldap.responses

import org.forgerock.opendj.ldap._
import org.forgerock.opendj.ldap.responses._
import org.forgerock.opendj.ldap.controls._
import scala.collection.JavaConversions._

object Search {
  val rootDN = new SearchResultEntryImpl( new TreeMapEntry( DN.rootDN ) )
}