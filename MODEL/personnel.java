package MODEL;

public class personnel {
	private int ID;
	private String NAME;
	private String POSITION;
	private String USER_NAME;
	private String PWD;
	public int Get_psn_id() {
		return ID;
	}
	public void Set_psn_id(int id) {
		ID = id;
	}
	public String Get_name() {
		return NAME;
	}
	public void Set_name(String name) {
		NAME = name;
	}
	public String Get_POSITION() {
		return POSITION;
	}
	public void Set_posion(String position) {
		POSITION = position;
	}
	public String Get_username() {
		return USER_NAME;
	}
	public void Set_username(String user_name) {
		USER_NAME = user_name;
	}
	public String Get_pwd() {
		return PWD;
	}
	public void Set_pwd(String pwd) {
		PWD = pwd;
	}
	 public personnel(int id,String name,String position,String user_name,String pwd) {
			super();
			ID = id;
			NAME= name;
			POSITION = position;
			USER_NAME = user_name;
			PWD = pwd;
	 }
		public personnel() {
			super();
		}
}
