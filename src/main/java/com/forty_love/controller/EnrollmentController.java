package com.forty_love.controller;


import com.forty_love.service.EnrollmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/enrollments")
public class EnrollmentController {
    private EnrollmentService enrollmentService;
}
