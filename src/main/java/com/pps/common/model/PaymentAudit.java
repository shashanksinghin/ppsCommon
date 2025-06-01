package com.pps.common.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pps.common.enums.PaymentStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A class to hold the payment audit information.
 * 
 * @author shashank
 *
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class PaymentAudit implements Serializable {
	/**
	 * Default serial Version UID
	 */
	private static final long serialVersionUID = 1L;

	private PaymentStatus paymentStatus;
	private String statusCode;
	private String statusDesc;

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime statusDateTime;

	private String PaymentOperation;
}
