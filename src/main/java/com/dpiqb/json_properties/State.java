package com.dpiqb.json_properties;

import org.springframework.context.annotation.Configuration;

@Configuration
public class State {
 private final static String[] STATES = new String[]{"Alabama","Alaska","Arizona","Arkansas","California","Colorado",
   "Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky",
   "Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska",
   "Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma",
   "Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont",
   "Virginia","Washington","West Virginia","Wisconsin","Wyoming","Australian Capital Territory","New South Wales",
   "Northern Territory","Queensland","South Australia","Tasmania","Victoria","Western Australia","England","Scotland",
   "Wales","Northern Ireland","Cherkasy","Chernihiv","Chernivtsi","Dnipropetrovsk","Donetsk","Ivano-Frankivsk",
   "Kharkiv","Kherson","Khmelnytskyi","Kirovohrad","Kyiv","Luhansk","Lviv","Mykolaiv","Odessa","Poltava","Rivne",
   "Sumy","Ternopil","Vinnytsia","Volyn","Zakarpattia","Zaporizhzhia","Zhytomyr","Autonomous Republic of Crimea"};
  public String get(){
    System.out.println("STATES.length = " + STATES.length);
    return Util.returnRandomFromArray(STATES);
  }
}
