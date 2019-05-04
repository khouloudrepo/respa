package tn.isg.pfe.config;

import java.util.List;

public class AuthToken {

	private String token;
	private List<String> role;

	public AuthToken(String token, List<String> role) {
		this.token = token;
		this.role = role;
	}

	public List<String> getRole() {
		return role;
	}

	public void setRole(List<String> role) {
		this.role = role;
	}

	public AuthToken() {

	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}