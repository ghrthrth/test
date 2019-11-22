package com.multiplyservice.com.demo.controller;

import com.multiplyservice.com.demo.model.Responce;
import com.multiplyservice.com.demo.service.ResponceService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class ResponceController {
    private ResponceService responceService;


    public void setResponceService(ResponceService responceService) {
        this.responceService = responceService;
    }


    @RequestMapping(value = "responce" , method = RequestMethod.GET)
    public String listRequest(Model model){
        model.addAttribute("responce",new Responce());
        model.addAttribute("listResponce", this.responceService.listResponce());
        return "f";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addResponce(@ModelAttribute("responce")Responce responce){
        if (responce.getId()== 0) {
            this.responceService.addResponce(responce);
        }else {
            this.responceService.updateResponce(responce);
        }
        return "d";
    }

    @RequestMapping(value = "/remove/{id}")
    public String removeResponce(@PathVariable("id") int id){
        this.responceService.removeResponce(id);
        return "f";
    }
    @RequestMapping("/edit/{id}")
    public String editResponce(@PathVariable("id") int id, Model model){
        model.addAttribute("responce", this.responceService.getResponceById(id));
        model.addAttribute("listResponce", this.responceService.listResponce());
        return "x";
    }
    @RequestMapping(value = "/responcedata/{id}")
    public String responceData(@PathVariable("id") int id, Model model){
        model.addAttribute("responce",this.responceService.getResponceById(id));
        return "i";
    }
}
