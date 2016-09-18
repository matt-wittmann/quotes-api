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

Running
-------

1. Build the Docker image using [sbt](http://www.scala-sbt.org/) with the Native Packager
   plugin. This requires [Docker](https://www.docker.com/) to be installed on the
   build machine: `sbt clean docker:publishLocal`
2. Run a Docker container from the image:
   `docker run -it -p 8080:8080 --name quotes-api quotes-api:0.0.1-SNAPSHOT`
3. Test it: `curl -i http://localhost:8080/quotes`
