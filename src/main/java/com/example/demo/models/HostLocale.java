package com.example.demo.models;

import java.util.Locale;
import java.util.Locale.Builder;

public class HostLocale {
	// Defined by ISO 3166
	private final String COUNTRY_SHORT_NAME = "SPAIN";
	private final String COUNTRY_FULL_NAME = "the Kingdom of Spain";
	private final String COUNTRY_ALPHA_2 = "ES";
	private final String COUNTRY_ALPHA_3 = "ESP";
	private final int COUNTRY_NUM_CODE = 724;
	private final String LOCAL_SHORT_NAME = "España";
	private final String LANG_ALPHA_2 = "es"; // defined by ISO 639-1
	private final String LANG_ALPHA_3 = "spa"; //defined by ISO 639-2
	private final String LANG_NAME = "Spanish"; //this is not official standardized
	//private final String REGION = "RIPENCC";
	private final String LANG = "Spañol"; // defined by IANA
	private final String SCRIPT = "Latn"; // defined by IANA
	private Locale localeOfHost;
	

	public HostLocale() {
		
	}
	
	public void setLocaleHost() {
		Locale.Builder localeBuilder = new Builder();
		localeBuilder.setLanguage(COUNTRY_ALPHA_2); // When a language has both an alpha-2 code and an alpha-3 code, the alpha-2 code must be used.
		localeBuilder.setRegion(COUNTRY_ALPHA_2); // ISO 3166 alpha-2 country code or UN M.49 numeric-3 area code.
		localeBuilder.setScript(SCRIPT);
		this.localeOfHost = localeBuilder.build();
	}
	
	public Locale getLocaleHost() {
		return this.localeOfHost;
	}
	
	
	
	

}
