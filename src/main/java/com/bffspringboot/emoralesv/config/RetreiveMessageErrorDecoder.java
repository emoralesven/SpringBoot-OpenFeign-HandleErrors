package com.bffspringboot.emoralesv.config;

import com.bffspringboot.emoralesv.exceptions.CustomException;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;

/**
 * RetreiveMessageErrorDecoder.
 *
 * @author Claudio Quinteros.
 * @version 1.0.0, 05-01-2023
 */
public class RetreiveMessageErrorDecoder implements ErrorDecoder {


    private ErrorDecoder errorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {



        if (404 == response.status() ||500 == response.status()){
            return new CustomException(String.valueOf(response.status()), response.reason());
        }
        else {
            return errorDecoder.decode(methodKey, response);
        }
    }
}