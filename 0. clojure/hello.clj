(ns hello.clj)
(defn hello [name]
	(println (format 'Hello, %s' name)))

(defn -main[] (hello 'world!'))

