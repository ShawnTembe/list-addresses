package za.co.investec.vo;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address implements Serializable {

	private int id;
	private Type type;
	private AddressLineDetail addressLineDetail;
	private ProvinceOrState provinceOrState;
	private String cityOrTown;
	private Country country;
	private String postalCode;
	private String suburbOrDistrict;
	private Date lastUpdated;
	
	public int getId() {
		
		return id;
	}
	
	public void setId(int id) {
		
		this.id = id;
	}
	
	public Type getType() {
		
		return type;
	}
	
	public void setType(Type type) {
		
		this.type = type;
	}
	
	public AddressLineDetail getAddressLineDetail() {
		
		return addressLineDetail;
	}
	
	public void setAddressLineDetail(AddressLineDetail addressLineDetail) {
		
		this.addressLineDetail = addressLineDetail;
	}
	
	public ProvinceOrState getProvinceOrState() {
		
		return provinceOrState;
	}
	
	public void setProvinceOrState(ProvinceOrState provinceOrState) {
		
		this.provinceOrState = provinceOrState;
	}
	
	public String getCityOrTown() {
		
		return cityOrTown;
	}
	
	public void setCityOrTown(String cityOrTown) {
		
		this.cityOrTown = cityOrTown;
	}
	
	public Country getCountry() {
		
		return country;
	}
	
	public void setCountry(Country country) {
		
		this.country = country;
	}
	
	public String getPostalCode() {
		
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		
		this.postalCode = postalCode;
	}
	
	public String getSuburbOrDistrict() {
		
		return suburbOrDistrict;
	}
	
	public void setSuburbOrDistrict(String suburbOrDistrict) {
		
		this.suburbOrDistrict = suburbOrDistrict;
	}
	
	public Date getLastUpdated() {
		
		return lastUpdated;
	}
	
	public void setLastUpdated(Date lastUpdated) {
		
		this.lastUpdated = lastUpdated;
	}	
	
	@Override
	public String toString() { 
		
		return String.format("%s - %s - %s - %s – %s", 
				             (addressLineDetail != null)? addressLineDetail.toString(): "",
				             (provinceOrState != null)? provinceOrState.toString(): "",
				             cityOrTown,
				             (provinceOrState != null)? provinceOrState.toString(): "",
				             postalCode,
				             (country != null)? country.toString(): "");
	}
}
