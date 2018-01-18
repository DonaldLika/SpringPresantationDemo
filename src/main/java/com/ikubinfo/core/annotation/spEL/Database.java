package com.ikubinfo.core.annotation.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Database {

	@Value("#{dataBaseConf.url}")
	private String url;

	@Value("${url.test.test}")
	private String propertieUrl;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPropertieUrl() {
		return propertieUrl;
	}

	public void setPropertieUrl(String propertieUrl) {
		this.propertieUrl = propertieUrl;
	}

	@Override
	public String toString() {
		return "Database [url=" + url + ", propertieUrl=" + propertieUrl + "]";
	}

}
