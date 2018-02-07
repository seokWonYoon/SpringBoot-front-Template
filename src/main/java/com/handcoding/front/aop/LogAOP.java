package com.handcoding.front.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAOP {

	private static final Logger logger = LoggerFactory.getLogger(LogAOP.class);
	private static String type = "";
	
	@Before("execution(* com..*Controller.*(..)) or "
			+ "execution(* com..*API.*(..))")
	public void before(JoinPoint j) {
		type = j.getSignature().getDeclaringTypeName();
        if (type.indexOf("Controller") > -1) {
    		logger.info("===========================================\tfront Controller 시작\t=====================================");
        }else if (type.indexOf("API") > -1) {
            logger.info("===========================================\tfront API 시작\t=====================================");
        }
		logger.info(j.getTarget()+"");
		Object args[] = j.getArgs();
		if(args!=null){
			logger.info("Method:\t"+j.getSignature().getName());
			for (int i = 0; i < args.length; i++) {
				logger.info(i+" 번째 값 :\t"+args[i]);
			}
		}
	}

}
