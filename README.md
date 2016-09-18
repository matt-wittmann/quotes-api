Quotes API
==========

Purpose
-------

I want to play around with [Akka HTTP](http://doc.akka.io/docs/akka/2.4/scala/http/index.html).
This RESTful API will then be used with a simple front-end Web application to try out
[Elm](http://elm-lang.org/).

Resources
---------

### Quotes

The user can get a list of awesome quotes, five at a time:

#### Request

    GET /quotes HTTP/1.1
    Accept: application/json

#### Response

    200 OK
    Content-Type: application/json; charset=UTF-8
    
    [
        {
            "quote": "Hello, world!",
            "attribution": "Anonymous"
        },
        {
            "quote": "Hello, world!",
            "attribution": "Anonymous"
        },
        {
            "quote": "Hello, world!",
            "attribution": "Anonymous"
        },
        {
            "quote": "Hello, world!",
            "attribution": "Anonymous"
        },
        {
            "quote": "Hello, world!",
            "attribution": "Anonymous"
        },
    ]
