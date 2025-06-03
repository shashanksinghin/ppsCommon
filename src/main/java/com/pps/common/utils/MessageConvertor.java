package com.pps.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.pps.common.model.PaymentCanonical;
import com.pps.common.model.PaymentProcessingEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageConvertor {

	public static String covertPojoToXml(PaymentCanonical paymentCanonical) {
		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.findAndRegisterModules();
		xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
		String xml = null;
		try {
			xml = xmlMapper.writeValueAsString(paymentCanonical);
		} catch (JsonProcessingException e) {
			log.error("Excpetion occured.", e);
		}

		return xml;
	}

	public static PaymentCanonical covertXmlToPojo(String paymentCanonicalXml) {
		XmlMapper xmlMapper = new XmlMapper();
		
		xmlMapper.findAndRegisterModules();
		
		PaymentCanonical paymentCanonical = null;
		try {
			paymentCanonical = xmlMapper.readValue(paymentCanonicalXml, PaymentCanonical.class);
		} catch (JsonMappingException e) {
			log.error("Excpetion occured.", e);
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			log.error("Excpetion occured.", e);
			e.printStackTrace();
		}
		return paymentCanonical;
	}

	public static String covertPojToJson(PaymentCanonical paymentCanonical) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

		String json = null;
		try {
			json = objectMapper.writeValueAsString(paymentCanonical);
		} catch (JsonProcessingException e) {
			log.error("Excpetion occured.", e);
		}

		return json;
	}
	
	public static String covertPojToJson(PaymentProcessingEvent paymentProcessingEvent) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());
		
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

		String json = null;
		try {
			json = objectMapper.writeValueAsString(paymentProcessingEvent);
		} catch (JsonProcessingException e) {
			log.error("Excpetion occured.", e);
		}

		return json;
	}

	public static PaymentCanonical covertJsonToPaymentCanonicalPojo(String paymentCanonicalJson) {
		ObjectMapper objectMapper = new ObjectMapper();
		PaymentCanonical paymentCanonical = null;

		objectMapper.findAndRegisterModules();
		
		try {
			paymentCanonical = objectMapper.readValue(paymentCanonicalJson, PaymentCanonical.class);
		} catch (JsonMappingException e) {
			log.error("Excpetion occured.", e);
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			log.error("Excpetion occured.", e);
			e.printStackTrace();
		}

		return paymentCanonical;
	}
	
	public static PaymentProcessingEvent covertJsonToPaymentProcessingEventPojo(String paymentCanonicalJson) {
		ObjectMapper objectMapper = new ObjectMapper();
		PaymentProcessingEvent paymentProcessingEvent = null;

		objectMapper.findAndRegisterModules();
		
		try {
			paymentProcessingEvent = objectMapper.readValue(paymentCanonicalJson, PaymentProcessingEvent.class);
		} catch (JsonMappingException e) {
			log.error("Excpetion occured.", e);
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			log.error("Excpetion occured.", e);
			e.printStackTrace();
		}

		return paymentProcessingEvent;
	}

}
