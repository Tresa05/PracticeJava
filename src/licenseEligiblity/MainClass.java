package licenseEligiblity;

public class MainClass {
	public static void main(String[] args) {
		LicenseAuthority license = new LicenseAuthority();
		license.age = 28;
		license.licensecategory = "G1";	
		if(license.age>=18&&license.licensecategory== "No License" )
		{
			System.out.println("Applicant eligible for G1");
		}
		else if(license.age>=18&&license.licensecategory=="G1")
		{
			System.out.println("Applicant eligible for G2");
		}
		else if(license.age>=18&&license.licensecategory=="G2")
		{
			System.out.println("Applicant eligible for G");
		}
		else 
		{
			System.out.println("Applicant not eligible for license");
			
		}
	}
}

	