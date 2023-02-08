package com.bffspringboot.emoralesv.exceptions;

import com.bffspringboot.emoralesv.dtos.ExceptionMessage;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class ResourceNotFoundException extends RuntimeException {
    private ExceptionMessage exceptionMessage;

}
