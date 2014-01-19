package com.magnusart
package gateway

import org.forgerock.opendj.ldap._
import org.forgerock.opendj.ldap.requests._
import org.forgerock.opendj.ldap.responses._

object GatewayApp extends App {
  val port = 1389
  val address = "192.168.1.103"

  val connectionHandler: ServerConnectionFactory[LDAPClientContext, Integer] =
    Connections.newServerConnectionFactory( Ldap.requestHandler );

  val options = new LDAPListenerOptions().setBacklog( 4096 )

  // Create the LDAP server listening on port 1389.
  val listener = new LDAPListener( address, port, connectionHandler, options )

  println( s"Started server with $listener" )

  println( "Press enter to stop server" )
  Console.readLine

  listener.close()

}