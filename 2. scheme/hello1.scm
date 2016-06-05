(define hello-world
	(lambda ()
		(begin
			(write 'hello-world)
			(newline)
			(hello-world))))
