package huijingyuan.community.goods.model;

public class GoodModel {
	private int id_good;
	private int id_base;
	private String name;
	private int price;
	private String des;
	private int weight;
	public int getId_good() {
		return id_good;
	}
	public void setId_good(int id_good) {
		this.id_good = id_good;
	}
	public int getId_base() {
		return id_base;
	}
	public void setId_base(int id_base) {
		this.id_base = id_base;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "GoodModel [id_good=" + id_good + ", id_base=" + id_base + ", name=" + name + ", price=" + price
				+ ", des=" + des + ", weight=" + weight + "]";
	}
	
	
}
