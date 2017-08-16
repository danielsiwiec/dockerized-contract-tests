import test from 'ava'
import request from 'request-promise-native'

test('bar', async t => {
	const incremented = request.post(process.env.url, {
      body: { number: 2 },
      json: true
    })

	t.is(await incremented, 3);
});
