public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var result1 = firstBoxerWeight + secondBoxerWeight;
        System.out.println(result1);
        var result2 = firstBoxerWeight - secondBoxerWeight;
        System.out.println(result2);

        System.out.println("Задача 7");
        var result3 = secondBoxerWeight - firstBoxerWeight;
        System.out.println(result3);
        var result4 = secondBoxerWeight % firstBoxerWeight;
        System.out.println(result4);

        System.out.println("Задача 8");
        var generalWorkTime = 640;
        var workTime = 8;
        var people = generalWorkTime / workTime;
        System.out.println("Всего работников в компании — " + people + " человек.");

        people = people + 94;
        var workTime2 = people * workTime;
        System.out.println("Если в компании работает " + people + " человека, то всего " + workTime2 + " часа работы может быть поделено между сотрудниками.");



    }
}