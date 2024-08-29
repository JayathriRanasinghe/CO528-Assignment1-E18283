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
        Optional<Student> studentRecordOptional = studentDao.findById(id);

        if (studentRecordOptional.isPresent()) {
            Student studentRecord = studentRecordOptional.get();
            studentRecord.setFirstName(updatedRecord.getFirstName());
            studentRecord.setLastName(updatedRecord.getLastName());
            studentRecord.setStartDate(updatedRecord.getStartDate());
            studentRecord.setEmail(updatedRecord.getEmail());
            studentRecord.setContactNumber(updatedRecord.getContactNumber());

            // Update the existing record
            studentDao.save(studentRecord);
            return "Student record updated successfully";
        } else {
            return "Student record with ID " + id + " not found.";
        }
    }

    public String deleteStudentRecord(Integer id) {
        Student deleteStudentRecord = studentDao.findById(id).get();
        studentDao.delete(deleteStudentRecord);
        return "Student record deleted successfully";
    }
}