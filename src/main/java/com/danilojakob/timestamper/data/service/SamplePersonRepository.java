package com.danilojakob.timestamper.data.service;

import com.danilojakob.timestamper.data.entity.SamplePerson;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, Integer> {

}