package colaborativo;

public class Mueble {
	private String material;
	private int anyos;
	
	public Mueble(String material, int anyos) {
		super();
		this.material = material;
		this.anyos = anyos;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getAnyos() {
		return anyos;
	}
	public void setAnyos(int anyos) {
		this.anyos = anyos;
	}
	@Override
	public String toString() {
		return "Mueble [material=" + material + ", anyos=" + anyos + "]";
	}
	
	
}
