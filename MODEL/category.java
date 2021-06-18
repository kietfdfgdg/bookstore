package MODEL;

public class category {
	private int ID_CATE;
	private String NAME_CATE;
	public int Get_ID_CATE() {
	return ID_CATE;
}
	public void Set_ID_CATE(int id) {
		ID_CATE = id;
	}
	public String Get_NAME_CATE() {
		return NAME_CATE;
	}
	public void Set_NAME_CATE(String cate_name) {
		NAME_CATE = cate_name;
	}
	public category(int id,String cate_name) {
		super();
		ID_CATE = id;
		NAME_CATE = cate_name;
	}
	public category() {
		super();
	}
}
