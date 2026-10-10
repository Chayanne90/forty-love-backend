package com.forty_love.controller;

import com.forty_love.service.CoachService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/coachs")
public class CoachController {
    private CoachService CoachService;
}
