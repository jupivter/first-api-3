package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/strings")
    @ResponseBody
    public String getStrings(@RequestParam (required = true) String string1, @RequestParam (required = false) String string2){
        return string1 + " " + string2;
    }
}