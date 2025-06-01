package com.pps.common.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Payment canonical to hold payment info and audit info.
 * @author shashankS
 *
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@JacksonXmlRootElement
public class PaymentCanonical implements Serializable {

	/**
	 * Default serial Version UID
	 */
	private static final long serialVersionUID = 1L;
	
	private PaymentInfo paymentInfo;
	private List<PaymentAudit> paymentAudits;
}
