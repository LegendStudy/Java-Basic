package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        // `Student` 클래스를 기반으로 student1, student2 인스턴스를 생성한다.
        // 그리고 필요한 값을 채워둔다.
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 배열에 참조값 대입
        Student[] students = new Student[2];

        // 배열에 객체를 보관
        students[0] = student1;
        students[1] = student2;

        // 배열에 들어있는 객체 사용
        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);
    }
}