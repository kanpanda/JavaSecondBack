package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// Corsの設定をいい感じにする
// @CrossOrigin(origins = "*")
// http://localhost:8080/templates/home
@Controller
@RequestMapping("/home") // 遷移先を指定
public class HomeController {
    // @GetMapping("/test")
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "home"; // メソッドの戻り値homeが指定したhtml(home.html)を呼び出す
    }
}
