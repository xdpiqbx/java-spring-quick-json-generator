package com.dpiqb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class RootController {
  @GetMapping
  public RedirectView toNoteList(){
    return new RedirectView("/persons");
  }
}
