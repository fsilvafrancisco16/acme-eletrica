package com.nomealuno.demoacmeap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import springfox.documentation.annotations.ApiIgnore;

/**
 *
 * @author francisco
 */
@ApiIgnore
@RestController
public class IndexController {

    @GetMapping("/")
    public RedirectView redirectToSwagger() {
        return new RedirectView("/swagger-ui.html");
    }
}
