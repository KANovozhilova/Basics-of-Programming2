package com.geekbrains;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo sr;

    public void save(Map<String, String> params) {
        Student student = new Student();
        student.setId(null);
        student.setFirstName(params.get("first_name"));
        student.setLastName(params.get("last_name"));
        student.setAge(Integer.valueOf(params.get("age")));
        sr.save(student);
    }

    public void deleteById(Long id) {
        sr.deleteById(id);
    }

    public List<Student> findAll() {
        return sr.findAll();
    }
}
