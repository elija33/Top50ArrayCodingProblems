package ClassPhotograph;

public class Students {
    public static int StudentsStand(int Student[]) {
        int count = 0;
        for (int i = 0; i < Student.length - 1; i++) {
            if (i != Student.length && Student[i] > Student[i + 1]) {
                count++;
            } else if (0 != i && Student[i] < Student[i - 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int Student[] = { 1, 1, 2, 3, 1, 3, 2 };
        System.out.println(StudentsStand(Student));
    }
}