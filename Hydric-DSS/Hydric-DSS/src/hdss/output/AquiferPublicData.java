package hdss.output;

public class AquiferPublicData implements WaterResourceTypePublicData {

	private String myName;
	// Esfuerzo : 2 minutos
	// 3
	public AquiferPublicData (String name)
	{
		myName = name;
	}

	public String getMyName() {
		return myName;
	}
}
