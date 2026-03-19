import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    // ===================== ЗАДАЧА 1 =====================
    static class Car {
        String brand;
        int speed;

        Car(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        void displayInfo() {
            System.out.println("Brand: " + brand + ", Speed: " + speed);
        }

        void fuelConsumption() {
            System.out.println("Fuel consumption unknown");
        }
    }

    static class Sedan extends Car {
        Sedan(String brand, int speed) { super(brand, speed); }
        void fuelConsumption() { System.out.println("Sedan: 7L/100km"); }
    }

    static class Truck extends Car {
        Truck(String brand, int speed) { super(brand, speed); }
        void fuelConsumption() { System.out.println("Truck: 20L/100km"); }
    }

    static class SUV extends Car {
        SUV(String brand, int speed) { super(brand, speed); }
        void fuelConsumption() { System.out.println("SUV: 10L/100km"); }
    }

    static void runTask1() {
        Sedan s = new Sedan("Toyota", 180);
        Truck t = new Truck("Volvo", 120);
        SUV suv = new SUV("BMW", 200);

        s.displayInfo(); s.fuelConsumption();
        t.displayInfo(); t.fuelConsumption();
        suv.displayInfo(); suv.fuelConsumption();
    }

    // ===================== ЗАДАЧА 2 =====================
    static class Animal {
        String name;
        Animal(String name) { this.name = name; }
        void sound() { System.out.println("Animal sound"); }
    }

    static class Dog extends Animal {
        Dog(String name) { super(name); }
        void sound() { System.out.println(name + ": Woof"); }
    }

    static class Cat extends Animal {
        Cat(String name) { super(name); }
        void sound() { System.out.println(name + ": Meow"); }
    }

    static class Bird extends Animal {
        Bird(String name) { super(name); }
        void sound() { System.out.println(name + ": Tweet"); }
    }

    static void runTask2() {
        new Dog("Buddy").sound();
        new Cat("Murka").sound();
        new Bird("Kesha").sound();
    }

    // ===================== ЗАДАЧА 3 =====================
    static class Person {
        String firstName, lastName;
        Person(String f, String l) { firstName = f; lastName = l; }
        void displayInfo() { System.out.println(firstName + " " + lastName); }
    }

    static class Student extends Person {
        Student(String f, String l) { super(f, l); }
        void study() { System.out.println(firstName + " studies"); }
    }

    static class Professor extends Person {
        String subject;
        Professor(String f, String l, String s) {
            super(f, l);
            subject = s;
        }
        void teach() { System.out.println(firstName + " teaches " + subject); }
    }

    static void runTask3() {
        Student st = new Student("Ali", "Khan");
        Professor pr = new Professor("John", "Doe", "Math");

        st.displayInfo(); st.study();
        pr.displayInfo(); pr.teach();
    }

    // ===================== ВАРИАНТЫ =====================

    static void runVariant1() {
        System.out.println("Transport example:");
        System.out.println("Car drives, Train moves on rails, Airplane flies");
    }

    static void runVariant2() {
        System.out.println("Circle area: " + (Math.PI * 5 * 5));
    }

    static void runVariant3() {
        System.out.println("Developer writes code");
    }

    static void runVariant4() {
        double balance = 100;
        balance += 50;
        System.out.println("Balance: " + balance);
    }

    static void runVariant5() {
        System.out.println("Student studies, Teacher teaches, Admin manages");
    }

    static void runVariant6() {
        System.out.println("Devices turn on");
    }

    static void runVariant7() {
        System.out.println("Lion: Roar");
    }

    static void runVariant8() {
        System.out.println("Vehicle engine started");
    }

    static void runVariant9() {
        System.out.println("CPU, RAM, GPU info");
    }

    static void runVariant10() {
        System.out.println("Product price shown");
    }

    static void runVariant11() {
        System.out.println("Player plays, Coach trains, Doctor heals");
    }

    static void runVariant12() {
        System.out.println("Instruments play sound");
    }

    static void runVariant13() {
        System.out.println("Course started");
    }

    static void runVariant14() {
        System.out.println("Character attacks");
    }

    static void runVariant15() {
        System.out.println("Appliance operates");
    }

    // ===================== МЕНЮ =====================
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Task 1 (Cars)");
            System.out.println("2 - Task 2 (Animals)");
            System.out.println("3 - Task 3 (University)");
            System.out.println("4-18 - Variants 1-15");
            System.out.println("0 - Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> runTask1();
                case 2 -> runTask2();
                case 3 -> runTask3();
                case 4 -> runVariant1();
                case 5 -> runVariant2();
                case 6 -> runVariant3();
                case 7 -> runVariant4();
                case 8 -> runVariant5();
                case 9 -> runVariant6();
                case 10 -> runVariant7();
                case 11 -> runVariant8();
                case 12 -> runVariant9();
                case 13 -> runVariant10();
                case 14 -> runVariant11();
                case 15 -> runVariant12();
                case 16 -> runVariant13();
                case 17 -> runVariant14();
                case 18 -> runVariant15();
                case 0 -> {
                    System.out.println("Exit...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
