package com.mattwittmann.quotes

case class Quote(val quote: String, val attribution: String)

class QuoteService {
  val numberOfQuotesToReturn = 5
  val quotes = List(Quote("Hello, world!", "Anonymous"),
                    Quote("There are only two hard things in computer science: cache invalidation and naming things.",
                          "Phil Karlton"),
                    Quote("Innovation distinguishes between a leader and a follower.", "Steve Jobs"),
                    Quote("640 kb ought to be enough for anybody.", "Bill Gates"),
                    Quote("To thine own self be true.", "William Shakespeare"),
                    Quote("If you're walking down the right path and you're willing to keep walking, eventually you'll make progress.",
                          "Barack Obama"),
                    Quote("I'm the decider, and I decide what is best.", "George W. Bush"))

  def retrieveQuotes(): Seq[Quote] = quotes.take(numberOfQuotesToReturn)
}
