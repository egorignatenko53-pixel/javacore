package first;

public class HTTP {
    public static void main(String[] args) {
        int statusCode = 300;

        if (statusCode >= 200 && statusCode <= 299) {
            System.out.println("Успех");
        } else if (statusCode >= 400 && statusCode <=499) {
            System.out.println("Ошибка клиента");
        } else if (statusCode >= 500 && statusCode <=599) {
            System.out.println("Ошибка сервера");
        } else {
            System.out.println("Неизвестный код");
        }
    }
}
