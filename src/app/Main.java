package app;

public class Main {

    public static void main(String[] args) {
        DataRepository dataRepository = new DataRepository();
        DataHandler handler = new DataHandler(dataRepository);
        UIOperator uiOperator = new UIOperator();

        // Вывод всех имен
        uiOperator.getOutput(handler.getAll());

        // Вывод имени по id
        uiOperator.getOutput(handler.getById(1));
        uiOperator.getOutput(handler.getById(172)); // Пример для несуществующего id
    }
}