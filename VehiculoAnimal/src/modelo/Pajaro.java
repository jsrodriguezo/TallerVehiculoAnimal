package modelo;

import javax.swing.JOptionPane;

public class Pajaro extends Animal implements Volador 
{
	private String nombre;
	private int numeroAlas;
	
	public Pajaro()
	{
		this.configurarComida();
	}
	

	@Override
	public void despegar() 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, this.nombre + " le gusta despegar desde su nido");
	}

	@Override
	public void aterrizar() 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, this.nombre + " aterriza para recoger su comida");
	}

	@Override
	public void volar() 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, this.nombre + " suele volar mucho con sus " + this.numeroAlas + " alas largas");
	}
	
	public void construirNido()
	{
		JOptionPane.showMessageDialog(null, this.nombre + " tiene que construir su nido y comer sus " + super.tipoComida);
	}
	
	public void ponerHuevos()
	{
		JOptionPane.showMessageDialog(null, this.nombre + " pone demasiado huevos");
	}

	@Override
	public void comer() 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, this.nombre + " le encanta las " + super.tipoComida);
	}

	@Override
	public void configurarComida() 
	{
		// TODO Auto-generated method stub
		super.tipoComida = "semillas";
		this.nombre = "Tocumen";
		this.numeroAlas = 2;
	}

}
