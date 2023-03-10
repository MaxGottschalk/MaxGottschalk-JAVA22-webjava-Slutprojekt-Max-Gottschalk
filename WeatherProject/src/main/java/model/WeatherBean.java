package model;


public class WeatherBean {
	private String cityStr;

	private String countryStr;

	private String cloudsStr;
	
	private String tempStr;
	
	private String dateStr;

	public WeatherBean(String cityStr, String countryStr) {

		this.cityStr = cityStr;
		this.countryStr = countryStr;

	}

	public String getCityStr() {
		return cityStr;
	}

	public String getCountryStr() {
		return countryStr;
	}

	public String getCloudsStr() {
		return cloudsStr;
	}

		public void setCloudsStr(String cloudsStr) {
		this.cloudsStr = cloudsStr;
	}

		public String getTempStr() {
			return tempStr;
		}

		public void setTempStr(String tempStr) {
			this.tempStr = tempStr;
		}

		public String getDateStr() {
			String result = dateStr.substring(0, 10);
			return result;
		}

		public void setDateStr(String sunRiseStr) {
			this.dateStr = sunRiseStr;
		}
		
}
