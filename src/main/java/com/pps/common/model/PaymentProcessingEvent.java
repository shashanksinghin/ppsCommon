package com.pps.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentProcessingEvent {
	private String eventType;
	private PaymentCanonical paymentCanonical;
}
