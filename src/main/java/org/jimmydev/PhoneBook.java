package org.jimmydev;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    private final Map<String, HashSet<PhoneNumber>> storage;

    {
        storage = new TreeMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (storage.containsKey(name)) {
            storage.get(name).add(new PhoneNumber(phoneNumber));
        } else {
            storage.put(name, new HashSet<>(List.of(new PhoneNumber(phoneNumber))));
        }
    }


    public void printSorted() {
        storage.entrySet().stream()
                .sorted(Comparator.comparingInt((Map.Entry<String, HashSet<PhoneNumber>> entity) -> entity.getValue().size()).reversed())
                .forEach(entity -> System.out.printf("%s : %s%n",
                        entity.getKey(),
                        entity.getValue().stream().map(PhoneNumber::toString).collect(Collectors.joining(", "))));
    }
}
