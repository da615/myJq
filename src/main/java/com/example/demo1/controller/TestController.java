package com.example.demo1.controller;

import com.example.demo1.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {

    //项目起始页
    @RequestMapping("/")
    public String index(Model model, HttpServletResponse response) {
        model.addAttribute("name", "simonsfan");
        return "/index";

    }

    @GetMapping("/demo")
    public String demo(){
        return "index";
    }


    @GetMapping("/demo1")
    @ResponseBody
    public Person demo3(String name,String password){
        System.out.println("person:" + name + "," + password);
        Person p= new Person();
        p.setName("dada1");
        p.setPassword("111");
        return p;
    }

    @PostMapping("/demo2")
    @ResponseBody
    public Person demo2(@RequestBody Person person){
        System.out.println("person:" + person.getName() + "," + person.getPassword());
        Person p= new Person();
        p.setName("dada2");
        return p;
    }

    @GetMapping("/demo3/{name}")
    @ResponseBody
    public Person demo3(@PathVariable String name){
        System.out.println("person:" + name);
        Person p= new Person();
        p.setName("dada3");
        return p;
    }

    @PostMapping("/demo4/{name}")
    @ResponseBody
    public Person demo4(@PathVariable String name){
        System.out.println("person:" + name);
        Person p= new Person();
        p.setName("dada4");
        return p;
    }

    @GetMapping("/demo5")
    @ResponseBody
    public Person demo5(@RequestParam String name){
        System.out.println("person:" + name);
        Person p= new Person();
        p.setName("dada5");
        return p;
    }

    @PostMapping("/demo6")
    @ResponseBody
    public Person demo6(@RequestParam("name") String name, @RequestParam("password") String password){
        System.out.println("person:" + name +"," + password);
        Person p= new Person();
        p.setName("dada6");
        return p;
    }


}
