package org.medpack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

  @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
  public String printHelloWorld(ModelMap modelMap) {
    modelMap.addAttribute("message", "Hello World");
    return "helloworld";
  }

}
