package com.aacfahim.JPACRUD.controller;

import com.aacfahim.JPACRUD.model.Colleagues;
import com.aacfahim.JPACRUD.model.ResponseModel;
import com.aacfahim.JPACRUD.service.ColleaguesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

        //check the student id
        if(id > colleaguesService.getColleagueCount() || id < 0){
            throw new NotFoundException("Not found: " + id);
        }
        return colleaguesService.getColleagueByNum(id);

    }


    @ExceptionHandler
    public ResponseEntity<ResponseModel> handleException(NotFoundException e){
        ResponseModel error = new ResponseModel();
        error.setStatusCode(HttpStatus.NOT_FOUND.value());
        error.setMessage(e.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
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
