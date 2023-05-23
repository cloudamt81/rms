package com.acme.rms.security.services;

import org.springframework.stereotype.Service;

import com.acme.rms.models.SrfTransactionDetails;

@Service
public class SrfTransactionDetailsService {

	public String saveTransaction(SrfTransactionDetails srfTrxn) {
		return srfTrxn.getSrfTransId();

	};

	public String editTransaction(SrfTransactionDetails srfTrxn) {
		return srfTrxn.getSrfTransId();

	};

}
