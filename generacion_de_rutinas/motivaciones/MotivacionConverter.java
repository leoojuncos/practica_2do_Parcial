package ar.edu.utn.frba.dds.ejercicio_01.motivaciones;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class MotivacionConverter implements AttributeConverter<Motivacion, String> {
    @Override
    public String convertToDatabaseColumn(Motivacion motivacion){
        if(motivacion == null){
            return null;
        }
        String stringMotivation = "";

        if(motivacion instanceof BajarDePeso){
            stringMotivation = "BajarDePeso";
        }else if(motivacion instanceof Mantener){
            stringMotivation = "Mantener";
        }else if(motivacion instanceof Tonificar){
            stringMotivation = "Tonificar";
        }
        return stringMotivation;
    }

    @Override
    public Motivacion convertToEntityAttribute(String s) {
        Motivacion motivacion = null;

        switch (s) {
            case "BajarDePeso" : motivacion = new BajarDePeso();
            break;

            case "Manter" : motivacion = new Mantener();
            break;

            case "Tonificar" : motivacion = new Tonificar();
            break;

            default: motivacion = null;
        }

        return motivacion;
    }
}
