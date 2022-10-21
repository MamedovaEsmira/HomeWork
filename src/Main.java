public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {

        System.out.println("Задача1");
        //Представим, что мы работаем в небольшой компании.
        // Данные сотрудников хранятся в
        // неструктурированном формате, и бухгалтерия попросила
        // написать программу, в которой  можно работать с Ф.И.О. сотрудников.
        // Напишите четыре строки:
        //первая с именем firstName — для хранения имени;
        //вторая с именем middleName — для хранения отчества;
        //третья с именем lastName — для хранения фамилии;
        //четвертая с именем fullName — для хранения Ф.И.О.
        // сотрудника в формате "Фамилия Имя Отчество".
        //Выведите в консоль фразу: “ФИО сотрудника — ….”
        //В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О сотрудника - " + fullName);
    }

    public static void task2() {

        System.out.println("Задача2");
//Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии
// нужны Ф.И.О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
//Напишите программу, которая изменит написание Ф. И. О. сотрудника
// с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
//В качестве строки с исходными данными используйте строку fullName.
//Результат программы выведите в консоль в формате:
// ”Данные ФИО сотрудника для заполнения отчета — ”
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);
    }

    public static void task3() {
        System.out.println("Задача 3");
//Система, в которой мы работаем, не принимает символ “ё”.
//Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
//В качестве исходных данных используйте строку fullName
// и данные в ней “Иванов Семён Семёнович”.
//Выведите результат программы в консоль в формате:
// ”Данные ФИО сотрудника — ...”

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника —" + fullName);
    }

    public static void task4() {
        System.out.println("Задача 4 ( повышенная сложность)");
        //К нам снова обратились за помощью, но теперь уже для того,
        // чтобы написать алгоритм, разбивающий одну строку
        // с Ф. И. О. на три — на фамилию, имя и отчество.
        //В качестве исходных данных используйте:
        //Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
        //строка fullName— для хранения Ф. И. О. сотрудника
        // в формате фамилия - имя - отчество;
        //переменная firstName — для хранения имени;
        //переменная middleName — для хранения отчества;
        //переменная lastName — для хранения фамилии.
        //Решите задание с помощью метода substring().
        //Результат программы выведите в формате:
        //“Имя сотрудника — …”
        //“Фамилия сотрудника — …”
        //“Отчество сотрудника — ...”
        String fullName = "Ivanov Ivan Ivanovich";
        fullName.trim();
        String lastName = fullName.substring(0, fullName.indexOf(" "));
        String firstName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
        String middleName = fullName.substring(fullName.lastIndexOf(" "));
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);
    }

    public static String task5() {

        System.out.println("Задача 5 ( повышенная сложность)");

        //Периодически данные в наших регистрах заполняются неверно, и Ф. И. О.
        // сотрудников записывают со строчных букв.
        //Такую оплошность нужно исправить, написав программу, которая преобразует
        // написанное сострочных букв Ф. И. О. в правильный формат.
        //В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“,
        // которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
        //Выведите результат программы в консоль в формате:
        // “Верное написание Ф. И. О. сотрудника с заглавных букв —  …”
        String fullName = "ivanov ivan ivanovich";
        fullName.trim();
        String lastName = fullName.substring(0, fullName.indexOf(" "));
        String firstName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
        String middleName = fullName.substring(fullName.lastIndexOf(" "));
        char[] LastName = lastName.toCharArray();
        LastName[0] = Character.toUpperCase(LastName[0]);
        lastName = String.valueOf(LastName); //Преобразовать данные массива char в строку
        char[] FirstName = firstName.toCharArray();
        FirstName[1] = Character.toUpperCase(FirstName[1]);
        firstName = String.valueOf(FirstName);
        char[] MiddleName = middleName.toCharArray();
        MiddleName[1] = Character.toUpperCase(MiddleName[1]);
        middleName = String.valueOf(MiddleName);
        fullName = lastName + firstName + middleName;
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + lastName + " " + firstName + " " + middleName);

        return fullName;
    }

    public static void task6() {
        System.out.println("Задача 6 ( повышенная сложность)");
        //Имеется две строки.
        //Первая: "135"
        //Вторая: "246"
        //Соберите из двух строк одну, содержащую данные "123456".
        //Использовать сортировку нельзя.
        //Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
        //Выведите результат в консоль в формате: “Данные строки — ….”
        String a = "135";
        String b = "246";
        StringBuilder ab = new StringBuilder();
        for (int i = 0; i < a.length() + b.length(); i++) {
            if (i % 2 == 0) {
                ab.append(a.charAt(i / 2));
            } else {
                ab.append(b.charAt(i / 2));}
                System.out.println("Данные строки — "+ab);
            }
        }
            public static void task7() {
                System.out.println("Задача 7 ( повышенная сложность)");
// Дана строка из букв английского алфавита  "aabccddefgghiijjkk".
//Нужно найти и напечатать буквы, которые дублируются в строке.
//Обратите внимание, что строка отсортирована, т.е. дубли идут друг за другом.
//В итоге в консоль должен быть выведен результат программы: "acdgijk".
                String abc = "aabccddefgghiijjkk";
                char[] setOfLetters = abc.toCharArray();
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < setOfLetters.length; i++) {
                    for (int j = i + 1; j < setOfLetters.length; j++) {
                        if (setOfLetters[i] == setOfLetters[j]) {
                            stringBuilder.append(setOfLetters[j]);
                        }
                    }
                }
                System.out.println(stringBuilder);

            }
        }

