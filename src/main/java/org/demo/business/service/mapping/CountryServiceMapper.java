/*
 * Created on 3 avr. 2014 ( Time 19:39:42 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package org.demo.business.service.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import org.demo.bean.Country;
import org.demo.bean.jpa.CountryEntity;

/**
 * Mapping between entity beans and display beans.
 */
@Component
public class CountryServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public CountryServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'CountryEntity' to 'Country'
	 * @param countryEntity
	 */
	public Country mapCountryEntityToCountry(CountryEntity countryEntity) {
		if(countryEntity == null) {
			return null;
		}

		//--- Generic mapping 
		Country country = map(countryEntity, Country.class);

		return country;
	}
	
	/**
	 * Mapping from 'Country' to 'CountryEntity'
	 * @param country
	 * @param countryEntity
	 */
	public void mapCountryToCountryEntity(Country country, CountryEntity countryEntity) {
		if(country == null) {
			return;
		}

		//--- Generic mapping 
		map(country, countryEntity);

	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ModelMapper getModelMapper() {
		return modelMapper;
	}

	protected void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

}