package com.example.frameworkstudy.common.cache;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;

import javax.annotation.PostConstruct;

@Component
@Scope("singleton")
public class CachePool {
    @Autowired
    private PoolConfig poolConfig;



    private JedisPool pool;
    @PostConstruct
    private void createPool (){
        Logger logger = LoggerFactory.getLogger(CachePool.class);
        logger.info(poolConfig+"sssssssssssssssssssssssssssssssssssssssssssss");
        pool = new JedisPool(poolConfig,poolConfig.getHost(),poolConfig.getPort(),poolConfig.getConnectTimeout(),poolConfig.getAuth());
    }

    public JedisPool getPool() {
        return pool;
    }
//private JedisCluster pool;
//    @PostConstruct
//    private void createPool () {
//        Set<HostAndPort> shards = new HashSet<>();
//        String clusterStr = poolConfig.getHost();
//        if (StringUtils.isEmpty(clusterStr)) {//分拆节点前判断是否为空
//            throw new NullPointerException("没有配置redis.host参数,多个host:port请以英文逗号相隔");
//        }
//        String [] nodes = clusterStr.split(",");
//        for (int i = 0; i < nodes.length; i++) {
//            if (nodes.length==0 || nodes[i].indexOf(":")==-1) {
//                throw new ServiceException("redis节点格式为host:port");
//            }
//            String [] node = nodes[i].split(":");//分拆每个节点
//            shards.add(new HostAndPort(node[0],Integer.valueOf(node[1])));
//        }
//        pool = new JedisCluster(shards);
//    }

//    public JedisCluster getPool() {
//        return pool;
//    }
}
