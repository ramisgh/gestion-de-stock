package com.sgh.gestiondestock.validator;

import org.springframework.util.StringUtils;
import com.sgh.gestiondestock.dto.CatogorieDto;
import java.util.ArrayList;
import java.util.List;

public class CategorieValidator
{
    public static List<String> validate(CatogorieDto categoryDto) {
        List<String> errors = new ArrayList<>();

        if (categoryDto == null || !StringUtils.hasLength(categoryDto.getCode())) {
            errors.add("Veuillez renseigner le code de la categorie");
        }
        return errors;
    }
}
