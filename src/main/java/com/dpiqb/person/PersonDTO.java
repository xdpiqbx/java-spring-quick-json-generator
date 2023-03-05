package com.dpiqb.person;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDTO {
  private Long id;
  private String uuid;
  private String firstName;
  private String lastName;
  private String email;
  private String phone;
  private String country;
  private String state;
  private String city;
  private String address;
  private Integer postalZipCode;
}
