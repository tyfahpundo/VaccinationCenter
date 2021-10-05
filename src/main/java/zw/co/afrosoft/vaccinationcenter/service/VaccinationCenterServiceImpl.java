package zw.co.afrosoft.vaccinationcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.afrosoft.vaccinationcenter.domain.VaccinationCenter;
import zw.co.afrosoft.vaccinationcenter.persistence.VaccinationCenterRepository;
@Service
public class VaccinationCenterServiceImpl implements VaccinationCenterService{
    @Autowired
    private VaccinationCenterRepository repo;

    @Override
    public VaccinationCenter addCenter(VaccinationCenter center) {
        VaccinationCenter vcenter = repo.save(center);
        return vcenter;
    }

    @Override
    public VaccinationCenter getVaccinationCenterById(Long id) {
        VaccinationCenter vn = repo.findById(id).get();
        return vn;
    }

    @Override
    public VaccinationCenter getById(Long id) {
        VaccinationCenter center = repo.findById(id).get();
        return center;
    }
}
