package abstractConcept;

public class AbstractDemoBMW extends AbstractCars {
	
	public void setPrivateSpeed(int pSpeed)
	{
		super.setPrivateSpeed(10);
	}

//	public void engineStart()
//	{
//		//super.engineStart();
//		System.out.println("BMw has keyLess engin Started");
//	}

	@Override
	public void engineStart(String keyType, int numOfCyl) {
		System.out.println("This is the BMW engine statrt");
		
	}
}
