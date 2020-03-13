/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatkhola;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author Faysal
 */

//for any kind of bean
@Import(PersistenceConfig.class)
@Configuration
public class SpringConfig{
//        extends WebMvcConfigurerAdapter{
    
    
    
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//            .allowedOrigins("http://localhost:4200")
//            .allowedMethods("PUT", "DELETE", "GET")
////            .allowedHeaders("header1", "header2", "header3")
////            .exposedHeaders("header1", "header2")
//            .allowCredentials(false).maxAge(3600);
//    }

    
    
//    @Autowired
//    EntityManagerFactory emf;
//    
//    @Bean
//    public DataSource getDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/hatkhola");
//        dataSource.setUsername("root");
//        dataSource.setPassword("");
//        return dataSource;
//    }
//
//    @Bean
//    public SessionFactory sessionFactory() {
//        return emf.unwrap(SessionFactory.class);
//}
//    @Bean
//    public JdbcTemplate getJdbcTemplate() {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
//        return jdbcTemplate;
//    }


}
