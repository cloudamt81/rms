package com.acme.rms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acme.rms.models.Srf;

@Repository
public interface SrfRepository extends JpaRepository<Srf, Long> {

}
