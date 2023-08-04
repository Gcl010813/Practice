package com.xiaoGuo.Student.utils;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JDBCUtil {
    private static final DataSource dataSource;
    private static final Properties properties = new Properties();


    static {
        try (InputStream inputStream = JDBCUtil.class.getResourceAsStream("/jdbc.properties")) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String driver = properties.getProperty("driver");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        dataSource = new DriverManagerDataSource(url, username, password);
    }

    public static JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }
}