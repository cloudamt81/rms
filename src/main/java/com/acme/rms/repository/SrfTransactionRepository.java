package com.acme.rms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acme.rms.models.SrfTransaction;

@Repository
public interface SrfTransactionRepository extends JpaRepository<SrfTransaction, Long> {

}
