package MODEL;

public class boss {
	private String USER;
	private String PWD;
	public String Get_user() {
		return USER;
	}
	public void Set_user(String user) {
		USER = user;
	}
	public String Get_pwd() {
		return PWD;
	}
	public void Set_pwd(String pwd) {
		PWD = pwd;
	}
	 public boss(String user,String pwd) {
			super();
			USER = user;
			PWD = pwd;
	 }
		public boss() {
			super();
		}
}
