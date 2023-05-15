package bean;

public class Account {
private String name;
private String passwords;

public Account() {
}

public Account(String name, String passwords) {
	//super();
	this.name = name;
	this.passwords = passwords;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPasswords() {
	return passwords;
}

public void setPasswords(String passwords) {
	this.passwords = passwords;
}

@Override
public String toString() {
	return "Account [name=" + name + ", passwords=" + passwords + "]";
}


}
