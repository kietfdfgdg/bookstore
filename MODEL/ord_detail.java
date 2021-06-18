package MODEL;

public class ord_detail {
	private int ORD_ID;
	private int ID_PD;
	private int MB_ID;
	private int AMOUNT;
	private double TOLTAL;
	 public int Get_ord_id() {
		  return ORD_ID;
	  }
	  public void Set_ord_id(int id) {
		  ORD_ID = id;
	  }
	  public int Get_id_pd() {
		  return ID_PD;
	  }
	  public void Set_id_pd(int id_pd) {
		  ID_PD =id_pd;
	  }
	  public int Get_mb_id() {
		  return MB_ID;
	  }
	  public void Set_mb_id(int mb_id) {
		  MB_ID = mb_id;
	  }
	  public int Get_amount() {
		  return AMOUNT;
	  }
	  public void Set_amount(int amount) {
		  AMOUNT = amount;
	  }
	  public double Get_total() {
		  return TOLTAL;
	  }
	  public void Set_toltal(double total) {
		  TOLTAL = total;
	  }
	  public ord_detail(int ord_id,int id_pd,int amount,int mb_id,double toltal) {
			super();
			ORD_ID = ord_id;
			ID_PD = id_pd;
			AMOUNT = amount;
			TOLTAL = toltal;
			MB_ID = mb_id;
	 }
		public ord_detail() {
			super();
		}
}
