package com.springws.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.springws.countries.Country;
import com.springws.countries.Currency;

@Component
public class CountryRepository {
	private static final List<Country> countries = new ArrayList<Country>();

	@PostConstruct
	public void initData() {

		Country uk = new Country();
		uk.setName("United Kingdom");
		uk.setCapital("London");
		uk.setCurrency(Currency.GBP);
		uk.setPopulation(64100000);
		countries.add(uk);

		Country us = new Country();
		us.setName("United States");
		us.setCapital("New York");
		us.setCurrency(Currency.USD);
		us.setPopulation(318900000);
		countries.add(us);

		Country in = new Country();
		in.setName("India");
		in.setCapital("New Delhi");
		in.setCurrency(Currency.INR);
		in.setPopulation(1252000000);
		countries.add(in);

	}

	public Country findCountry(String name) {
		Assert.notNull(name);

		Country result = null;

		for (Country country : countries) {
			if (name.equals(country.getName())) {
				result = country;
			}
		}

		return result;
	}
}
