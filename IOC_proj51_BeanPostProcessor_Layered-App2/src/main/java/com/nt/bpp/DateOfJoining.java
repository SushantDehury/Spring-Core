package com.nt.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.bo.PersionBO;

public class DateOfJoining implements BeanPostProcessor {
	
	//Both method are Default method in Spring 5.x ownwords
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof PersionBO) {
			((PersionBO) bean).setDoj(new Date());
		}
		
		return bean;
	}
	/*@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}*/

}
