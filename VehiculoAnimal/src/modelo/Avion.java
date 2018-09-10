package modelo;

import javax.swing.JOptionPane;

public abstract class Avion extends Vehiculo implements Volador
{

	@Override
	public void despegar()
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Este " + super.tipoVehiculo + " esta despegando con sus " + super.llantas + " y con sus " + super.motor + " a toda marcha");
	}

	@Override
	public void aterrizar() 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Este " + super.tipoVehiculo + " esta aterrizando con sus " + super.llantas + " llantas");
	}

	@Override
	public void volar() 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Este " + super.tipoVehiculo + " esta volando y tiene " + super.motor);
	}

	@Override
	public void configurarVehiculo() 
	{
		// TODO Auto-generated method stub
		super.tipoVehiculo = "Aeroplano";
		super.motor = "turbinas";
		super.llantas = 18;
	}
	

	
}
