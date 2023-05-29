package com.aacfahim.JPACRUD.controller;

import com.aacfahim.JPACRUD.model.Colleagues;
import com.aacfahim.JPACRUD.service.ColleaguesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ColleagueController {

    @Autowired
    ColleaguesService colleaguesService;

    @PostMapping("/add")
    private int addColleague(@RequestBody Colleagues colleagues){
        colleaguesService.addEmployee(colleagues);
        return colleagues.getPhone();
    }

    @GetMapping("/all")
    private List<Colleagues> getAllColleagues(){
        return colleaguesService.getAllColleagues();
    }

    @GetMapping("/get/{id}")
    private Colleagues getColleague(@PathVariable("id") int id){
        return colleaguesService.getColleagueByNum(id);

    }

    @DeleteMapping("/delete/{id}")
    private void inactive(@PathVariable("id") int id){
        colleaguesService.inactive(id);
    }

    @PostMapping("/designation/{id}")
    private Colleagues changeDesignation(String designation, @PathVariable("id") int id){
        return colleaguesService.changeDesignation(designation, id);
    }








}
