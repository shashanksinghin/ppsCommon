package com.pps.common.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.pps.common.enums.PaymentStatus;

class PaymentStatusTest {

	@Test
	void testISOCurrencyEquals() {
		PaymentStatus isoCurrency = PaymentStatus.SUCESSFUL;
		assertEquals(isoCurrency, PaymentStatus.SUCESSFUL);
	}

	@Test
	void testISOCurrencyNotEquals() {
		PaymentStatus isoCurrency = PaymentStatus.SUCESSFUL;
		assertNotEquals(isoCurrency, PaymentStatus.FAILED);
	}

	@Test
	void testISOCurrencyValueOfEquals() {
		PaymentStatus isoCurrency = PaymentStatus.valueOf("SUCESSFUL");
		assertEquals(isoCurrency, PaymentStatus.SUCESSFUL);
	}

	@Test
	void testISOCurrencyValueOfNotEquals() {
		PaymentStatus isoCurrency = PaymentStatus.valueOf("SUCESSFUL");
		assertNotEquals(isoCurrency, PaymentStatus.FAILED);
	}

	@Test
	void testISOCurrencyAllValuesEquals() {
		for (PaymentStatus isoCurrency : PaymentStatus.values()) {
			assertEquals(isoCurrency.name(), isoCurrency.getPaymentStatus());
		}
	}

}
