package lviv.lgs.ua.annotation;

public class Clothes {

	@ClothesForEveryday("great type")
	private String type;
	@ClothesForEveryday("wow you are skinny")
	private int size;
	@ClothesForEveryday("it's not expensive")
	private int price;
	private String brand;

	public Clothes(String type, int size, int price, String brand) {
		super();
		this.type = type;
		this.size = size;
		this.price = price;
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Clothes [type=" + type + ", size=" + size + ", price=" + price + ", brand=" + brand + "]";
	}

}
