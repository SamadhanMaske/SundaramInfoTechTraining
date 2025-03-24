package com.March13;

import java.util.*;
import java.util.stream.Collectors;

class Empl {
    int id;
    String name;

    Empl(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ListToMap {
    public static void main(String[] args) {
        List<Empl> employees = Arrays.asList(
            new Empl(1, "John"),
            new Empl(2, "Jane"),
            new Empl(3, "Jack")
        );

        Map<Integer, String> employeeMap = employees.stream()
            .collect(Collectors.toMap(emp -> emp.id, emp -> emp.name));

        System.out.println(employeeMap);
    }
}


