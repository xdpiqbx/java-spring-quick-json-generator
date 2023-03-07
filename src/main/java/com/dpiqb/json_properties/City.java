package com.dpiqb.json_properties;

import org.springframework.context.annotation.Configuration;

@Configuration
public class City {
  private static final String[] CITIES = new String[]{"Aarhus","Abu Dhabi","Albufeira","Amman","Amsterdam","Amsterdam",
    "Antalya","Athens","Auckland","Baku","Bangkok","Barcelona","Basel","Beijing","Bergen","Berlin","Bern",
    "Bila Tserkva","Bilbao","Bologna","Bordeaux","Boston","Brisbane","Bristol","Bruges","Brussels","Bucha",
    "Buenos Aires","Canberra","Cancun","Cape Town","Cartagena","Charleston","Chiang Mai","Chicago","Cologne",
    "Cologne","Copenhagen","Cork","Cork","Curitiba","Doha","Doneck","Dresden","Dubai","Dubai","Dublin","Dubrovnik",
    "Edinburgh","Essen","Florence","Fortaleza","Frankfurt","Gdansk","Girona","Glasgow","Gothenburg","Granada","Graz",
    "Halifax","Havana","Havana","Helsinki","Ho Chi Minh","Hoi An","Hong Kong","Honolulu","Houston","Innsbruck",
    "Istanbul","Jerusalem","Johannesburg","Kazan","Kharkiv","Krakow","Krakow","Kuala Lumpur","Kuwait","Kyiv",
    "Kyoto","La Paz","Las Vegas","Leeds","Leipzig","Leipzig","Lille","Lima","Lisbon","Ljubljana","London",
    "Los Angeles","Luhansk","Luxembourg","Lviv","Lyon","Madrid","Manchester","Manila","Marrakesh","Marseille",
    "Marseille","Melbourne","Miami","Montevideo","Montreal","Mumbai","Munich","Naples","New York","Nice",
    "Nuremberg","Osaka","Osaka","Oslo","Paris","Philadelphia","Pisa","Portland","Porto","Prague","Pula",
    "Quebec","Reykjavik","Riga","Rio de Janeiro","Riyadh","Rome","Rotterdam","Salvador","San Antonio",
    "San Cristobal de las Casas","San Diego","San Francisco","San Juan","San Sebastian","Santa Fe","Sapporo",
    "Seattle","Seoul","Shanghai","Singapore","Split","Stockholm","Sydney","Taipei","Taipei","Tallinn","Tokyo",
    "Toronto","Toulouse","Tulsa","Utrecht","Valencia","Valencia","Vancouver","Venice","Vienna","Warsaw",
    "Washington D.C.","Wroclaw","Zagreb","Zurich"};

  public String get(){
    return Util.returnRandomFromArray(CITIES);
  }
}
