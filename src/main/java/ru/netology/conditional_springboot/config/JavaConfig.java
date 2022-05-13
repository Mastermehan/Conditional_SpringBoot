package ru.netology.conditional_springboot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import ru.netology.conditional_springboot.profiles.DevProfile;
import ru.netology.conditional_springboot.profiles.ProductionProfile;
import ru.netology.conditional_springboot.profiles.SystemProfile;

public class JavaConfig {
    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", matchIfMissing = true,
            havingValue = "true")
    public SystemProfile devProfile() {
        System.out.println("Создали бин");
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        System.out.println("Создали бин 2");
        return new ProductionProfile();
    }
}
