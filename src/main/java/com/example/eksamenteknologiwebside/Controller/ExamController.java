package com.example.eksamenteknologiwebside.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ExamController {


@GetMapping("/")
public String index(){
  return "Teknologi";
}


}
