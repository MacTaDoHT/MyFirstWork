package Task;

/*
   Created by: Maxim.G, GU_QA_1883

2. Добавить класс Team, который будет содержать:
        * название команды;
        * массив из четырех участников — в конструкторе можно сразу всех участников указывать;
        * метод для вывода информации о членах команды, прошедших дистанцию;
        * метод вывода информации обо всех членах команды.
3. Добавить класс Course (полоса препятствий), в котором будут находиться:
        * массив препятствий;
        * метод, который будет просить команду пройти всю полосу.
 */

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course(new Cross(300), new Wall(2),
                new Cross(800), new Water(5));

        Team team1 = new Team("Team Хозяйка и ее питомцы", new Human("Света"), new Cat("Мяут"),
                new Dog("Хрыч"), new Dog("Шарик"));

        Team team2 = new Team("Team Хозяин и его питомцы", new Human("Вася"), new Cat("Сугроб"),
                new Dog("Мухтар"), new Dog("Борман"));


        course1.doIt(team1);
        course1.doIt(team2);

        System.out.println("\n* * * * Результаты * * * *\n");
        team1.showResults();
        System.out.println();
        team2.showResults();
    }
}