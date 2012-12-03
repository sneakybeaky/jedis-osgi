package com.ninedemons.osgi.jedis;

import redis.clients.jedis.JedisPool;

/**
 * Created by Jon Barber
 */
public interface JedisPoolSource {

    public JedisPool getPool();

}
