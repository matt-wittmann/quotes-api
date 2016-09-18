package com.mattwittmann.quotes

import org.scalatest.WordSpec

class QuoteServiceSpec extends WordSpec {
  val service: QuoteService = new QuoteService

  "QuoteServiceSpec" when {
    "retrieveQuotes" should {
      "return five quotes" in {
        assert(5 === service.retrieveQuotes().length)
      }
    }
  }
}
