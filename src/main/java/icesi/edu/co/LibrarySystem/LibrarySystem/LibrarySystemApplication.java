package icesi.edu.co.LibrarySystem.LibrarySystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(scanBasePackages = "icesi.edu.co.LibrarySystem")
public class LibrarySystemApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LibrarySystemApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("icesi.edu.co.LibrarySystem.configuration");

		displayAllBeans(ctx);
		ctx.close();
	}
	public static void displayAllBeans(ApplicationContext ctx) {
		String[] allBeanNames = ctx.getBeanDefinitionNames();
		for(String beanName : allBeanNames) {
			System.out.println(beanName);
		}
	}
}
