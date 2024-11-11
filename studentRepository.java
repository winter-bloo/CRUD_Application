package com;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student, Long> {

    Student save(Student student);

    Optional<Student> findById(long id);

    void deleteById(long id);
    
}
