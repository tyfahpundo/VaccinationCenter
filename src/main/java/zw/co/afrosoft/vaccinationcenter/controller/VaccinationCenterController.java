package zw.co.afrosoft.vaccinationcenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import zw.co.afrosoft.vaccinationcenter.domain.Citizen;
import zw.co.afrosoft.vaccinationcenter.domain.RequiredResponse;
import zw.co.afrosoft.vaccinationcenter.domain.VaccinationCenter;
import zw.co.afrosoft.vaccinationcenter.service.VaccinationCenterService;

import java.util.List;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {
    @Autowired
    private VaccinationCenterService service;
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("add")
    public ResponseEntity<VaccinationCenter> addCenter(@RequestBody VaccinationCenter center) {
        VaccinationCenter vcenter = service.addCenter(center);
        return new ResponseEntity<>(vcenter, HttpStatus.CREATED);
    }
    @GetMapping("getVaccinationCenterById/{id}")
    public ResponseEntity<RequiredResponse> getAllDataBasedOnCenterId(@PathVariable Long id){
        RequiredResponse requiredResponse = new RequiredResponse();
        //1st get the vaccination center details
        VaccinationCenter vaccinationCenter = service.getVaccinationCenterById(id);
        requiredResponse.setCenter(vaccinationCenter);

        //then get all citizens registered to vaccination center
        List<Citizen> listOfCitizens = restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/get/"+id, List.class);
        requiredResponse.setCitizens(listOfCitizens);

        return new ResponseEntity<>(requiredResponse, HttpStatus.OK);


    }
}
