package com.kl.enjoy.theadutils;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

public class TheadUtils {
    static ThreadPoolTaskExecutor executor;
    static {
        //初始化线程池
        executor=new ThreadPoolTaskExecutor();
        //核心线程数
        executor.setCorePoolSize(100);
        //最大线程数
        executor.setMaxPoolSize(20);
        //线程队列
        executor.setQueueCapacity(100);
        //线程存活时间
        executor.setKeepAliveSeconds(30000);
        // rejection-policy：当pool已经达到max size的时候，如何处理新任务
        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy());
        //执行初始化
        executor.initialize();
    }
}
