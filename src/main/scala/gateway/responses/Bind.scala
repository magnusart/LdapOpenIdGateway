package org.forgerock.opendj.ldap.responses

import org.forgerock.opendj.ldap._
import org.forgerock.opendj.ldap.responses._
import org.forgerock.opendj.ldap.controls._
import scala.collection.JavaConversions._

object Bind {
  val success: BindResult = new BindResultImpl( ResultCode.SUCCESS )

  // def addControl( control: Control ): BindResult = ???
  // def addReferralURI( uri: String ): BindResult = ???
  // def getCause(): Throwable = ???
  // def getControl[C <: Control]( decoder: ControlDecoder[C], options: DecodeOptions ): C = ???
  // def getControls(): java.util.List[Control] = ???
  // def getDiagnosticMessage(): String = ???
  // def getMatchedDN(): String = ???
  // def getReferralURIs(): java.util.List[String] = ???
  // def getResultCode(): ResultCode = ???
  // def getServerSASLCredentials(): ByteString = ???
  // def isReferral(): Boolean = ???
  // def isSASLBindInProgress(): Boolean = ???
  // def isSuccess(): Boolean = ???
  // def setCause( cause: Throwable ): BindResult = ???
  // def setDiagnosticMessage( message: String ): BindResult = ???
  // def setMatchedDN( dn: String ): BindResult = ???
  // def setResultCode( resultCode: ResultCode ): BindResult = ResultCode.SUCCESS
  // def setServerSASLCredentials( credentials: ByteString ): BindResult = ???
  // def containsControl( oid: String ): Boolean = ???
}