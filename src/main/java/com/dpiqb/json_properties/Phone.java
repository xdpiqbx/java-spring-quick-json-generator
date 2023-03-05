package com.dpiqb.json_properties;

import org.springframework.context.annotation.Configuration;

import java.util.Random;
@Configuration
public class Phone {
  public String generate(){
    return String.format(
      "+1 (%d) %d-%d",
      new Random().nextInt(900) + 100,
      new Random().nextInt(900) + 100,
      new Random().nextInt(9000) + 1000
    );
  }
}
