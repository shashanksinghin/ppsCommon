package com.pps.common.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Currency;

import org.junit.jupiter.api.Test;

import com.pps.common.enums.PaymentStatus;

class PaymentCanonicalTest {

	@Test
	void test() {
		
		PaymentInfo paymentInfo = PaymentInfo.builder().isoCurrency(Currency.getInstance("INR")).payerName("John Doe").payerName("John Self").build();
		PaymentCanonical paymentCanonical = PaymentCanonical.builder().paymentInfo(paymentInfo).build();
		
		paymentCanonical.setPaymentAudits(new ArrayList<>());
		
		paymentCanonical.getPaymentAudits().add(new PaymentAudit(PaymentStatus.WIP, "FCS001", "FCS_Approval", LocalDateTime.now(), "INIT"));
		
		assertNotNull(paymentCanonical.getPaymentInfo());
	}

}
