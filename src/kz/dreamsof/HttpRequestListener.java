package kz.dreamsof;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class HttpRequestListener implements ServletRequestListener{

	@Override
	public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		// TODO Auto-generated method stub
		ServletContext servletContext = servletRequestEvent.getServletContext();
		servletContext.log("Инициализирован новый запрос");
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
		// TODO Auto-generated method stub
		ServletContext servletContext = servletRequestEvent.getServletContext();
		servletContext.log("Запрос уничтожен");
	}

	
}
