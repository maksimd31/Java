package Homework.HomeWork_2;
import java.util.HashMap;
import java.util.Map;
public class task_1 {
    public static void main(String[] args) {
        Map<String, String> params1 = new HashMap<>();
//            HashMap(Map<? extends K,? extends V> m)
//            Создает новую карту хэш-карты с теми же сопоставлениями, что и указанная карта.
        params1.put("name","Ivanov");
        params1.put("country","Russia");
        params1.put("city","Moscow");
        params1.put("age",null);
        //put(K key, V value)
        //Связывает указанное значение с указанным ключом на этой карте.
        System.out.println(getA(params1)); //Вывод на экран метода
            }
            public static String getA(Map<String, String> Serch) // метод поиска
//              HashMap(Map<? extends K,? extends V> m)
////            Создает новую карту хэш-карты с теми же сопоставлениями, что и указанная карта.
            {
                StringBuilder s = new StringBuilder();
                for (Map.Entry<String,String> P : Serch.entrySet()) //Метод возвращает набор, имеющий те же элементы, что и хэш-карта.
                {
                    if (P.getValue() != null) {
                        s.append(P.getKey() +" = '" + P.getValue()+"' and ");
                    }
                }
                s.delete(s.toString().length()-5,s.toString().length());
                return s.toString();
            }

        }
/*
### 1.Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

Разяснение запроса WHERE пример sql запроса с условие where:
SELECT * FROM student WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow' and age = 'null'
означает выбрать все столбы (*) в таблице student, где поля name имеет значение Ivanov и country =  и т.д.
требуется вывести строку в таком формате (часть запроса после WHERE) из Map, порядок полей  не важен.
/*
Объекты String являются неизменяемыми, поэтому все операции, которые изменяют строки,
фактически приводят к созданию новой строки, что сказывается на производительности приложения.
Для решения этой проблемы, чтобы работа со строками проходила с меньшими издержками в Java
были добавлены классы StringBuffer и StringBuilder. По сути они напоминает расширяемую строку,
которую можно изменять без ущерба для производительности.
Эти классы похожи, практически двойники, они имеют одинаковые конструкторы, одни
и те же методы, которые одинаково используются. Единственное их различие состоит в том, что
класс StringBuffer синхронизированный и потокобезопасный. То есть класс StringBuffer удобнее
использовать в многопоточных приложениях, где объект данного класса может меняться в различных
потоках. Если же речь о многопоточных приложениях не идет, то лучше использовать класс
StringBuilder, который не потокобезопасный, но при этом работает быстрее, чем StringBuffer
в однопоточных приложениях.
 */
