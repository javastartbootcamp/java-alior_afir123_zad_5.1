package pl.javastart.task;

import java.util.Arrays;

public class Lecturer {
    int id;
    String degree;
    String firstName;
    String lastName;

    static int[] lecturers = new int[10];

    static void addLecturerId(int id, int[] lecturers) {
        int i=0;
        lecturers[i]=id;
        i++;
    }
}
