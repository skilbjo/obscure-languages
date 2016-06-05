# obscure-languages

## Languages

### LISP (high level, functional programming)
- [x] [Clojure](http://clojure.org/)
- [x] [Haskell](https://www.haskell.org/)
- [ ] [Scheme](http://www.schemers.org/)

### Generic functional
- [x] [Erlang](https://www.erlang.org/)
- [ ] [Scala](http://www.scala-lang.org/)

### Mid/Low level
- [ ] [Go](https://golang.org/)
- [ ] [OCaml](https://ocaml.org/)

## Usage

### Clojure
Install: `brew install leiningen`
Compile: `lein uberjar; java -cp hello-1.0.0.jar hello.clj` # <= ??
Run: `lein run -m hello.clj` # <= ??
REPL: `lein repl`

### Haskell
Install: `brew install ghc cabal-install; cabal update ; cabal install ghc-mod`
Compile: `ghc hello.hs -o hello`
Run: `runhaskell hello.hs || ./hello`
REPL: `ghci`

### Scheme
Install: `brew install mit-scheme`
Compile: `null`
Run: `scheme <hello.scm`
REPL: `scheme`

### Erlang
Install: `brew install erlang`
Compile: `erlc hello.erl`
Run: `erl -noshell -s hello start -s init stop`
REPL: `erl`

### Scala
Install: `brew install scala`
Compile: `scalac helloApp.scala`
Run: `scala hello.scala || ./hello`
REPL: `scala`

### Go
Install: `brew install `
Compile: 
Run: 
REPL: 

### OCaml
Install: `brew install `
Compile: 
Run: 
REPL: 
