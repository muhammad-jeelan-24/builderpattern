package com.builder.example;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Task {

    private final long id;
    private final String name;
    private final String summary = "";
    private String description = "";
    private boolean done = false;
    private LocalDate localDate;

    public static class TaskBuilder {

        private final long id;
        private final String name;
        private final String summary = "";
        private String description = "";
        private boolean done = false;
        private LocalDate localDate;

        public TaskBuilder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public TaskBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder setDone(boolean done) {
            this.done = done;
            return this;
        }

        public TaskBuilder setLocalDate(LocalDate localDate) {
            this.localDate = localDate;
            return this;
        }
        public Task build(){
            return  new Task(this);
        }
    }

    public Task(TaskBuilder taskBuilder) {
        this.id =taskBuilder.id;
        this.name = taskBuilder.name;
        this.description = taskBuilder.description;
        this.done = taskBuilder.done;
        this.localDate = taskBuilder.localDate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Task.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("summary='" + summary + "'")
                .add("description='" + description + "'")
                .add("done=" + done)
                .add("localDate=" + localDate)
                .toString();
    }
}
