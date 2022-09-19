package pac;

public class Data {

	String name;
	int price;
	String img;

	public Data() {
	}
    
	public Data(String name, int price, String img) {
		this.name = name;
		this.price = price;
		this.img = img;
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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
}
