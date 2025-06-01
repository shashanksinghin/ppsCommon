package com.pps.common.enums;

import lombok.Getter;
import lombok.ToString;

/**
 * The paymentStatus. Below are possible status
 * WIP, SUCESSFUL and FAILED
 * @author Shashank
 *
 */
@Getter
@ToString
public enum PaymentStatus {

	WIP("WIP"), SUCESSFUL("SUCESSFUL"), FAILED("FAILED");

	private String paymentStatus;

	PaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
}
