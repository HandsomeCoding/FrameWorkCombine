package com.example.frameworkstudy.common.session;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPoolConfig;

@Component
@ConfigurationProperties(prefix = "session")
public class SessionConfig extends JedisPoolConfig {
      private int timeOut;

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }
}
