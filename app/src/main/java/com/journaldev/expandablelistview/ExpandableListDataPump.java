package com.journaldev.expandablelistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<Persona>> getData() {
        HashMap<String, List<Persona>> expandableListDetail = new HashMap<>();

        List<Persona> persona1 = new ArrayList<>();
        persona1.add(new Persona("Kerly","Quispe",23,"-"));
        persona1.add(new Persona("Diana","Quispe",23,"-"));
        persona1.add(new Persona("Chamaquito","Quispe",23,"-"));
        persona1.add(new Persona("Anthony","Quispe",23,"-"));
        persona1.add(new Persona("Kerly2","Quispe",23,"-"));
        persona1.add(new Persona("Kerly3","Quispe",23,"-"));
        persona1.add(new Persona("Kerly4","Quispe",23,"-"));

        List<Persona> persona2 = new ArrayList<>();
        persona2.add(new Persona("Kerly2","Quispe",23,"-"));
        persona2.add(new Persona("Diana2","Quispe",23,"-"));
        persona2.add(new Persona("Chamaquito2","Quispe",23,"-"));
        persona2.add(new Persona("Anthony2","Quispe",23,"-"));
        persona2.add(new Persona("Kerly22","Quispe",23,"-"));
        persona2.add(new Persona("Kerly32","Quispe",23,"-"));
        persona2.add(new Persona("Kerly42","Quispe",23,"-"));

        List<Persona> persona3 = new ArrayList<>();
        persona3.add(new Persona("Kerly3","Quispe",23,"-"));
        persona3.add(new Persona("Diana3","Quispe",23,"-"));
        persona3.add(new Persona("Chamaquito3","Quispe",23,"-"));
        persona3.add(new Persona("Anthony3","Quispe",23,"-"));
        persona3.add(new Persona("Kerly23","Quispe",23,"-"));
        persona3.add(new Persona("Kerly33","Quispe",23,"-"));
        persona3.add(new Persona("Kerly43","Quispe",23,"-"));

        expandableListDetail.put("CRICKET TEAMS", persona1);
        expandableListDetail.put("FOOTBALL TEAMS", persona2);
        expandableListDetail.put("BASKETBALL TEAMS", persona3);
        return expandableListDetail;
    }
}
