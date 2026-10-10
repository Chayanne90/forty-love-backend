package com.forty_love.controller;


import com.forty_love.service.CourtService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/courts")
public class CourtController {
    private CourtService courtService;
}
