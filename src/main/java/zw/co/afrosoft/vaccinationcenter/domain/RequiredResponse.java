package zw.co.afrosoft.vaccinationcenter.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequiredResponse {
    private VaccinationCenter center;
    private List<Citizen> citizens;
}
