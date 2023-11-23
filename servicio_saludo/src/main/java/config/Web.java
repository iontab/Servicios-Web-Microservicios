package config;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//Java EE
public class Web implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) {
		
		 // Registra la clase de configuración del controlador
			      AnnotationConfigWebApplicationContext dispatcherContext =new AnnotationConfigWebApplicationContext();
			      dispatcherContext.register(MvcConfig.class);
			      
		 // Crea y registra el DispatcherServlet
			      ServletRegistration.Dynamic dispatcher =
			        container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
			      dispatcher.setLoadOnStartup(1);
			      dispatcher.addMapping("/");
	}

}
