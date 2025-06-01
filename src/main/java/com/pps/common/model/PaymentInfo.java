package com.pps.common.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A class to hold the payment information.
 * @author Shashank
 *
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PaymentInfo implements Serializable {

	/**
	 * Default serial Version UID
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private UUID transactionId;
	
	@NotBlank
	private String payerName;
	
	@NotBlank
	private String payerBank;
	
	@NotBlank
	private String payerCountryCode;
	
	@NotBlank
	private String payerAccountCode;

	@NotBlank
	private String payeeName;
	
	@NotBlank
	private String payeeBank;
	
	@NotBlank
	private String payeeCountryCode;
	
	@NotBlank
	private String payeeAccountCode;

	@NotBlank
	private String paymentInstruction;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate executionDate;
	
	@NotNull
	private BigDecimal amount;

	@NotNull
	private Currency isoCurrency;

	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime creationTimestamp;
}
