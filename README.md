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
Compile: `ghc hello.hs -o hello && ./hello`
Run: `runhaskell hello.hs`
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
[help](https://bcomposes.wordpress.com/2011/10/25/first-steps-in-scala-for-beginning-programmers-part-10/)
Install: `brew install scala`
Compile: `scalac helloApp.scala && ./hello`
Run: `scala hello.scala`
REPL: `scala`

### Go
Install: `brew install go hg bzr; export GOPATH=$(pwd)/'5.\ go/'`
Compile: `go build hello.go && ./hello`
Run: `go run hello.go`
REPL: `null || go get -u github.com/motemen/gore ; gore`

### OCaml
Install: `brew install opam`
Compile: `ocamlc -o hello hello.ml && ./hello`
Run: `ocaml hello.ml`
REPL: `ocaml`

### Lua
Install: `brew install `
Compile: `null`
Run: `lua hello.lua`
REPL: `lua`
