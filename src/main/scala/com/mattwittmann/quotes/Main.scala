package com.mattwittmann.quotes

object Main extends App {
  val service = new QuoteService

  def quoteToString(quote: Quote) = s""""${quote.quote}"\n\t—${quote.attribution}"""

  service.retrieveQuotes map quoteToString foreach println
}
