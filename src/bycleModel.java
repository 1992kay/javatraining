
/**
 * 
 * @author thinkpad
 * �������г�����ģ��
 */
public class bycleModel {

	//Ʒ��
	private String tradeMark;
	//�۸�
	private float price;
	//ȡ����ַ
	private String obtainAdd;
	public bycleModel(String tradeMark, float price, String obtainAdd) {
		super();
		this.tradeMark = tradeMark;
		this.price = price;
		this.obtainAdd = obtainAdd;
	}
	public bycleModel() {
		super();
	}
	public String getTradeMark() {
		return tradeMark;
	}
	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getObtainAdd() {
		return obtainAdd;
	}
	public void setObtainAdd(String obtainAdd) {
		this.obtainAdd = obtainAdd;
	}
	@Override
	public String toString() {
		return "bycleModel [tradeMark=" + tradeMark + ", price=" + price + ", obtainAdd=" + obtainAdd + "]";
	}
	
}
