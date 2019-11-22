package com.multiplyservice.com.demo.service;

import com.multiplyservice.com.demo.dao.ResponceDao;
import com.multiplyservice.com.demo.model.Responce;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ResponceRerviceImpl implements ResponceService {

    private ResponceDao responceDao;

    public void setResponceDao(ResponceDao responceDao) {
        this.responceDao = responceDao;
    }



    @Override
    @Transactional
    public void addResponce(Responce responce) {
        this.responceDao.addResponce(responce);
    }


    @Transactional
    @Override
    public void updateResponce(Responce responce) {
    this.responceDao.updateResponce(responce);
    }


    @Transactional
    @Override
    public void removeResponce(int id) {
    this.responceDao.removeResponce(id);
    }


    @Transactional
    @Override
    public Responce getResponceById(int id) {
        return this.responceDao.getResponceById(id);
    }


    @Transactional
    @Override
    public List<Responce> listResponce() {
        return this.responceDao.listResponce();
    }
}
