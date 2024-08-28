package com.co528.CO528_assignment1.service;

import com.co528.CO528_assignment1.Student;
import com.co528.CO528_assignment1.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public List<Student> getAllStudents() {

        return studentDao.findAll();

    }

    public Optional<Student> getStudentByID(Integer id) {
        return studentDao.findById(id);
    }

    public String addStudent(Student student) {
        studentDao.save(student);
        return "Success!";
    }

    public String updateStudentRecord(Integer id, Student updatedRecord) {
        Student studentRecord = studentDao.findById(id).get();
        studentRecord.setFirstName(updatedRecord.getFirstName());
        studentRecord.setLastName(updatedRecord.getLastName());
        studentRecord.setStartDate(updatedRecord.getStartDate());
        studentRecord.setEmail(updatedRecord.getEmail());
        studentRecord.setContactNumber(updatedRecord.getContactNumber());
        studentDao.save(updatedRecord);
        return "Student record updated successfully";
    }

    public String deleteStudentRecord(Integer id) {
        Student deleteStudentRecord = studentDao.findById(id).get();
        studentDao.delete(deleteStudentRecord);
        return "Student record deleted successfully";
    }
}