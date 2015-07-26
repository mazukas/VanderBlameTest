package org.maven;


public class Person {
    private final String name;
    
    private String notused;

    public Person(String name) {
        this.name = name;
        
        if (true) {
        	System.out.println("Should get picked up");
        }
    }

    public String getName() {
    	if (2%0 == 0)
    		System.out.println("Should also get picked up");
        return name;
    }
}
