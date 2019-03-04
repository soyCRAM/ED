
public class emple {

		// Variables para la clase.
		private int ID;
		private String nombre;
		private String app;
		private String direccion;
		private int tlf;
	
	public emple (int ID,String nombre,String app,String direccion,int tlf){
		this.ID = ID;
		this.nombre = nombre;
		this.app = app;
		this.direccion = direccion;
		this.tlf = tlf;
	}
	
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTlf() {
		return tlf;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}
		

}
