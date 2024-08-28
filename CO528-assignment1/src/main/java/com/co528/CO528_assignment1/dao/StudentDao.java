package com.co528.CO528_assignment1.dao;

import com.co528.CO528_assignment1.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
//    List<Student> findByIsBoardMember(Integer isBoardMember);
}