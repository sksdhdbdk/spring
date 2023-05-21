package com.bank;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.bank")
@EnableTransactionManagement
public class springConfig {
    @Bean(name = "dataSource")
    public DruidDataSource getDataSource(){
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc,Driver");
        druidDataSource.setUrl("jdbc::mysql://localhost:3306/spring6");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("lhj1037");
        return druidDataSource;
    }
    @Bean(name = "jdbcTemplate")
    public JdbcTemplate getjdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
    @Bean(name = "txManager")
    public DataSourceTransactionManager getDataSourceManager(DataSource dataSource){
        DataSourceTransactionManager txManager=new DataSourceTransactionManager();
        txManager.setDataSource(dataSource);
        return txManager;
    }

}
