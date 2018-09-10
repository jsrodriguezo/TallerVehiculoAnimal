package modelo;

import javax.swing.JOptionPane;

public class Superman extends Kryptoniano implements Volador
{

	@Override
	public void despegar() 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Yo " + super.nombre + " con " + super.edad + " acabo de volar desde un edificio");
	}

	@Override
	public void aterrizar() 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Yo " + super.nombre + " con " + super.edad + " acabo de aterrizar en un edificio");
	}

	@Override
	public void volar() 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Yo " + super.nombre + " con " + super.edad + " se volar");
	}
	public void saltarEdificios()
	{
		JOptionPane.showMessageDialog(null, super.nombre + " suelo estar en las cima de los edificios");
	}
	
	public void pararBala()
	{
		JOptionPane.showMessageDialog(null, super.nombre + " tengo la habilidad de parar balas de los enemigos");
	}

	@Override
	public void comer() 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, super.nombre + " le gusta la " + super.tipoComida);
	}

	@Override
	public void configurarPersonaje()
	{
		// TODO Auto-generated method stub
		super.edad = 20;
		super.nombre = "Superman";
	}

	@Override
	public void configurarComida() 
	{
		// TODO Auto-generated method stub
		super.tipoComida = "Comida rapida";
	}

}
