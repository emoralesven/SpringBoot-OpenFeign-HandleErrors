package com.bffspringboot.emoralesv.config;

import com.bffspringboot.emoralesv.dtos.ExceptionMessage;
import com.bffspringboot.emoralesv.exceptions.ResourceNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;
import io.micrometer.core.instrument.util.IOUtils;
import org.apache.catalina.util.IOTools;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

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

        ExceptionMessage message = null;

        try(InputStream body=response.body().asInputStream()){
            message= new ExceptionMessage((String) response.headers().get("date").toArray()[0],
                    response.status(),
                    HttpStatus.resolve(response.status()).getReasonPhrase(),
                    IOUtils.toString(body, StandardCharsets.UTF_8),
                    response.request().url());
        }catch(IOException exception){
            return new Exception(exception.getMessage());
        }
        if (404 == response.status()){
            message.setMessage("Recurso solicitado no se encuentra disponible");
            throw new ResourceNotFoundException(message);
        }
        else {
            return errorDecoder.decode(methodKey, response);
        }
    }
}