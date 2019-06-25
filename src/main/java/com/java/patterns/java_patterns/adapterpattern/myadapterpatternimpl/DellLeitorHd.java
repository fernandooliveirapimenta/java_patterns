package com.java.patterns.java_patterns.adapterpattern.myadapterpatternimpl;

public class DellLeitorHd implements DellHdSuport {

    private DellLeitorHdAdapter dellLeitorHdAdapter;

    @Override
    public void runHd(String tipo, String diskId) {

        if(tipo.equalsIgnoreCase("hxg")) {
            System.out.println("Rodando hxg  :" + diskId);
        } else if(tipo.equalsIgnoreCase("sata") || tipo.equalsIgnoreCase("hdd")) {
           this.dellLeitorHdAdapter = new DellLeitorHdAdapter(tipo);
           this.dellLeitorHdAdapter.runHd(tipo, diskId);
        }
    }
}
