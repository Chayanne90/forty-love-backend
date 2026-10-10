package com.forty_love.controller;


import com.forty_love.service.CriteriaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/criteria")
public class CriteriaController {
    private CriteriaService criteriaService;
}
