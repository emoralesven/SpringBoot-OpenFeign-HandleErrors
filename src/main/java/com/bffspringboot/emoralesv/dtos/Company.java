package com.bffspringboot.emoralesv.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
   private String name;
   private String catchPhrase;
   private String bs;
}
