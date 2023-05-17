package bean;

public class Email {
private String prefix;
private String domain;

public Email() {
}

public Email(String prefix, String domain) {
	super();
	this.prefix = prefix;
	this.domain = domain;
}

public String getPrefix() {
	return prefix;
}

public void setPrefix(String prefix) {
	this.prefix = prefix;
}

public String getDomain() {
	return domain;
}

public void setDomain(String domain) {
	this.domain = domain;
}

@Override
public String toString() {
	return "Email =" + prefix + "@" + domain;
}


}
