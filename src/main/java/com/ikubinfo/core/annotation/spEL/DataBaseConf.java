package com.ikubinfo.core.annotation.spEL;

import org.springframework.stereotype.Component;

@Component
public class DataBaseConf {

	private String url = "localhost:8080:embededDb";

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
