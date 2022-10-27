package org.code.practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MapSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //reverseString();

        AtomicInteger atomicInteger = new AtomicInteger();
        Map<Integer, String> mapValues = new HashMap<>();
        mapValues.put(atomicInteger.incrementAndGet(), "Tesla");
        mapValues.put(atomicInteger.incrementAndGet(), "Adani");
        mapValues.put(atomicInteger.incrementAndGet(), "TATA");
        mapValues.put(atomicInteger.incrementAndGet(), "Premji");

        mapValues=   mapValues.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new)
        );

        System.out.println(mapValues);

    }
    }
