package com.magnusart
package gateway

import org.forgerock.opendj.ldap._
import org.forgerock.opendj.ldap.requests._
import org.forgerock.opendj.ldap.responses._

object Ldap {
  val requestHandler = new RequestHandler[RequestContext]() {
    def handleAdd(
      requestContext: RequestContext,
      addRequest: AddRequest,
      intermediateResponseHandler: IntermediateResponseHandler,
      resultHandler: ResultHandler[Result] ): Unit =
      {
        throw new RuntimeException( "Not implemented" )
      }

    def handleBind(
      requestContext: RequestContext,
      version: Int,
      bindRequest: BindRequest,
      intermediateResponseHandler: IntermediateResponseHandler,
      resultHandler: ResultHandler[BindResult] ): Unit =
      {
        println( s"Context: $requestContext" )
        println( s"Version: $version" )
        println( s"Bind: $bindRequest" )
        println( s"Intermediate Response Handler: $intermediateResponseHandler" )
        println( s"Result Handler: $resultHandler" )

        resultHandler.handleResult( Bind.success )
      }

    def handleCompare(
      requestContext: RequestContext,
      compareRequest: CompareRequest,
      intermediateResponseHandler: IntermediateResponseHandler,
      resultHandler: ResultHandler[CompareResult] ): Unit =
      {
        throw new RuntimeException( "Not implemented" )
      }

    def handleDelete(
      requestContext: RequestContext,
      deleteRequest: DeleteRequest,
      intermediateResponseHandler: IntermediateResponseHandler,
      resultHandler: ResultHandler[Result] ): Unit =
      {
        throw new RuntimeException( "Not implemented" )
      }

    def handleExtendedRequest[R <: responses.ExtendedResult](
      requestContext: RequestContext,
      extendedRequest: ExtendedRequest[R],
      intermediateResponseHandler: IntermediateResponseHandler,
      resultHandler: ResultHandler[R] ): Unit =
      {
        throw new RuntimeException( "Not implemented" )
      }

    def handleModify(
      requestContext: RequestContext,
      modifyRequest: ModifyRequest,
      intermediateResponseHandler: IntermediateResponseHandler,
      resultHandler: ResultHandler[Result] ): Unit =
      {
        throw new RuntimeException( "Not implemented" )
      }

    def handleModifyDN(
      requestContext: RequestContext,
      modifyDNRequest: ModifyDNRequest,
      intermediateResponseHandler: IntermediateResponseHandler,
      resultHandler: ResultHandler[Result] ): Unit =
      {
        throw new RuntimeException( "Not implemented" )
      }

    def handleSearch(
      requestContext: RequestContext,
      searchRequest: SearchRequest,
      intermediateResponseHandler: IntermediateResponseHandler,
      searchResultHandler: SearchResultHandler ): Unit =
      {
        println( s"RequestContext: $requestContext" )
        println( s"SearchRequest: $searchRequest" )
        println( s"IntermediateResponseHandler: $intermediateResponseHandler" )
        println( s"SearchResultHandle: $searchResultHandler" )

        val b = searchResultHandler.handleEntry( Search.rootDN )
        println( s"Boolean? $b" )
      }
  }
}