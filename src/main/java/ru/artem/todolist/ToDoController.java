package ru.artem.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToDoController {
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
