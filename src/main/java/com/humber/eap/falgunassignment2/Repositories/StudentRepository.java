package com.humber.eap.falgunassignment2.Repositories;

import com.humber.eap.falgunassignment2.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
