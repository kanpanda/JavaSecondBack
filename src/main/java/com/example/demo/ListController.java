package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/list") // 遷移先を指定
public class ListController {
    @RequestMapping(method = RequestMethod.GET)
    public String list() {
        return "list"; // メソッドの戻り値homeが指定したhtml(home.html)を呼び出す
    }
}
