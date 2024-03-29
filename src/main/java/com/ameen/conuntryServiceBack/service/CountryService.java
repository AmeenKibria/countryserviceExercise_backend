package com.ameen.conuntryServiceBack.service;

import com.ameen.conuntryServiceBack.model.external.CountryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryServiceProxy countryServiceProxy;

    public List<CountryInfo> findAllCountries() {
        return countryServiceProxy.retrieveAllCountries();
    }

    public List<CountryInfo> findCountryByName(String countryName) {
        return countryServiceProxy.retrieveCountryByName(countryName);
    }
}
