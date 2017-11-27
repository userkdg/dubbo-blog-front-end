package com.isunday.blog.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时器的配置放在applicationContext.xml中
 */
@Component
public class Schedule2Msg {
	private static final Logger logger = LoggerFactory.getLogger("job");
	/**
	 * cron表达式
	 * 例：使用fixedDelay指定触发条件为每5000毫秒执行一次。注意：必须在上一次调度成功后的5000秒才能执行。
		@Scheduled(fixedDelay=5000)
		publicvoid doSomething() {
		
		    // something that should execute periodically
		
		}
		例：使用fixedRate指定触发条件为每5000毫秒执行一次。注意：无论上一次调度是否成功，5000秒后必然执行。
		@Scheduled(fixedRate=5000)
		publicvoid doSomething() {
		    // something that should execute periodically
		}
		例：使用initialDelay指定方法在初始化1000毫秒后才开始调度。
		@Scheduled(initialDelay=1000, fixedRate=5000)
		publicvoid doSomething() {
		    // something that should execute periodically
		}
	 * 
	 * 
	 */
	@Scheduled(cron="0/5 * * * * ?")
	public void taskMsg() {
		System.out.println("msg....");
		logger.info("aaaaaaaaaa");
	}

	@Scheduled(fixedDelay = 5000)
	public void task2(){
		//System.out.println("bbbbbbbbbbbbbb");
		logger.info("job");
	}
	
}
