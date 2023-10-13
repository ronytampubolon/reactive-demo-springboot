package com.flowdy.demoreactive.config;

import io.asyncer.r2dbc.mysql.MySqlConnectionConfiguration;
import io.asyncer.r2dbc.mysql.MySqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import java.time.ZoneId;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;

@Configuration
@Slf4j
public class ApplicationConfiguration extends AbstractR2dbcConfiguration {
  @Override
  @Bean
  public ConnectionFactory connectionFactory() {
    log.info("ApplicationConfiguration: start");
    MySqlConnectionConfiguration configuration =
        MySqlConnectionConfiguration.builder()
            .host("127.0.0.1")
            .user("root")
            .port(3306) // optional, default 3306
            .password("") // optional, default null, null means has no password
            .database("tutor")
            .serverZoneId(ZoneId.of("Asia/Jakarta"))
            .build();
    ConnectionFactory connectionFactory = MySqlConnectionFactory.from(configuration);
    log.info("ApplicationConfiguration: start");
    return connectionFactory;
  }
}
