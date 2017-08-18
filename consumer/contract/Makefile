all: build test

build:
	docker build -q -t contracts .

test:
	# *docker.for.mac.localhost* is a special Mac-only DNS entry, that resolves to the internal IP used by the host
	docker run -e "url=http://docker.for.mac.localhost:8080" contracts
