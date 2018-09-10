package modelo;

public abstract class Kryptoniano extends Animal
{
	protected int edad;
	protected String nombre;
	
	public Kryptoniano()
	{
		this.edad = 0;
		this.nombre = "";
	}
	
	public abstract void configurarPersonaje();
}
