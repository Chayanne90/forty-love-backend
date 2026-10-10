package com.forty_love.controller;


import com.forty_love.service.SubLevelsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/sub-levels")
public class SubLevelsController {
    private SubLevelsService subLevelsService;
}
