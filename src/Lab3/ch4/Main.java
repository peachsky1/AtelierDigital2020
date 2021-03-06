package Lab3.ch4;

import Lab2.CodeChallenge2.Studio;

public class Main {
   //Observer, The teacher is the "Observed" subject and students "observe" the teacher

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student s01 = new Student("Popescu");
        Student s02 = new Student("Ionescu");
        Student s03 = new Student("Dragomirescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] javaTopics = new String[]{
                "basics", "oo", "design patterns"
        };
        for(int i=0;i<javaTopics.length;i++){
            teacher.teach(javaTopics[i]);
        }

    }
}
