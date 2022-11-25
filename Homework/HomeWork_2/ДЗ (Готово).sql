
-- CREATE TABLE test - создание таблички с именем test
-- (наименование столбца и тип данных)
CREATE TABLE LIST (
  id INT PRIMARY KEY,-- сурротгатный ключ , primary key - внешний ключ
  FIO TEXT, -- "TEXT" - строчка с заранее известной длиной, VARCHAR(N) - строчка на N символов
  birthday TEXT, -- Поле "Д/р" в формате строчки
  status TEXT NOT NULL, -- В вашем поле должна быть обязательно информация
  phone INT, -- "INT" - целое число
  comment TEXT,
  adress VARCHAR(45), -- VARCHAR(45) - строка на 45 символов
  bank_group TEXT -- Последнее поле, поэтому запятая в конце не ставится
);
-- Чтобы заполнить табличку, используется команда insert
-- INSERT INTO имя_таблицы VALUES (значение1, значение2)
INSERT INTO LIST VALUES (1, "Иванов И. И.", "12.02.1990", "женат", 126, "интернет", "Можга", "Работа");
INSERT INTO LIST VALUES (2, "Иванов И. И.", "12.02.1990", "женат", 127, "старый", "Можга", "Работа");
INSERT INTO LIST VALUES (3, "Иванов И. И.", "18.09.2001", "холост", 527, "личный", "Санкт-Петербург", "Школа");
INSERT INTO LIST VALUES (4, "Петров П. П.", "23.04.1983", "женат", 234, "личный", "Москва", "Родня");
INSERT INTO LIST VALUES (5, "Петров П. П.", "24.04.1983", "женат", 235, "рабочий", "Москва", "Родня");
INSERT INTO LIST VALUES (6, "Васильев В. В.", "21.05.1998", "холост", 456, "личный", "Белгород", "Друзья");
INSERT INTO LIST VALUES (7, "Сидоров С.С.", "13.07.2007", "холост", 643, "личный", "Киров", "Родня");
INSERT INTO LIST VALUES (8, "Сидоров С.С.", "13.07.2007", "холост", 654, "старый", "Киров", "Родня");
INSERT INTO LIST VALUES (9, "Александров А.А.", "05.03.1987", "женат", 412, "рабочий", "Уфа", "Друзья");
INSERT INTO LIST VALUES (10, "Борисов Б.Б", "16.08.1989", "холост", 723, "рабочий", "Москва", "Работа");
INSERT INTO LIST VALUES (11, "Михайлов М.М.", "08.01.1997", "женат", 876, "личный", "Сочи", "Университет");
INSERT INTO LIST VALUES (12, "Михайлов М.М.", "08.01.1997", "женат", 875, "рабочий", "Сочи", "Университет");
INSERT INTO LIST VALUES (13, "Кириллов К.К.", "03.12.1996", "холост", 933, "личный", "Киров", "Работа");

-- fetch - SELECT - выбор данных
-- 1 запрос: Выбор всех столбцов и печать на экран

SELECT * FROM LIST; 
SELECT "";
-- 1 запрос д/з SELECT ФИО, Д/р, Адрес FROM Общий список
SELECT FIO , birthday, adress FROM  LIST  ;
-- Отделим запросы друг от друга
SELECT "";

 -- 2 запрос д/з SELECT ФИО, Статус FROM Общий список WHERE Адрес = «Можга»
SELECT FIO, status , adress
FROM LIST
WHERE adress = "Можга";
SELECT "";

 -- 3 запрос д/з SELECT ФИО FROM Общий список WHERE Адрес = «Москва» AND Группа = «Работа»
SELECT FIO, adress, bank_group
FROM LIST
WHERE adress = "Москва" AND bank_group = "Работа" ;
SELECT "";

-- 4 запрос д/з SELECT Д/р FROM Общий список WHERE Адрес = «Москва» OR Группа = «Работа»
SELECT FIO, birthday, adress, bank_group
FROM LIST
WHERE adress = "Москва" OR bank_group = "Работа" ;



CREATE TABLE PEOPLE(
id INT primary key,
FIO TEXT, 
birthday TEXT,
status TEXT
);
INSERT INTO PEOPLE VALUES (1, "Иванов И. И.", "12.02.1990", "женат");
INSERT INTO PEOPLE VALUES (2, "Иванов И. И.", "18.09.2001", "холост");
INSERT INTO PEOPLE VALUES (3, "Петров П. П.", "23.04.1983", "женат");
INSERT INTO PEOPLE VALUES (4, "Васильев В. В.", "21.05.1998", "холост");
INSERT INTO PEOPLE VALUES (25, "Кузьмин К.К.", "21.05.2020", "холост");


CREATE TABLE PHONE(
whose_phone INT,
phone INT,
comment TEXT
);
INSERT INTO PHONE VALUES (1, 123, "личный");
INSERT INTO PHONE VALUES (1, 124, "рабочий");
INSERT INTO PHONE VALUES (1, 125, "для поездок");
INSERT INTO PHONE VALUES (1, 126, "интернет");
INSERT INTO PHONE VALUES (1, 127, "старый");
INSERT INTO PHONE VALUES (2, 527, "личный");
INSERT INTO PHONE VALUES (3, 234, "личный");
INSERT INTO PHONE VALUES (3, 235, "рабочий");
INSERT INTO PHONE VALUES (4, 456, "личный");
INSERT INTO PHONE VALUES (11, 999, "личный");
INSERT INTO PHONE VALUES (12, 997, "рабочий");
INSERT INTO PHONE VALUES (13, 995, "личный");
INSERT INTO PHONE VALUES (14, 993, "для поездок");
INSERT INTO PHONE VALUES (15, 991, "для поездок");

CREATE TABLE ADRESS(
whose_adress INT,
adress TEXT,
comment TEXT
);
INSERT INTO ADRESS VALUES (1, "Можга", "Место рождения");
INSERT INTO ADRESS VALUES (1, "Казань", "По прописке");
INSERT INTO ADRESS VALUES (1, "Москва", "Рабочий");
INSERT INTO ADRESS VALUES (2, "Санкт-Петербург", "По прописке");
INSERT INTO ADRESS VALUES (3, "Москва", "По прописке");
INSERT INTO ADRESS VALUES (4, "Белгород", "По прописке");
INSERT INTO ADRESS VALUES (5, "Уфа", "По прописке");
INSERT INTO ADRESS VALUES (6, "Сочи", "По прописке");
INSERT INTO ADRESS VALUES (7, "Киров", "Рабочий");
INSERT INTO ADRESS VALUES (8, "Владивосток", "Место рождения");
INSERT INTO ADRESS VALUES (9, "Рязань", "Рабочий");
INSERT INTO ADRESS VALUES (10, "Хабаровск", "Место рождения");

SELECT * FROM PEOPLE
INNER JOIN ADRESS
ON id = whose_adress;
SELECT "";

SELECT * FROM PEOPLE
LEFT JOIN ADRESS
ON id = whose_adress;
SELECT "";


SELECT * FROM PEOPLE
RIGHT JOIN ADRESS
ON id = whose_adress;
SELECT "";

SELECT * FROM PEOPLE
LEFT JOIN ADRESS
ON id = whose_adress
UNION

SELECT * FROM PEOPLE
RIGHT JOIN ADRESS
ON id = whose_adress;
SELECT "";

-- 9 запрос д/з Дополнительное задание. (Это один большой запрос) 
-- Что будет результатом выборки:
-- SELECT ФИО, Адрес, Комментарий FROM Люди RIGHT JOIN Адреса ON id = Чей
-- Адрес
SELECT FIO, adress, comment
FROM PEOPLE
RIGHT JOIN ADRESS
ON id = whose_adress;
SELECT "";

