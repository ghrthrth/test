package com.multiplyservice.com.demo.controller;

import com.multiplyservice.com.demo.dao.ResponceDao;
import com.multiplyservice.com.demo.model.Responce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



public class ResponceController {
    @Autowired
    private ResponceDao responceDao;

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome";
    }


    @RequestMapping(value = "/responce",
            method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                     })
    @ResponseBody
    public Responce addResponce(@RequestBody Responce responce) {
        return responceDao.addResponce(responce);

    }
}
