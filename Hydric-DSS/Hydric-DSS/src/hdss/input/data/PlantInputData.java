package hdss.input.data;

import hdss.exceptions.HydricDSSException;

public class PlantInputData {

	private String name;
	private double maxCapacity;
	private Boolean validated;

	public String getName()
	{
		return name;
	}

	public double getMaxCapacity()
	{
		return maxCapacity;
	}

	//Esfuerzo Actual: 5 minutos
	// 7
	public void Validate () throws HydricDSSException
	{
    	if (!validated)
    	{
    		validateName();
    		vallidateMaxCapacity();
    		validated = true;
    	}
	}

	//Esfuerzo Actual: 3 minutos
	// 5
	private void validateName() throws HydricDSSException {
		if ((name.length()>50)||(name.length()<1))
		{
			throw (new HydricDSSException ("Nombre con un n�mero de caracteres mayor que 50 o menor que 1"));
		}
	}

	//Esfuerzo Actual: 3 minutos
	// 5
	private void vallidateMaxCapacity() throws HydricDSSException {
		if (maxCapacity<0.0f)
		{
			throw (new HydricDSSException ("La capacidad m�xima de la planta es un valor incorrecto"));
		}
	}
}
