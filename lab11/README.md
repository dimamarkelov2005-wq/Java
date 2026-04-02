# 🧮 Лабораторная работа №11  
## Работа с калькулятором (Java)

---

## 📌 Тема
Создание калькулятора на языке Java

---

## 🎯 Цель работы
- Освоить основные математические операции  
- Научиться работать с вводом данных (Scanner)  
- Реализовать меню и взаимодействие с пользователем  
- Использовать условные операторы (`if`, `switch`)  
- Обработать возможные ошибки (например, деление на ноль)  
- Познакомиться с графическим интерфейсом (Swing)

---

## 🛠️ Используемые технологии
- Язык: **Java**
- Среда разработки: **IntelliJ IDEA**
- Библиотеки:
  - `java.util`
  - `javax.swing`
  - `javax.script`

---

## 📁 Структура проекта
src/
├── Main.java
├── SimpleCalculator.java
├── LoopCalculator.java
├── MethodCalculator.java
├── GuiCalculator.java
├── PowerCalculator.java
├── SqrtCalculator.java
├── NegativeNumberDemo.java
├── InputValidationDemo.java
├── MenuCalculator.java
├── HistoryCalculator.java
├── ClearScreenDemo.java
├── PercentCalculator.java
├── ScientificCalculator.java
└── ExpressionCalculator.java

---

## ▶️ Запуск программы

1. Открыть проект в IntelliJ IDEA  
2. Запустить файл `Main.java`  
3. Выбрать номер задания в консоли  

---

## 📋 Описание заданий

### 🔹 1. Simple Calculator
Простой калькулятор с операциями:
- сложение
- вычитание
- умножение
- деление

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/a724d3b2-8196-46f9-96af-573572d37838" />

---

### 🔹 2. Loop Calculator
Позволяет выполнять операции несколько раз подряд с помощью цикла `while`.

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/5e9ec911-8217-4d67-91fc-dda2ac7a2005" />

---

### 🔹 3. Method Calculator
Использует отдельные методы для вычислений (например, `add()`).

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/8b9b74bd-319e-4b03-b6d2-bf24565a446d" />

---

### 🔹 4. GUI Calculator
Графический калькулятор с использованием:
- `JFrame`
- `JTextField`
- `JButton`

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/c33248e7-21cc-41b5-ab0c-af2adc1c4175" />

---

### 🔹 5. Power Calculator
Возведение числа в степень (`Math.pow()`)

<img width="1915" height="1079" alt="image" src="https://github.com/user-attachments/assets/8414819e-7edb-4c29-861e-56166a4e42e2" />

---

### 🔹 6. Square Root Calculator
Вычисление квадратного корня (`Math.sqrt()`)

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/1587c4aa-09b1-4d3d-92f7-5430cf060f3b" />

---

### 🔹 7. Negative Numbers Demo
Работа с отрицательными числами

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/707354fc-db45-4fb5-8a0d-d6e033a3d3f3" />

---

### 🔹 8. Input Validation
Обработка ошибок ввода (`try-catch`)

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/7eed4208-c774-4590-9bf9-44345bc7a85f" />

---

### 🔹 9. Menu Calculator
Выбор операций через числовое меню:
1 – сложение
2 – вычитание
3 – умножение
4 – деление

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/ab833c70-b123-4a1c-b7cc-c5bbde781769" />

---

### 🔹 10. History Calculator
Сохранение истории операций в `ArrayList`

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/253c5ca6-13b6-4915-afa0-213ea84cf9d4" />

---

### 🔹 11. Clear Screen
Очистка консоли (имитация через вывод пустых строк)

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/0c42ab3a-9edd-4c01-8c45-584450a3a00d" />

---

### 🔹 12. Percent Calculator
Вычисление процента:
a % от b

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/6d4e806c-ab6e-4d28-a4f5-37350a7efc0e" />

---

### 🔹 13. Scientific Calculator
Инженерные функции:
- sin
- cos
- tan

(используется `Math.sin`, `Math.cos`, `Math.tan`)

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/c9f06a2d-fc39-4dc7-a7f6-6702ad87644c" />

---

### 🔹 14. Expression Calculator
Обработка выражений:
2 + 3 * 4
Используется `ScriptEngine`

![Uploading image.png…]()

---

## ⚠️ Обработка ошибок

В программе реализованы:
- Проверка деления на ноль  
- Обработка неверного ввода (`InputMismatchException`)  
- Обработка ошибок вычисления выражений
  
---

## 📊 Пример работы
===== LAB 11 =====
1 - Simple Calculator
2 - Loop Calculator
...
Выбор: 1

a: 5
b: 3
Operation: +
Result: 8

---

## ✅ Вывод

В ходе лабораторной работы:
- Освоены базовые конструкции Java  
- Реализован калькулятор с различными возможностями  
- Изучена работа с GUI  
- Получены навыки обработки ошибок и структурирования кода  
---
