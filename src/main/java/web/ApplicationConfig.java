package web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.BusinessLogic;
import services.BusinessLogicImpl;
import services.DBService;
import services.DBServiceImpl;

@Configuration
public class ApplicationConfig {

    @Bean
    public BusinessLogic getBusinessLogicService() {
        return new BusinessLogicImpl();
    }

    @Bean
    public DBService getDBService() {
        return new DBServiceImpl();
    }
}
