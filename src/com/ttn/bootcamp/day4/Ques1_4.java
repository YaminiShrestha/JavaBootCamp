package com.ttn.bootcamp.day4;
/**
 *  Convert a string to uppercase and return .Parameter (String) Return (String)
 */

import java.util.List;
import java.util.function.Function;

public class Ques1_4 {
    /*
     * this method will change the list of string into uppercase
     * @return every string to uppercase
     */
    private static Function<String, String> getStringStringFunction()
    {
        return String::toUpperCase;
    }

    /*
     * this method will use mapping function
     * @param courses input list of string under which mapping is performed
     * @return list of string in uppercase
     */
    private static void upperCaseString(List<String> courses) {
        courses.stream().map(getStringStringFunction())
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<String> courses = List.of("Aws", "Spring", "Spring Boot", "API", "Microservices", "AWS",
                "PCF", "Azure", "Docker", "Kubernetes", "jvm");

        if (courses == null) {
            System.out.println("null");
        } else {
            upperCaseString(courses);
        }
    }




}
