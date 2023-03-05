package com.dpiqb.json_properties;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class Email {
  private final FirstName firstName;
  private final LastName lastName;
  private final String[] PROVIDER = new String[]{"gmail", "mail", "hotmail", "prom", "duck", "proton", "outlook", "yahoo", "zoho"};
  private final String[] DOMAIN = new String[]{"com", "ua", "int", "biz", "org", "net", "edu", "gov", "mil", "io", "cloud", "me"};

  public String generate(String firstName, String lastName){
    return firstName.toLowerCase() + "."
      + lastName.toLowerCase() + "@"
      + Util.returnRandomFromArray(PROVIDER) + "."
      + Util.returnRandomFromArray(DOMAIN);
  }
  public String generate(String string){
    return string.toLowerCase() + "@"
      + Util.returnRandomFromArray(PROVIDER) + "."
      + Util.returnRandomFromArray(DOMAIN);
  }
  public String generate(){
    return firstName.get().toLowerCase() + "."
      + lastName.get().toLowerCase() + "@"
      + Util.returnRandomFromArray(PROVIDER) + "."
      + Util.returnRandomFromArray(DOMAIN);
  }
}
