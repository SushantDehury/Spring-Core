package com.nt.beans;

import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named("fkt")
@Scope("singleton")
public class Flipkart {
	
	@Resource(name="bdart")
//	@Resource
//	@Named("dtdc")
	private Courior courior;
	
	public Flipkart() {
		System.out.println("Flipkart 0-param Constructor");
	}
	
	
/*	@Resource(name="dtdc")
	public void setCourior(Courior courior) {
		this.courior = courior;
	}*/
	
/*	@Resource(name="bdart")
	public void inject(Courior courior) {
		this.courior=courior;
	}*/
	
/*	This @Resource Annotation is not apply Constructor mode of Autowired
 * it is only applicable on byType,byName  mode of Autoeired 
	@Resource
	public Flipkart(Courior courior) {
		this.courior=courior;
	}
*/


	public String shooping(String items[]) {
		String status = null;
		int order = 0;
		order = new Random().nextInt(1000);
		status = courior.deliver(order);
		return status + " total price is " + items.length * 300;

	}

}
