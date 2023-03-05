package com.dpiqb.json_properties;

import org.springframework.context.annotation.Configuration;

import java.util.Random;
@Configuration
public class ZipCode {
  public int generate(){
    return new Random().nextInt(900000000) + 100000000;
  }
}
