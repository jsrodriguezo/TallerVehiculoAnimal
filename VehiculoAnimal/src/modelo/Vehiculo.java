package modelo;

public abstract class Vehiculo 
{
	protected String tipoVehiculo;
	protected String motor;
	protected int llantas;
	
	public Vehiculo()
	{
		this.motor = "";
		this.tipoVehiculo = "";
		this.llantas = 0;
	}
	
	public abstract void configurarVehiculo();
	
}
