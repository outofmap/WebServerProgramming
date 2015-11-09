package net.slipp.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRender {
	private MessageProvider messageProvider;
	
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
	
	public void render(){
		System.out.println(messageProvider.getMessage());
	}
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("di.xml");
		MessageRender renderer = (MessageRender)ac.getBean("messageRenderer");
		renderer.render();
		
		//소스코드로 구현하는 DI방식
		/*MessageRender renderer = new MessageRender();
		renderer.setMessageProvider(new HelloWorldMessageProvider());
		renderer.render();
		
		renderer.setMessageProvider(new HiWorldMessageProvider());
		renderer.render();*/
	}
}
