# static-web-server

This is a simple static web server which serves files within the
"resources/public" folder as static resources.

## Running

Place your web content into the "resources/public" directory.

To start a web server for the application, either run:

    $ lein ring <port-number>

... or compile uberjar and run the web server from standalone jar file:

    $ lein uberjar
    # make sure that 'resources' directory is in your current working directory
    $ java -jar target/static-web-server-0.1.0-SNAPSHOT-standalone.jar <port>


Open your browser on address http://localhost:port and enjoy your website.
