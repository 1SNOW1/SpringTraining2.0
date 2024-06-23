package com.cydeo;

import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public QueryDemo(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("--------------------REGION---------------------");

        System.out.println("findByCountry: " + regionRepository.findByCountry("Canada"));
        System.out.println("findByCountry: " + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountry: " + regionRepository.findByCountryContainsOrderByRegion("United"));
        System.out.println(regionRepository.findTopByCountry("United States"));
        System.out.println(regionRepository.findTop2ByCountry("United States"));

    }

}
