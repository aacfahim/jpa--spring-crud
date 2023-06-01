package com.aacfahim.JPACRUD.controller;

import com.aacfahim.JPACRUD.model.ResponseModel;
import com.aacfahim.JPACRUD.model.StudentEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pojo")
public class StudentController {

    @GetMapping()
    public List<StudentEntity> getAllStudent(){

        List<StudentEntity> list = new ArrayList<>();
        list.add(new StudentEntity("Ashfaq", "Afzal"));
        list.add(new StudentEntity("Sheikh", "Deep"));
        list.add(new StudentEntity("Tuhin", "Chowdhury"));
        list.add(new StudentEntity("Ahsanul", "Haque"));
        list.add(new StudentEntity("Hasna", "Hena"));
        list.add(new StudentEntity("Sreemoye", "Chakrabarti"));

        return list;

    }







}
