package MODEL;

public class author {
	private int ID_AUTHOR;
	private String NAME;
	public int GET_Id_Author() {
		return ID_AUTHOR;
	}
	public void Set_Id_Author(int id) {
		ID_AUTHOR = id;
	}
	public String Get_Name() {
	return NAME;
	}
	public void  Set_name(String name) {
		NAME = name;
	}
	public author(int id,String name) {
		super();
		ID_AUTHOR = id;
		NAME = name;
	}
	public author() {
		super();
	}
}