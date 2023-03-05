package com.dpiqb.person;

import com.dpiqb.json_properties.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.*;

@Service
@RequiredArgsConstructor
public class PersonService {
  private final FirstName fName;
  private final LastName lName;
  private final City cty;
  private final State st;
  private final Email eml;
  private final Phone phn;
  private final Country cntry;
  private final ZipCode zipCd;
  private final Address addr;
  public List<PersonDTO> getRandomPersons(Integer amount, Set<String> fields){
    if (amount == null || fields == null){
      return Collections.emptyList();
    }

    Map<String, Boolean> fldsBoolMap = doesPropertiesExists(fields);
    List<PersonDTO> persons = new LinkedList<>();

    long id = 0;

    for (int i = 0; i < amount; i++) {

      String firstName = !fldsBoolMap.get("firstName") ? null : fName.get();
      String lastName = !fldsBoolMap.get("lastName") ? null : lName.get();
      String city = !fldsBoolMap.get("city") ? null : cty.get();
      String state = !fldsBoolMap.get("state") ? null : st.get() ;
      String email = !fldsBoolMap.get("email") ? null :
          firstName == null && lastName == null ? eml.generate() :
            firstName == null ? eml.generate(lastName) :
              lastName == null ? eml.generate(firstName) :
                eml.generate(firstName, lastName);
      String phone = !fldsBoolMap.get("phone") ? null : phn.generate() ;
      String country = !fldsBoolMap.get("country") ? null : cntry.get();
      Integer zip = !fldsBoolMap.get("postalZipCode") ? null : zipCd.generate();
      String address = !fldsBoolMap.get("address") ? null : addr.generate(city, state, zip);

      PersonDTO personDTO = PersonDTO.builder()
        .id(!fldsBoolMap.get("id") ? null : id++)
        .uuid(!fldsBoolMap.get("uuid") ? null : UUID.randomUUID().toString())
        .firstName(firstName)
        .lastName(lastName)
        .email(email)
        .phone(phone)
        .country(country)
        .state(state)
        .city(city)
        .address(address)
        .postalZipCode(zip)
      .build();

      persons.add(personDTO);
    }
    return persons;
  }

  private static Map<String, Boolean> doesPropertiesExists(Set<String> userFields){
    Map <String, Boolean> checkedMap = new HashMap<>();
    Arrays.stream(PersonDTO.class.getDeclaredFields())
      .map(Field::getName)
      .forEach(field -> checkedMap.put(field, userFields.contains(field)));
    return checkedMap;
  }
}
