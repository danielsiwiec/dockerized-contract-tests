import test from 'ava'
import request from 'request-promise-native'

test('bar', async t => {
	const incremented = request.post('http://localhost:8080', {
      body: { number: 2 },
      json: true
    })

	t.is(await incremented, 3);
});
