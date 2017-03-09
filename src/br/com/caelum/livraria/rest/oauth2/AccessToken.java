package br.com.caelum.livraria.rest.oauth2;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class AccessToken implements Serializable {

	private static final long serialVersionUID = -8292048761607101832L;
	
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isPreenchido() {
		return token != null;
	}

}
