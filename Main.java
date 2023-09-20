package src;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Name, age, salary, and number of dependents, please:");
        String name = info.nextLine();
        int age = info.nextInt();
        int salary = info.nextInt();
        int fam = info.nextInt();
        System.out.println("Nice to meet you!");
        System.out.println("Making a profile for you...");
        ArrayList<String> names = new ArrayList<String>();
        names.add(name);
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(age);
        ArrayList<Integer> salaries = new ArrayList<Integer>();
        salaries.add(salary);
        ArrayList<Integer> dependents = new ArrayList<Integer>();
        dependents.add(fam);
        ArrayList<Integer> directory = new ArrayList<Integer>();
        directory.add(ages.get(0));
        directory.add(salaries.get(0));
        directory.add(dependents.get(0));
        HashMap<ArrayList<String>, ArrayList<Integer>> directory2 = new HashMap<ArrayList<String>, ArrayList<Integer>>();
        directory2.put(names, directory);
        System.out.println("Name: " + names.get(0));
        System.out.println("Age: " + ages.get(0));
        System.out.println("Salary: " + salaries.get(0));
        System.out.println("Dependents: " + dependents.get(0));
    }
}
