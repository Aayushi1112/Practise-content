package com.policy.creation.MongoExample.use;
import org.kie.api.KieServices;
import org.kie.api.definition.rule.Rule;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

class Person {
	int age;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
public class RuleExample {

    @Rule
    public void checkAge(Person person) {
        if (person.getAge() < 18) {
            System.out.println(person.getName() + " is a minor.");
        } else {
            System.out.println(person.getName() + " is an adult.");
        }
    }

    public static void main(String[] args) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession();

        Person john = new Person();
        john.setAge(20);
        john.setName("John");
        kSession.insert(john);
        kSession.fireAllRules();

        kSession.dispose();
    }
}

