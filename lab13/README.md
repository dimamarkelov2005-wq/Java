# Лабораторная работа №13  
## Лямбда-выражения и Stream API в Java

---

## 🎯 Цель работы

- Освоить лямбда-выражения в Java  
- Изучить функциональные интерфейсы  
- Научиться использовать Stream API  
- Работать с коллекциями и объектами  
- Применять современные возможности Java  

---

## 📚 Теоретическая часть

### 🔹 Лямбда-выражения
Общий синтаксис:
(parameters) -> expression
(parameters) -> { statements; }

### 🔹 Основные функциональные интерфейсы

| Интерфейс | Метод | Назначение |
|----------|------|-----------|
| Predicate<T> | test() | Проверка условия |
| Function<T,R> | apply() | Преобразование |
| Consumer<T> | accept() | Выполнение действия |
| Supplier<T> | get() | Генерация значения |
| Comparator<T> | compare() | Сравнение |

---

### 🔹 Основные методы Stream API

- `filter()` — фильтрация  
- `map()` — преобразование  
- `forEach()` — перебор  
- `sorted()` — сортировка  
- `distinct()` — удаление дубликатов  
- `limit()` — ограничение  
- `reduce()` — агрегирование  

---

## 🧪 Практическая часть

### 🔹 Базовые задания

| № | Задание | Файл |
|--|--------|------|
| 1 | Сложение чисел | Task1_Sum.java |
| 2 | Верхний регистр | Task2_ToUpper.java |
| 3 | Фильтр нечётных | Task3_OddFilter.java |
| 4 | Квадраты чисел | Task4_Square.java |
| 5 | Максимум | Task5_Max.java |
| 6 | Сортировка строк | Task6_SortByLength.java |
| 7 | Заглавная буква | Task7_Capitalize.java |
| 8 | Длина > 5 | Task8_LengthFilter.java |
| 9 | Method reference | Task9_MethodReference.java |
| 10 | Optional | Task10_OptionalMin.java |

---

### 🔹 Функциональные интерфейсы

| № | Задание | Файл |
|--|--------|------|
| 11 | Consumer | Task11_Consumer.java |
| 12 | Supplier | Task12_Supplier.java |

---

### 🔹 Работа с объектами

| № | Задание | Файл |
|--|--------|------|
| 13 | Сортировка студентов | Task13_SortStudents.java |
| 14 | Фильтр студентов | Task14_FilterStudents.java |

---

### 🔹 Stream API (продвинутый уровень)

| № | Задание | Файл |
|--|--------|------|
| 15 | Цепочка операций | Task15_StreamChain.java |
| 16 | Группировка | Task16_Grouping.java |
| 17 | Reduce (сумма) | Task17_ReduceSum.java |
| 18 | distinct + limit | Task18_DistinctLimit.java |
| 19 | flatMap | Task19_FlatMap.java |
| 20 | Обработка заказов | Task20_Orders.java |

---
## 📸 Примеры выполнения

### Task3 — фильтрация
Ввод: 1 2 3 4 5
Вывод: 1 3 5
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/87553a75-35de-4b8b-b96f-450a17ddc408" />


### Task15 — цепочка Stream API
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/4da37324-6b66-452d-b551-f7f4a255a108" />

## 💡 Вывод

В ходе выполнения лабораторной работы:

- Были изучены лямбда-выражения  
- Освоены функциональные интерфейсы  
- Получен опыт работы с Stream API  
- Реализована обработка коллекций  
- Применены современные возможности Java  

---

## 🚀 Заключение

Stream API и лямбда-выражения позволяют писать:
- более компактный код  
- более читаемый код  
- функциональный стиль программирования  

---
