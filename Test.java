public class Test {
    public static void main(String[] args) {
// Не компилируется
 //Sword<Plastic> plasticSword = new Sword<>(new Plastic());

// Создаем меч с использованием steel
        Sword<Steel> steelSword = new Sword<>(new Steel());

// проверяем прочность и выводим результат на экран
        boolean isStrong = steelSword.checkEndurance();
        System.out.println("Меч из стали " + (isStrong ? "прошел" : "не прошел") + " проверку прочности");
    }
}
