package com.bffspringboot.emoralesv.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private String userId;
    private String id;
    private String title;
    private String body;
}
