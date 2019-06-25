package com.java.patterns.java_patterns.adapterpattern.myadapterpatternimpl;

public class DellLeitorHdAdapter implements DellHdSuport {

    private HdSuportAvancado hdSuportAvancado;

    public DellLeitorHdAdapter(String tipo) {
        if(tipo.equalsIgnoreCase("sata")) {
            this.hdSuportAvancado = new Sata();
        } else if(tipo.equalsIgnoreCase("hdd")) {
            this.hdSuportAvancado = new Hdd();
        }
    }

    @Override
    public void runHd(String tipo, String diskId) {

        if(tipo.equalsIgnoreCase("sata")) {
            this.hdSuportAvancado.runSata(diskId);
        } else if(tipo.equalsIgnoreCase("hdd")) {
            this.hdSuportAvancado.runHdd(diskId);
        }
    }
}
