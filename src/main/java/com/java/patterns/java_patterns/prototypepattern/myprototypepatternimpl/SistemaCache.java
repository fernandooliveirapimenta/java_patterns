package com.java.patterns.java_patterns.prototypepattern.myprototypepatternimpl;

import java.util.HashMap;
import java.util.Map;

public class SistemaCache {

    public static Map<String, Sistema> sistemaMap = new HashMap<>();

    public static Sistema getSistema(String id) throws CloneNotSupportedException {
        Sistema sistema = sistemaMap.get(id);
        return (Sistema) sistema.clone();
    }


    public static void loadChache(){
       Crm crm = new Crm();
       crm.setId("1");

       sistemaMap.put(crm.getId(), crm);
       sistemaMap.put(crm.getId(), crm);

       Ged ged = new Ged();
       ged.setId("2");

       sistemaMap.put(ged.getId(), ged);
    }
}
