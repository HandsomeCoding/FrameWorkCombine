package com.example.frameworkstudy.common.cache;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPoolConfig;

@Component
@ConfigurationProperties(prefix = "redis")
public class PoolConfig extends JedisPoolConfig {
      private int maxIdle;
      private int maxTotal;
      private int minIdle;
      private boolean testWhileIdle;
      private Integer port;
      private String host;
      private String auth;
      private Integer connectTimeout;

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    @Override
    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    @Override
    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    @Override
    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public int getMaxIdle() {
        return maxIdle;
    }


    @Override
    public int getMaxTotal() {
        return maxTotal;
    }



    @Override
    public int getMinIdle() {
        return minIdle;
    }


    @Override
    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
