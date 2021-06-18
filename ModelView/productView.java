package ModelView;

public class productView {
	private int ID_PD;
	private String NAME_PD;
	private int ID_AUTHOR;
	private String NAME;
	private double PRICE;
	private int CATE_ID;
	private String NAME_CATE;
	private String INFORMATION;
	
	public int GetIdPd() {
		return ID_PD;
	}
	public void SetIdPd(int id) {
		ID_PD = id;
	}
	public String GetNamePro() {
		return NAME_PD;
	}
	public void SetNamePro(String pd_name) {
		NAME_PD = pd_name;
	}
	public int GetIdAuthor() {
		return ID_AUTHOR;
	}
	public void SetIdAuthor(int id_author) {
		ID_AUTHOR = id_author;
	}
	public String GetNameAuthor() {
		return NAME;
	}
	public void SetNameAthor(String NameAuthor) {
		NAME = NameAuthor;
	}
	public double GetPrice() {
		return PRICE;
	}
	public void SetPrice(double price) {
		PRICE = price;
	}
	public int GetCateId() {
		return CATE_ID;
	}
	public void SetCateId(int cate_id) {
		CATE_ID = cate_id;
	}
	public String GetNameCate() {
		return NAME_CATE;
	}
	public void SetNameCate(String name_cate) {
		NAME_CATE = name_cate;
	}
	public String GetInfo() {
		return INFORMATION;
	}
	public void SetInfo(String info) {
		INFORMATION = info;
	}
	public productView(int id,String NamePro,int authorId,String authorName,double price,int cate_id,String CateName,String info) {
		super();
		ID_PD = id;
		NAME_PD = NamePro;
		ID_AUTHOR= authorId;
		NAME = authorName;
		PRICE = price;
		CATE_ID = cate_id;
		NAME_CATE = CateName;
		INFORMATION = info;
	}
	public productView() {
		super();
	}
}
