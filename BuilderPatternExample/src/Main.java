import com.builder.example.Task;

import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Task task = new Task.TaskBuilder(new Random().nextLong(), "Completed").build();
        Task task2 = new Task.TaskBuilder(new Random().nextLong(), "Pending").setDescription("Typical Task")
                .setDone(false).setLocalDate(LocalDate.now()).build();

        System.out.println(task);
        System.out.println(task2);


    }
}