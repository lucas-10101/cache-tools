package lucas10101.services;

import java.io.Serializable;
import java.util.Map;

import lucas10101.contracts.CacheService;
import redis.clients.jedis.JedisPool;

public class RedisCacheService implements CacheService {

    private static JedisPool pool;

    private static final partitioningKey = "";

    public RedisCacheService() throws Exception {
        if (pool == null || pool.isClosed()) {
            Map<String, String> settings = ApplicationPropertiesReader.get("redis");
            pool = new JedisPool(settings.get("server"), Integer.parseInt(settings.get("port")));
        }
    }

    @Override
    public <T extends Serializable> T put(Object key, T data) {
        RedisCacheService.pool.addObject();

        // TODO
    }

    @Override
    public <T extends Serializable> T get(Object key) {
        // TOOD
    }

}
