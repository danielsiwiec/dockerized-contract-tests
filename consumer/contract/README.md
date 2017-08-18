Publishing the contract image
----------

`docker build .`

Running the image
---------

`docker run -e "url=http://docker.for.mac.localhost:8080" <IMAGE_ID>`


*docker.for.mac.localhost* is a special Mac-only DNS entry, that resolves to the internal IP used by the host


Build and run
--------

make test
