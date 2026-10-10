package com.forty_love.controller;


import com.forty_love.service.GroupLessonsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/group-lessons")
public class GroupLessonsController {
    private GroupLessonsService groupLessonsService;
}
