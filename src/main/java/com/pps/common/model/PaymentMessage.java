package com.pps.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMessage {
	private String transactionId;
	private PaymentCanonical paymentCanonical;
	private String status;
}
