package org.huy.huySpringBoot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/howdy")
public class HowdyResource {

    @GetMapping
    public String howdy() {
        return "Howdy y'all!";
    }
}
