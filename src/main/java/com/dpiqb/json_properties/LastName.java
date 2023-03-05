package com.dpiqb.json_properties;

import org.springframework.context.annotation.Configuration;

@Configuration
public class LastName {
  private final String[] LAST_NAMES = new String[]{"Smith","Johnson","Williams","Brown","Jones","Garcia","Miller",
    "Davis","Rodriguez","Martinez","Hernandez","Lopez","Gonzalez","Wilson","Anderson","Thomas","Taylor","Moore",
    "Jackson","Martin","Lee","Perez","Thompson","White","Harris","Sanchez","Clark","Ramirez","Lewis","Robinson",
    "Walker","Young","Allen","King","Wright","Scott","Torres","Nguyen","Hill","Flores","Green","Adams","Nelson",
    "Baker","Hall","Rivera","Campbell","Mitchell","Carter","Roberts","Chong","Liew","Yong","Yeong","Wong","Bong",
    "Chau","Chew","Chiew","Chi","Sun","Choo","Kwok","Kok","Lim","Koo","Law","Leong","Cheah","Song","Soong","Tong",
    "Thong","Hee","Hon","Foong","Cho","Chaw","Phang","Chen","Siew","Siaw","Thien","Then","Tung","Pan","Phan","Yen",
    "Chai","Choi","Cheong","Toh","Yap","Chang","Chin","Ngui","Wee","Ten","Ngim","Yim"};

  public String get(){
    return Util.returnRandomFromArray(LAST_NAMES);
  }
}
