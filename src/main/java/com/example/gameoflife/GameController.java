package com.example.gameoflife;

import org.springframework.web.bind.annotation.GetMapping;

public class GameController {
  @GetMapping("/")
  public String home() {
    return "start";
  }
}
