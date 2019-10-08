import javax.swing.JLabel;

public abstract class GameObject {
	
	protected int vida;
	protected Punto ubicacion;
	protected JLabel dibujo;
	protected int ancho;
	protected int largo;
	protected Visitor v;
	protected Mapa mapa;
	protected int rango;
	
	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}
	
	public int getRango() {
		return rango;
	}
	public void setRango(int rango) {
		this.rango = rango;
	}
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public Punto getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Punto punto) {
		this.ubicacion = punto;
	}
	public JLabel getDibujo() {
		return dibujo;
	}
	public void setDibujo(JLabel dibujo) {
		this.dibujo = dibujo;
	}
	public int getAncho() {
		return ancho;
	}
	
	public int getLargo() {
		return largo;
	}	
	
	public abstract void accept(Visitor v);
	
	public abstract void atacar(GameObject obj); // no se si está bien	

	public abstract void interactuar();

	public Visitor getVisitor() {
		return v;
	}
	
	public void morir() {
		mapa.getListaEliminar().add(this);
	}
}
