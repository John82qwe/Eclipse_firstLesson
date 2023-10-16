package web.ru;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestString {

	public static void main (String[] args) {
	    
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"aplicationContext.xml");
		
		HelloBean helloBean = context.getBean("helloBean", HelloBean.class);
		
		System.out.println(helloBean.getName());
		
		context.close();
	}
}

