package com.juaracoding.magangmerchant.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String userName;
	
	@Value("${password}")
	private String password;
	
	@Value("${displayname}")
	private String displayName;

	@Value("${searchmd}")
	private String searchMD;
	
	@Value("${searchms}")
	private String searchMS;
	
	@Value("${pilihms}")
	private String pilihMS;
	
	@Value("${searchwl}")
	private String searchWl;
	
	@Value("${searchqr}")
	private String searchQR;
	
	@Value("${searchjo}")
	private String searchJO;
	
	@Value("${searchrec}")
	private String searchRec;
	
	@Value("${tanggalawal}")
	private String tanggalawal;
	
	@Value("${tanggalakhir}")
	private String tanggalakhir;

	public String getTanggalawal() {
		return tanggalawal;
	}


	public String getTanggalakhir() {
		return tanggalakhir;
	}
	
	public String getSearchReceived() {
		return searchRec;
	}
	
	public String getSearchJO() {
		return searchJO;
	}
	
	public String getSearchQR() {
		return searchQR;
	}
	
	public String getSearchWl() {
		return searchWl;
	}
	
	public String getSearchMS() {
		return searchMS;
	}
	
	public String getPilihMS() {
		return pilihMS;
	}
	
	public String getSearchMD() {
		return searchMD;
	}
	
	public String getBrowser() {
		return browser;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getDisplayName() {
		return displayName;
	}
}
