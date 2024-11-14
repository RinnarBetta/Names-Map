package app;

import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    private final DataRepository dataRepository;

    // Конструктор, принимающий экземпляр DataRepository
    public DataHandler(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    // Метод для вывода всех имен с нумерацией
    public String getAll() {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(0);
        dataRepository.getData().forEach((id, name) ->
                sb.append(String.format("%d) %d, %s%n",
                        count.incrementAndGet(), id, name)
                ));
        return "\nALL NAMES:\n" + sb;
    }

    // Метод для вывода имени по заданному id
    public String getById(int id) {
        if (dataRepository.getData().containsKey(id)) {
            return "\nNAME: id " + id + ", " + dataRepository.getData().get(id);
        } else {
            return "No data!";
        }
    }
}