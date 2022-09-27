package ru.example.test1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {
    @GetMapping("/")
    public String Home(Model model, @RequestParam(required = true, name = "temp") String temp){
        model.addAttribute("name", temp);
        return "main";
    }
    @GetMapping("/calc")
    public String Calc(){
        return "calculator";
    }
    @PostMapping("/calc")
    public String CalcRes(Model model, @RequestParam(required = true, name = "x") int x,
                          @RequestParam(required = true, name = "y") int y,
                          @RequestParam(required = true, name = "oper") String oper){

        int res;
        switch (oper){
            case("+"):
                res = x + y;
                break;
            case("-"):
                res = x - y;
                break;
            case("*"):
                res = x * y;
                break;
            case("/"):
                res = x / y;
                break;
            default:
                res = 0;
                break;
        }
        model.addAttribute("name", res);
        return "main";
    }
    @GetMapping("/getcalc")
    public String CalcRes2(Model model, @RequestParam(required = true, name = "getx") int x,
                          @RequestParam(required = true, name = "gety") int y,
                          @RequestParam(required = true, name = "getoper") String oper){

        int res;
        switch (oper){
            case("+"):
                res = x + y;
                break;
            case("-"):
                res = x - y;
                break;
            case("*"):
                res = x * y;
                break;
            case("/"):
                res = x / y;
                break;
            default:
                res = 0;
                break;
        }
        model.addAttribute("name", res);
        return "main";
    }
}
