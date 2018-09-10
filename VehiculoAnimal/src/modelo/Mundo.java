package modelo;

public class Mundo
{
	private Helicoptero heli;
	private HidroAvion hidro;
	private Pajaro paja;
	private Superman men;
	
	public Mundo()
	{
		heli = new Helicoptero();
		hidro = new HidroAvion();
		paja = new Pajaro();
		men = new Superman();
	}

	public Helicoptero getHeli() 
	{
		return heli;
	}

	public void setHeli(Helicoptero heli)
	{
		this.heli = heli;
	}

	public HidroAvion getHidro() 
	{
		return hidro;
	}

	public void setHidro(HidroAvion hidro) 
	{
		this.hidro = hidro;
	}

	public Pajaro getPaja()
	{
		return paja;
	}

	public void setPaja(Pajaro paja)
	{
		this.paja = paja;
	}

	public Superman getMen()
	{
		return men;
	}

	public void setMen(Superman men)
	{
		this.men = men;
	}
	
	
}
