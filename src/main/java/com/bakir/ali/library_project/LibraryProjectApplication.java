package com.bakir.ali.library_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class LibraryProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryProjectApplication.class, args);
    }
    @GetMapping ("/index")
    public String index () { return "index.html";}

    @GetMapping ("/login")
    public String login () { return "login.html";}

    @GetMapping ("/logout")
    public String logout () {return "logout.html";}

    @GetMapping ("/fragments")
    public String fragments () { return "fragments.html";}
}
