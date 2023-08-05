# embed-arcadedb-clojure

This is a very minimalistic demonstration of embedding ArcadeDB in JVM with Clojure

## notes

It's basically a must to include password to your database using environment variables or Java properties
because in Calva REPL, you may not be able to `input` password from the keyboard.

What worked for me the best is to set JAVA_OPTS like this:

```sh
JAVA_OPTS=-Darcadedb.server.rootPassword=playwithdata
```

By using environment variable you don't need to submit your password with your source code.
It also works multiplatform, including Windows.

Hope it helps someone!
