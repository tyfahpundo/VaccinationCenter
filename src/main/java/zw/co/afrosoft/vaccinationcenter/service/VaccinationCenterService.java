package zw.co.afrosoft.vaccinationcenter.service;

import org.springframework.stereotype.Component;
import zw.co.afrosoft.vaccinationcenter.domain.VaccinationCenter;


public interface VaccinationCenterService {
    VaccinationCenter addCenter(VaccinationCenter center);

    VaccinationCenter getVaccinationCenterById(Long id);
}
