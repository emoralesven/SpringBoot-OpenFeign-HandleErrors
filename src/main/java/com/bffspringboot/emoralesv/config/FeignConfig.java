package com.bffspringboot.emoralesv.config;

import feign.Logger;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
/**
 * FeignConfig.
 *
 * @author Eduardo Morales Venegas.
 * @version 1.0.0, 29-01-2023
 */
@RequiredArgsConstructor
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
