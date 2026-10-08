package com.example;

public class Transformacion {
    private String Saiyan;
    private String SuperSaiyan;
    private String SuperSaiyan2;
    private String Regeneracion;
    
    public Transformacion() {
    }

    public Transformacion(String saiyan, String superSaiyan, String superSaiyan2, String regeneracion) {
        Saiyan = saiyan;
        SuperSaiyan = superSaiyan;
        SuperSaiyan2 = superSaiyan2;
        Regeneracion = regeneracion;
    }

    public String getSaiyan() {
        return Saiyan;
    }

    public void setSaiyan(String saiyan) {
        Saiyan = saiyan;
    }

    public String getSuperSaiyan() {
        return SuperSaiyan;
    }

    public void setSuperSaiyan(String superSaiyan) {
        SuperSaiyan = superSaiyan;
    }

    public String getSuperSaiyan2() {
        return SuperSaiyan2;
    }

    public void setSuperSaiyan2(String superSaiyan2) {
        SuperSaiyan2 = superSaiyan2;
    }

    public String getRegeneracion() {
        return Regeneracion;
    }

    public void setRegeneracion(String regeneracion) {
        Regeneracion = regeneracion;
    }


}
