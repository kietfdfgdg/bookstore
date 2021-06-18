package ModelView;

import java.util.Date;

public class orderBookstoreView {
	 private int ORD_ID;
	 private String OrderNumber;
	 private Date DayCreate;
	 private double TOLTAL;
	 private int MB_ID;
	 private String NAME;
	 public int GetOrderId() {
		 return ORD_ID;
	 }
	 public void SetOrdId(int id) {
		 ORD_ID = id;
	 }
	 public String GetOderNumber() {
		 return OrderNumber;
	 }
	 public void SetOderNumber(String OrdNumber) {
		 OrderNumber = OrdNumber;
	 }
	 public Date GetDayCreate() {
		 return DayCreate;
	 }
	 public void SetDayCreate(Date DateCreate) {
		 this.DayCreate = DateCreate;
	 }
	 public double GetTolTal() {
		 return TOLTAL;
	 }
	 public void SetTolTal(double toltal) {
		 TOLTAL = toltal;
	 }
	 public int GetMB_ID() {
		 return MB_ID;
	 }
	 public void SetMbId(int id_mb) {
		 MB_ID = id_mb;
	 }
	 public String GetName() {
		 return NAME;
	 }
	 public void SetName(String name) {
		 NAME = name;
	 }
	 public orderBookstoreView(int id,String ordNumber,Date Daycreate,double toltal,int id_mb,String mb_name) {
		 super();
		 ORD_ID = id;
		 OrderNumber = ordNumber;
		 this.DayCreate = Daycreate;
		 TOLTAL = toltal;
		 MB_ID = id_mb;
		 NAME = mb_name;
	 }
	 public orderBookstoreView() {
		 super();
	 }
}
