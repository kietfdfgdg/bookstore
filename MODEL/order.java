package MODEL;

public class order {
 private int ORD_ID;

 private int ID_PD;
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
  public order(int ord_id,int id_pd,int amount,double toltal) {
		super();
		ORD_ID = ord_id;
	
		ID_PD = id_pd;
		AMOUNT = amount;
		TOLTAL = toltal;
 }
	public order() {
		super();
	}
}
