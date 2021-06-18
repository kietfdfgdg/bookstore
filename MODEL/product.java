package MODEL;

public class product {
	private int ID_PD;
	private String NAME_PD;
	private String img;
	private double PRICE;
	private int ID_AUTHOR;
	private int ID_CATE;
	private String INFORMATION;
	
	public int Get_id_pd() {
		return ID_PD;
	}
	public void Set_id_pd(int id) {
		ID_PD = id;
	}
	public String Get_name_pd() {
		return NAME_PD;
	}
	public void Set_Name_Pd(String name) {
		NAME_PD = name;
	}
	public String Get_img() {
		return img;
	}
	public void  Set_img(String img) {
		this.img = img;
	}
	public double Get_price() {
		return PRICE;
	}
	public void Set_price(double price) {
		PRICE = price;
	}
	public int Get_id_author() {
		return ID_AUTHOR;
	}
	public void Set_id_author(int id) {
		ID_AUTHOR = id;
	}
	public int Get_cate_id() {
		return ID_CATE;
	}
	public void Set_cate_id(int id) {
		ID_CATE = id;
	}
	public String Get_infomation() {
		return INFORMATION;
	}
	public void Set_infomation(String infomation) {
		INFORMATION = infomation;
	}
	public product(int id,String name,String img,double price,int id_author,int id_cate,String info) {
		super();
		ID_PD = id;
		NAME_PD = name;
		this.img = img;
		PRICE = price;
		ID_AUTHOR = id_author;
		ID_CATE = id_cate;
		INFORMATION = info;
	
	}
	public product() {
		super();
	
	}
	
}
