package hdss.input.data;

import hdss.exceptions.HydricDSSException;

public class ReservoirCurrentData {
	private String name;
	private double currentCapacity;
	private Boolean validated;

	public String getName()
	{
		return this.name;
	}

	public double getCurrentCapacity()
	{
		return this.currentCapacity;
	}

	//Esfuerzo Actual: 5 minutos
	// 7
	public void Validate () throws HydricDSSException
	{
    	if (!validated)
    	{
    		validateName();
    		vallidateCurrentCapacity();
    		validated = true;
    	}
	}

	//Esfuerzo Actual: 3 minutos
	// 4
	private void validateName() throws HydricDSSException {
		if ((name.length()>50)||(name.length()<1))
		{
			throw (new HydricDSSException ("Nombre con un n�mero de caracteres mayor que 50 o menor que 1"));
		}
	}

	//Esfuerzo Actual: 3 minutos
	// 5
	private void vallidateCurrentCapacity() throws HydricDSSException {
		if (currentCapacity<0.0f)
		{
			throw (new HydricDSSException ("La capacidad actual del embalse es un valor incorrecto"));
		}
	}
}
