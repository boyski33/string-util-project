package com.kushlev.stringutil.core;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class StringService {

  public Integer getNumberOfWords(String str) {
    return str.split(" ").length;
  }

  public Integer getNumberOfSymbols(String str) {
    Set<Character> symbols = new HashSet<>();

    for (char c : str.toCharArray()) {
      symbols.add(c);
    }

    return symbols.size();
  }

  public String invert(String str) {
    char[] chars = str.toCharArray();
    char[] inverted = new char[chars.length];

    for (int i = 0; i < chars.length; i++) {
      inverted[i] = chars[chars.length - (i + 1)];
    }

    return new String(inverted);
  }

  public Integer getSubstringIndex(String str, String substr) {
    if (substr.isEmpty()) {
      return -1;
    }

    boolean found;
    for (int i = 0; i < str.length(); i++) {
      if (substr.toCharArray()[0] == str.toCharArray()[i] && substr.length() <= str.length() - i) {
        found = true;
        for (int j = 1; j < substr.length(); j++) {
          if (substr.toCharArray()[j] != str.toCharArray()[i+j]) {
            found = false;
            break;
          }
        }
        if (found) {
          return i;
        }
      }
    }

    return -1;
  }
}
