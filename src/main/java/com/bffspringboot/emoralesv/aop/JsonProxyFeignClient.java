package com.bffspringboot.emoralesv.aop;

import com.bffspringboot.emoralesv.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@FeignClient(configuration = FeignConfig.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonProxyFeignClient {

    @AliasFor(annotation = FeignClient.class)
    String name();

    @AliasFor(annotation = FeignClient.class)
    String url();



    HttpStatus status() default HttpStatus.BAD_REQUEST;
}
