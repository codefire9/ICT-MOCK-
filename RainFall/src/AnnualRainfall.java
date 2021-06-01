
public class AnnualRainfall {
	
	
	private int cityPincode;
	private String cityName;
	private double averageAnnualRainfall;

	public int getCityPincode() {
		return cityPincode;
	}

	public void setCityPincode(int cityPincode) {
		this.cityPincode = cityPincode;
	}

	public String getCityName(){
		return cityName;
	}

	public void setCityName(String cityName){
		this.cityName = cityName;
	}


	public double getAverageAnnualRainfall(){
		return averageAnnualRainfall;
	}


	public void setAverageAnnualRainfall(double averageAnnualRainfall){
		this.averageAnnualRainfall = averageAnnualRainfall;
	}

	//Write the required business logic as expected in the question description
	public void calculateAverageAnnualRainfall (double monthlyRainfall [ ]){
	    
		//fill the code
		double totalAnnualRainfall =0;
		for(double monthlyRainfalls : monthlyRainfall) {
			totalAnnualRainfall += monthlyRainfalls;
		}
		averageAnnualRainfall = totalAnnualRainfall/12.0;
	}


}
