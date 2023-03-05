package com.dpiqb.json_properties;

import org.springframework.context.annotation.Configuration;

import java.util.Random;
@Configuration
public class Util {
  public static <T> T returnRandomFromArray (T[] array){
    int index = new Random().nextInt(array.length);
    return array[index];
  }
}
