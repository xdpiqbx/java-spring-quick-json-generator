package com.dpiqb.json_properties;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class Address {
  // Street, City, state, ZIP code
  private final City cty;
  private final State st;
  private final ZipCode zipCd;
  private static final String[] STREETS = new String[]{"5th Avenue","Abbey Road","Acacia Avenue","Avenida Atlântica",
    "Avenida Paulista","Avenida Presidente Masaryk","Baker Street","Baldwin Street","Bangla Road","Beale Street",
    "Bedford Avenue","Ben Yehuda Street","Bernard Street","Blackfriars Road","Bond Street","Bourbon Street",
    "Brick Lane","Broad Street","Broadway","Brunswick Street","Buchanan Street","Calle Ocho","Canal Street",
    "Carnaby Street","Cat Street","Causeway Bay","Chapel Street","Charles Street","Chestnut Street",
    "Chiswick High Road","Church Street","City Road","Clark Street","Collins Avenue","Commercial Drive",
    "Conduit Street","Constitution Avenue","Corniche Street","Coventry Street","Cowley Road","Cromwell Road",
    "Cuvier Street","Dizengoff Street","Dorchester Road","Downing Street","Drury Lane","Duke Street","Edgware Road",
    "Electric Avenue","Elgin Street","Elm Street","Ermou Street","Essex Street","Euclid Avenue","Exhibition Road",
    "Fenchurch Street","Fleet Street","Florida Street","Fort Street","Franklin Street","Fulham Road",
    "Galeries Lafayette Boulevard Haussmann","George Street","Grafton Street","Great Eastern Street",
    "Great Marlborough Street","Green Lanes","Greenwich Avenue","Grey Street","Grove Street","Gueliz Street",
    "Gurney Drive","Haight Street","Hampstead High Street","Hanover Street","Harbour Street","Harley Street",
    "Hennepin Avenue","Hollywood Boulevard","Hong Kong Road","Houston Street","Hoxton Street","Hurstmere Road",
    "Inverness Terrace","Jalan Bukit Bintang","Jalan Tun Razak","Jermyn Street","John F. Kennedy Boulevard",
    "Johnston Street","Jordaan Street","Jumna Street","K Street","Kensington High Street","Kingsland Road","Kingsway",
    "Knightsbridge","Kolonaki Square","Königsallee","Kruger Street","La Rambla","Ladbroke Grove","Laugavegur",
    "Leidsestraat","Lendal","Lexington Avenue","Lijnbaan","Little Collins Street","Liverpool Road","Lombard Street",
    "Long Street","Madison Avenue","Magheru Boulevard","Main Street","Malibu Road","Mannerheimintie","Market Street",
    "Maximilianstrasse","Melrose Avenue","Menlo Avenue","Meridian Street","Midosuji Avenue","Mill Street",
    "Mission Street","Monmouth"};
  public String generate(String city, String state, Integer zip){
    return String.format(
      "%s, %s, %s, %d",
      Util.returnRandomFromArray(STREETS),
      city == null ? cty.get() : city,
      state == null ? st.get() : state,
      zip == null ? zipCd.generate() : zip
    );
  }
}
