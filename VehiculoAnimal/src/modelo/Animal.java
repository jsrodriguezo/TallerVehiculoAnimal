package modelo;

public abstract class Animal 
{
	protected String tipoComida;
	
	public Animal()
	{
		this.tipoComida = "";
	}
	public abstract void comer();
	public abstract void configurarComida();
}
