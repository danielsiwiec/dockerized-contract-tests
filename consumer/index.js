const request = require('request-promise-native')

request.post('http://localhost:8080', {
    body: { number: process.argv[2] },
    json: true
  })
  .then(console.log)
