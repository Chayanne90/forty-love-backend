package com.forty_love.controller;


import com.forty_love.service.PlayerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/players")
public class PlayerController {
    private PlayerService playerService;
}
