package com.mattwittmann.quotes

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import spray.json.DefaultJsonProtocol._

object WebMain {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("WebMain")
    implicit val materializer = ActorMaterializer()
    implicit val executionContext = system.dispatcher
    implicit val quoteFormat = jsonFormat2(Quote)
    val service = new QuoteService

    val route = path("quotes") {
      get {
        complete(service.retrieveQuotes())
      }
    }

    Http().bindAndHandle(route, "0.0.0.0", 8080)
  }
}
