package com.aacfahim.JPACRUD.service;

import com.aacfahim.JPACRUD.model.Colleagues;
import com.aacfahim.JPACRUD.repository.ColleaguesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.Cookie;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class ColleaguesService {

    @Autowired
    ColleaguesRepository colleaguesRepository;


   public List<Colleagues> getAllColleagues(){
       List<Colleagues> list = new ArrayList<Colleagues>();

       colleaguesRepository.findAll().forEach(friends -> list.add(friends));

       return list;
   }

   public Colleagues getColleagueByNum(int num){
       return colleaguesRepository.findById(num).get();
   }

   public Colleagues changeDesignation(String designation, int phone){
       Colleagues UpdatedColleague =  colleaguesRepository.findById(phone).get();
       UpdatedColleague.setDesignation(designation);
       return UpdatedColleague;
   }

    public Colleagues changeSalary(int salary, int phone){
        Colleagues UpdatedColleague =  colleaguesRepository.findById(phone).get();
        UpdatedColleague.setNum(salary);
        return UpdatedColleague;
    }

    public void addEmployee(Colleagues colleagues){
       colleaguesRepository.save(colleagues);
        System.out.println("Added " + colleagues.getName() + " | " + colleagues.getPhone());
    }

    public void inactive(int phone){
       colleaguesRepository.deleteById(phone);
    }

    public long getColleagueCount(){

       return colleaguesRepository.count();
    }





}
