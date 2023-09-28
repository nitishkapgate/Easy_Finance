package com.cjc.ef.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.ef.registration.model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer>
{

}
