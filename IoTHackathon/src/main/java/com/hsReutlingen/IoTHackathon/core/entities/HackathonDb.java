package com.hsReutlingen.IoTHackathon.core.entities;

public class HackathonDb {

    private String id;

    private String vorlesung;

    private String von;

    private String bis;

    private String teilnehmeranzahl;

    private String raum;

    private String raumkapazitaet;

    public HackathonDb(String id, String vorlesung, String von, String bis, String teilnehmeranzahl, String raum, String raumkapazitaet) {
        this.id = id;
        this.vorlesung = vorlesung;
        this.von = von;
        this.bis = bis;
        this.teilnehmeranzahl = teilnehmeranzahl;
        this.raum = raum;
        this.raumkapazitaet = raumkapazitaet;
    }

    public HackathonDb() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVorlesung() {
        return vorlesung;
    }

    public void setVorlesung(String vorlesung) {
        this.vorlesung = vorlesung;
    }

    public String getVon() {
        return von;
    }

    public void setVon(String von) {
        this.von = von;
    }

    public String getBis() {
        return bis;
    }

    public void setBis(String bis) {
        this.bis = bis;
    }

    public String getTeilnehmeranzahl() {
        return teilnehmeranzahl;
    }

    public void setTeilnehmeranzahl(String teilnehmeranzahl) {
        this.teilnehmeranzahl = teilnehmeranzahl;
    }

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }

    public String getRaumkapazitaet() {
        return raumkapazitaet;
    }

    public void setRaumkapazitaet(String raumkapazitaet) {
        this.raumkapazitaet = raumkapazitaet;
    }
}
