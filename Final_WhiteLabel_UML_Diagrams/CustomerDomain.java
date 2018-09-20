package com.es.social.sendGrid.api;

public class CustomerDomain {
	/**
	 * Represent sender UserName
	 */
	private String username;

	/**
	 * Represent Sender domain
	 */
	private String domain;

	/**
	 * Represent Sender subdomain
	 */
	private String subdomain;

	/**
	 * Represent sender emailsubdomain
	 */
	private String emailsubdomain;

	/**
	 * Represent sender emailsubdomainurl
	 */
	private String emailsubdomainurl;

	/**
	 * Represent sender linksubdomain
	 */
	private String linksubdomain;

	/**
	 * Represent sender linksubdomainurl
	 */
	private String linksubdomainurl;

	/**
	 * Represent default domain
	 */
	private boolean defaultdomain;

	/**
	 * Represent sender type
	 */
	private String type = "Email";

	/**
	 * Represent sender verify
	 */
	private boolean verify = false;;

	/**
	 * Represent sender ips address
	 */
	private String[] ips;

	/**
	 * Represent sender email
	 */
	private String email;

	/**
	 * Represent sender domainId
	 */
	private Integer domainid;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public String getEmailsubdomain() {
		return emailsubdomain;
	}

	public void setEmailsubdomain(String emailsubdomain) {
		this.emailsubdomain = emailsubdomain;
	}

	public String getEmailsubdomainurl() {
		return emailsubdomainurl;
	}

	public void setEmailsubdomainurl(String emailsubdomainurl) {
		this.emailsubdomainurl = emailsubdomainurl;
	}

	public String getLinksubdomain() {
		return linksubdomain;
	}

	public void setLinksubdomain(String linksubdomain) {
		this.linksubdomain = linksubdomain;
	}

	public String getLinksubdomainurl() {
		return linksubdomainurl;
	}

	public void setLinksubdomainurl(String linksubdomainurl) {
		this.linksubdomainurl = linksubdomainurl;
	}

	public boolean isDefaultdomain() {
		return defaultdomain;
	}

	public void setDefaultdomain(boolean defaultdomain) {
		this.defaultdomain = defaultdomain;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isVerify() {
		return verify;
	}

	public void setVerify(boolean verify) {
		this.verify = verify;
	}

	public String[] getIps() {
		return ips;
	}

	public void setIps(String[] ips) {
		this.ips = ips;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CustomerDomain() {
		super();
	}
}
