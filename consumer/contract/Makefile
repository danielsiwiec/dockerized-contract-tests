test:
	ID=$$(docker build . -q) && docker run -e "url=http://docker.for.mac.localhost:8080" $$ID
