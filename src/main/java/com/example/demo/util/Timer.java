package com.example.demo.util;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class Timer {
  Logger logger = LoggerFactory.getLogger(this.getClass());
  private AtomicInteger loopCounter = new AtomicInteger();
   
  @Autowired
  private StopWatch watch;
   
  @Value("${spring.task.name}")
  private String taskNamePrefix;
  
  @Value("${spring.task.fixedDelay1}")
  private String fixedDelay1;
  
  @Value("${spring.task.fixedDelay2}")
  private String fixedDelay2;
  
  @Value("${spring.task.fixedDelay3}")
  private String fixedDelay3;
  
  @Value("${spring.task.fixedDelay4}")
  private String fixedDelay4;
  
  @Value("${spring.task.fixedDelay5}")
  private String fixedDelay5;
  
  @PostConstruct
  public void init() {
    watch.start();
  }
 
  @Scheduled(fixedDelayString = "${spring.task.fixedDelay1}")
  public void tick1() throws InterruptedException{
    watch.stop();
    logger.info(watch.prettyPrint());
    String taskName = taskNamePrefix + " "+ fixedDelay1 + "-" + String.valueOf(loopCounter.getAndIncrement());
    watch.start(taskName);
  }
  
  @Scheduled(fixedDelayString = "${spring.task.fixedDelay2}")
  public void tick2() throws InterruptedException{
    watch.stop();
    logger.info(watch.prettyPrint());
    String taskName =  taskNamePrefix + " "+ fixedDelay2 + "-" + String.valueOf(loopCounter.getAndIncrement());
    watch.start(taskName);
  }
  
  @Scheduled(fixedDelayString = "${spring.task.fixedDelay3}")
  public void tick3() throws InterruptedException{
    watch.stop();
    logger.info(watch.prettyPrint());
    String taskName =  taskNamePrefix + " "+ fixedDelay3 + "-" + String.valueOf(loopCounter.getAndIncrement());
    watch.start(taskName);
  }
  
  @Scheduled(fixedDelayString = "${spring.task.fixedDelay4}")
  public void tick4() throws InterruptedException{
    watch.stop();
    logger.info(watch.prettyPrint());
    String taskName =  taskNamePrefix + " "+ fixedDelay4 + "-" + String.valueOf(loopCounter.getAndIncrement());
    watch.start(taskName);
  }
  
  @Scheduled(fixedDelayString = "${spring.task.fixedDelay5}")
  public void tick5() throws InterruptedException{
    watch.stop();
    logger.info(watch.prettyPrint());
    String taskName =  taskNamePrefix + " "+ fixedDelay5 + "-" + String.valueOf(loopCounter.getAndIncrement());
    watch.start(taskName);
  }
 
  @Bean
  public StopWatch watch() {
    return new StopWatch();
  }
}