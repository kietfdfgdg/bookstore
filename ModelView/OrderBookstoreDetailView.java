package ModelView;

public class OrderBookstoreDetailView {
	private int ORD_ID;
	private int ID_PD;
	private String OrderNumber;
	private String NAME_PD;
	private double PRICE;
	private int AMOUNT;
	public int Get_ord_id() {
		return ORD_ID;
	}
	public void Set_ord_id(int IdOrder) {
		ORD_ID = IdOrder;
	}
	public int GetIdProduct() {
		return ID_PD;
	}
	public void SetIdProduct(int IdPro) {
		ID_PD = IdPro;
	}
	public String GetOrderNumber() {
		return OrderNumber;
	}
	public void SetOrderNumber(String ord_number) {
		OrderNumber = ord_number;
				
	}
	public String Get_name_pd() {
		return NAME_PD;
	}

	public void Set_Name_Pd(String NameProduct) {
		NAME_PD = NameProduct;
	}
	public double Get_price() {
		return PRICE;
	}

	public void Set_price(double price) {
		PRICE = price;
	}
	public int Get_Amount() {
		return AMOUNT;
	}

	public void Set_Amount(int amount) {
		AMOUNT = amount;
	}
	public OrderBookstoreDetailView(int idOrder,int idPro,String orderNumber,String NamePro,double price,int Amount) {
		// TODO Auto-generated constructor stub
		ORD_ID = idOrder;
		ID_PD = idPro;
		this.OrderNumber = orderNumber;
		NAME_PD = NamePro;
		PRICE = price;
		AMOUNT = Amount;
		
	}
	

	public  OrderBookstoreDetailView(){
		super();
	}


	
	
}
