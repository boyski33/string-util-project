package com.kushlev.stringutil.rest;

import com.kushlev.stringutil.core.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/string")
public class StringController {

  private final StringService stringService;

  @Autowired
  public StringController(StringService stringService) {
    this.stringService = stringService;
  }

  @GetMapping("/words")
  public ResponseEntity<Integer> getNumberOfWords(
      @RequestParam("string")
          String str) {
    Integer words = stringService.getNumberOfWords(str);

    return ResponseEntity.ok(words);
  }

  @GetMapping("/symbols")
  public ResponseEntity<Integer> getNumberOfSymbols(
      @RequestParam("string")
          String str) {
    Integer symbols = stringService.getNumberOfSymbols(str);

    return ResponseEntity.ok(symbols);
  }

  @GetMapping("/invert")
  public ResponseEntity<String> invertString(
      @RequestParam("string")
          String str) {
    String inverted = stringService.invert(str);

    return ResponseEntity.ok(inverted);
  }

  @GetMapping("/substring")
  public ResponseEntity<Integer> findSubstr(
      @RequestParam("string")
          String str,
      @RequestParam("substring")
          String substr) {
    Integer index = stringService.getSubstringIndex(str, substr);

    return ResponseEntity.ok(index);
  }

}
