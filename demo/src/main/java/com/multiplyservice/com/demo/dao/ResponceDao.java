package com.multiplyservice.com.demo.dao;

import com.multiplyservice.com.demo.model.Responce;

import java.util.List;

public interface ResponceDao  {
    public void addResponce(Responce responce);
    public void updateResponce(Responce responce);
    public void removeResponce(int id);
    public Responce getResponceById(int id);
    public List<Responce> listResponce();
}
