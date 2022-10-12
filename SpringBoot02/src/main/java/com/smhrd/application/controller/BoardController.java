package com.smhrd.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

   @RequestMapping("/boardList.do")
   public String boardList(Model model) {
      model.addAttribute("str","string");
      return "boardList";
   }
}