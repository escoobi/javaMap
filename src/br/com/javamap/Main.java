package br.com.javamap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 13.4);
            put("mobi", 18.4);
            put("onix", 13.4);
        }};

        System.out.println(carrosPopulares.toString());

        carrosPopulares.put("gol", 15d);
        System.out.println(carrosPopulares.toString());
        System.out.println(carrosPopulares.containsKey("monza"));
        System.out.println(carrosPopulares.get("onix"));
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos.toString());

        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo.toString());

        System.out.println(Collections.max(consumo));
        System.out.println(Collections.min(consumo));

        Double best = Collections.max(consumo);
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String bestModelo = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(best))
                bestModelo = entry.getKey();
        }

        System.out.println(bestModelo + " - " + Collections.max(consumo));

        Double worse = Collections.min(consumo);
        Set<Map.Entry<String, Double>> entriesWorse = carrosPopulares.entrySet();
        String worseModelo = "";
        for (Map.Entry<String, Double> entry : entriesWorse) {
            if (entry.getValue().equals(worse))
                worseModelo = entry.getKey();
        }

        System.out.println(worseModelo + " - " + Collections.min(consumo));

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma/carrosPopulares.size());
        System.out.println(soma);

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() == 13.4){
                iterator1.remove();
            }
        }
        // carrosPopulares.values().removeIf(aDouble -> aDouble == 13.4); A remoção pode ocorrer dessa forma!

        System.out.println(carrosPopulares);
    }
}
