package com.ninedemons.osgi.jedis.simple;

import com.ninedemons.osgi.jedis.JedisPoolSource;
import redis.clients.jedis.JedisPool;

/**
 * Created by Jon Barber
 */
public class SimpleJedisPoolSource implements JedisPoolSource {

    protected JedisPool jedisPool;

    public SimpleJedisPoolSource(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    @Override
    public JedisPool getPool() {
        return jedisPool;
    }
}
