package com.rookies4.myspringboot.config;

import com.rookies4.myspringboot.config.vo.CustomVO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProdConfig {
    @Bean
    public CustomVO customVO() {

    }
}
