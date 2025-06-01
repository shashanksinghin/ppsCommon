package com.pps.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Currency;

import org.junit.jupiter.api.Test;

class PaymentInfoTest {
	
	PaymentInfo paymentInfo = PaymentInfo.builder().isoCurrency(Currency.getInstance("INR")).payerName("John Doe").payerName("John Self").build();

	@Test
	void testISOCurrency() {
		assertEquals(paymentInfo.getIsoCurrency(), Currency.getInstance("INR"));
	}
	
	@Test
	void testISOCurrencyNot() {
		assertNotEquals(paymentInfo.getIsoCurrency(), Currency.getInstance("USD"));
	}

}
