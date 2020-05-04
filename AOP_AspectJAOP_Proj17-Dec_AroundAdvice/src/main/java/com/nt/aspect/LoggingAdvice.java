package com.nt.aspect;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.ProceedingJoinPoint;



public class LoggingAdvice {
	public static Logger logger;
	public LoggingAdvice() {
		logger=Logger.getLogger(LoggingAdvice.class);
		PropertyConfigurator.configure("src/main/java/com/nt/commons/log4j.properties");
	}
	public Object  logging(ProceedingJoinPoint pjp) throws Throwable{
	//	logger.info("Enterning into the "+pjp.getSignature());
		logger.debug("Enterning into the "+pjp.getSignature());
		Object retVal=pjp.proceed();
	//	logger.info("Exiting into the "+pjp.getSignature());
		logger.debug("Exiting into the "+pjp.getSignature());
		return retVal;
	}

}