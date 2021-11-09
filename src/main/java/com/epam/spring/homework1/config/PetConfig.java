package com.epam.spring.homework1.config;

import com.epam.spring.homework1.pet.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(
        basePackages = "com.epam.spring.homework1.pet",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Spider.class)
)
public class PetConfig {

    @Bean
    @Primary
    public Cheetah cheetah() {
        return new Cheetah();
    }

    @Bean
    @Qualifier("cheetah")
    public Cheetah getCheetah(){
        return new Cheetah();
    }
}
