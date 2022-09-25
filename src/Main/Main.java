package Main;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
        dog = dog + 4;
        cat = cat + 4;
        papper = papper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        papper = papper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);

        var friends = 19;
        System.out.println(friends);
        friends = 19 + 2;
        System.out.println(friends);
        friends = friends / 7;
        System.out.println(friends);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var allWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес боксеров " +allWeight + " килогрмм!");
        var difference = boxer2Weight - boxer1Weight;
        System.out.println("разница в весел " + difference + "кг!");
        var differenceWeight = boxer2Weight % boxer1Weight;
        System.out.println("разница остатка " + differenceWeight + "кг!");



        var allTime = 640;
        var workingTime = 8;
        var employeesAmount = allTime / workingTime;
        System.out.println("Всего работников в комании " + employeesAmount + " человек.");
        var newbee = 94;
        var allEmploees = employeesAmount + newbee;
        var overTime = (newbee + employeesAmount) * workingTime;
        System.out.println("Если в компании работает всего " + allEmploees + " , то всего " + overTime + " часов может быть поделено между сотрудниками"
        );

    }


}
