package config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
@Import(value = {JavaConfigurationA.class})
@ComponentScan("com.wubai")
@PropertySource(value = "classpath:jdbc.properties")
@Configuration
public class JavaConfiguration {
    @Value("${wubai.url}")
    private String url;
    @Value("${wubai.driver}")
    private String driver;
    @Value("${wubai.username}")
    private String username;
    @Value("${wubai.password}")
    private String password;
    @Bean(name = "datas")

    public DruidDataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource datas){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(datas);
        return jdbcTemplate;
    }
}
