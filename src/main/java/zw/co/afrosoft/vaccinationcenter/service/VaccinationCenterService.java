package zw.co.afrosoft.vaccinationcenter.service;

import zw.co.afrosoft.vaccinationcenter.domain.VaccinationCenter;

import java.util.List;


public interface VaccinationCenterService {
    VaccinationCenter addCenter(VaccinationCenter center);

    VaccinationCenter getVaccinationCenterById(Long id);

    VaccinationCenter getById(Long id);
}
