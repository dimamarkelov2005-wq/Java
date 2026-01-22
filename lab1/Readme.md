# Лабораторная работа №1

<img width="1848" height="908" alt="image" src="https://github.com/user-attachments/assets/e4a3349c-7794-4f7e-9f75-023dca89b107" />


## Тема работы
Создание простой Java-программы в среде IntelliJ IDEA

---

## Цель работы
Освоить основы разработки Java-программ, научиться создавать проект в IntelliJ IDEA, писать и запускать программу с методом `main()`, а также выполнять загрузку исходного кода в удалённый Git-репозиторий.

---

## Задание
Разработать Java-программу, которая выводит на экран информацию о студенте:
- ФИО
- группа
- специальность

---

## Используемые средства
- Язык программирования: **Java**
- Среда разработки: **IntelliJ IDEA**
- Система контроля версий: **Git**
- Удалённый репозиторий: **GitHub**

---

## Ход выполнения работы

1. Была установлена и настроена среда разработки IntelliJ IDEA с подключённым JDK.
2. Создан новый Java-проект.
3. В каталоге `src` созданы два класса:
   - `Main` — основной класс с методом `main()`
   - `StudentInfo` — класс для хранения и вывода информации о студенте
4. Реализован вывод информации о студенте в консоль.
5. Проект был скомпилирован и успешно запущен.
6. Проект инициализирован как Git-репозиторий и загружен в GitHub.

---

## Структура проекта

src
├─ Main.java
└─ StudentInfo.java


---

## Исходный код программы

Main.java
```java
public class Main {

    public static void main(String[] args) {
        StudentInfo student = new StudentInfo(
                "Маркелов Дмитрий Сергеевич",
                "ИВТ-21",
                "Информационные технологии"
        );

        student.printInfo();
    }
}
StudentInfo.java
public class StudentInfo {

    private String fullName;
    private String group;
    private String specialty;

    public StudentInfo(String fullName, String group, String specialty) {
        this.fullName = fullName;
        this.group = group;
        this.specialty = specialty;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Группа: " + group);
        System.out.println("Специальность: " + specialty);
    }
}
Результат работы
В результате выполнения лабораторной работы была разработана Java-программа, выводящая информацию о студенте в консоль. Проект успешно загружен в удалённый репозиторий GitHub.

Вывод
В ходе работы были получены навыки создания Java-проектов в IntelliJ IDEA, написания простых программ, работы с классами и методами, а также использования системы контроля версий Git для хранения и передачи исходного кода.
