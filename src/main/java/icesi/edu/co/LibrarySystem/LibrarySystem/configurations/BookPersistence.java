package icesi.edu.co.LibrarySystem.LibrarySystem.configurations;

import icesi.edu.co.LibrarySystem.LibrarySystem.persistence.models.BeanA;
import icesi.edu.co.LibrarySystem.LibrarySystem.persistence.models.BeanB;
import icesi.edu.co.LibrarySystem.LibrarySystem.persistence.models.BeanC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookPersistence {
    @Bean
    public BeanA beanA(){
        return new BeanA();
    }

    @Bean(initMethod = "initialize")
    public BeanB beanB(){
        return new BeanB();
    }

    @Bean(destroyMethod = "destroy")
    public BeanC beanC(){
        return new BeanC();
    }
}
