package top.rsmzjp.main.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages="top.rsmzjp.main.domain")
@EnableJpaRepositories(basePackages= "top.rsmzjp.main.repository")
@EnableTransactionManagement
public class HibernateJpaConfig {

}
