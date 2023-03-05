package com.dpiqb.person;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("persons")
@RequiredArgsConstructor
public class PersonController {
  private final PersonService personService;
  @GetMapping
  public ModelAndView getPage() {
    List<String> fields = Arrays.stream(PersonDTO.class.getDeclaredFields()).map(Field::getName).toList();
    ModelAndView result = new ModelAndView("main");
    result.addObject("fields", fields);
    return result;
  }
  @GetMapping("json")
  public ModelAndView sendJson(@RequestParam(required = false) Integer amount, @RequestParam(required = false) Set<String>fields) {
    long startTime = System.nanoTime();
    List<PersonDTO> personsDTO = personService.getRandomPersons(amount, fields);
    MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
    jsonView.setPrettyPrint(true);
    ModelAndView result = new ModelAndView(jsonView);
    result.addObject("persons", personsDTO);
    long stopTime = System.nanoTime();
    System.out.println("Result === " + (stopTime - startTime));
    return result;
  }
}
