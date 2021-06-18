package MODEL;

public class member {
private int MB_ID;
private String NAME;
private String ADDRESS;
private String PHONE_NUMBER;
private String USERNAME;
private String PWD;

public int Get_mb_id() {
	return MB_ID;
}
public void Set_mb_id(int id) {
	MB_ID = id;
}
public String Get_name() {
	return NAME;
}
public void Set_name(String name) {
	NAME = name;
}
public String Get_ADDRESS() {
	return ADDRESS;
}
public void Set_ADDRESS(String address) {
	ADDRESS = address;
}
public String Get_PHONE_NUMBER() {
	return PHONE_NUMBER;
}
public void Set_PHONE_NUMBER(String phone_number) {
	PHONE_NUMBER = phone_number;
}
public String Get_USER_NAME() {
	return USERNAME;
}
public void Set_USER_NAME(String user_name) {
	USERNAME = user_name;
}
public String Get_PWD() {
	return PWD;
}
public void Set_PWD(String pwd) {
	PWD = pwd;
}
public member(int id_mb,String name,String address,String phone_number,String username,String pwd) {
	super();
	MB_ID = id_mb;
	NAME = name;
	ADDRESS = address;
	PHONE_NUMBER =phone_number;
	USERNAME = username;
	PWD = pwd;
}
public member() {
	super();
}
}
