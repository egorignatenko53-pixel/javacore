package first;

public class variables {
    public static void main(String[] args) {
        String name = "Egor";               /// переменные - наименование
        int age = 21;                       /// переменные - цифры
        double height = 1.80;               /// переменные - дробные числа
        boolean islearningjava = true;      /// переменные - значение true или false
        int nextYearAge = age+1;

        System.out.println("Меня зовут Егор : " + name);
        System.out.println("Мой возраст : " + age);
        System.out.println("Мой рост составляет : " + height);
        System.out.println("Я изучаю Java : " + islearningjava);
        System.out.println("В следющем году мне будет  : " + nextYearAge);
        System.out.println(7/2);                 /// деление
        System.out.println(7.0/2);               /// деление дробных чисел
        System.out.println(7%2);                 /// деление и вывод остатка
    }
}
