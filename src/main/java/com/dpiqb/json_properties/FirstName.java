package com.dpiqb.json_properties;

import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstName {
  private final String[] NAMES = new String[]{"Jeremy","Christian","Keith","Roger","Terry","Gerald","Harold","Sean",
    "Austin","Carl","Arthur","Lawrence","Dylan","Jesse","Jordan","Bryan","Billy","Joe","Bruce","Gabriel","Logan",
    "Albert","Willie","Alan","Juan","Wayne","Elijah","Randy","Roy","Vincent","Ralph","Eugene","Russell","Bobby",
    "Mason","Philip","Louis","Megan","Andrea","Cheryl","Hannah","Jacqueline","Martha","Gloria","Teresa","Ann","Sara",
    "Madison","Frances","Kathryn","Janice","Jean","Abigail","Alice","Julia","Judy","Sophia","Grace","Denise","Amber",
    "Doris","Marilyn","Danielle","Beverly","Isabella","Theresa","Diana","Natalie","Brittany","Charlotte","Marie",
    "Kayla","Alexis","Lori"};
  public String get(){
    return Util.returnRandomFromArray(NAMES);
  }
}
