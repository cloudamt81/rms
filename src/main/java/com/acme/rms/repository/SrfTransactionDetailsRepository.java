package com.acme.rms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acme.rms.models.SrfTransactionDetails;

@Repository
public interface SrfTransactionDetailsRepository extends JpaRepository<SrfTransactionDetails, Long> {

}
