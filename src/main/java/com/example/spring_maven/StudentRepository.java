package com.example.spring_maven;


import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer, Student> db=new HashMap<>();

    public Student getStudent(int id){
        return db.get(id);
    }

    public String addStudent( Student student){
        int admitnNo = student.getAdmitnNo();
        db.put(admitnNo, student);
        return "Student added Successfully";
    }

    public String deleteStudent(int id){
        if(!db.containsKey(id)){
            return "invalid id";
        }
        db.remove(id);
        return "deleted successfuly";
    }

    public String updateStudent(int id, int age){
        if(!db.containsKey(id)){
            return null;
        }
        db.get(id).setAge(age);
        return "updated successfuly";
    }
}
