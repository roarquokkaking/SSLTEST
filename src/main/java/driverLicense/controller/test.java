package driverLicense.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class test {

    @GetMapping(path="test")
    public String test(){
        return "asd";
    }
}
