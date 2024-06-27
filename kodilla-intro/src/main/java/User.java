public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Ambroży", 15),
                new User("Cyprian", 34),
                new User("Małgorzata", 27),
                new User("Oliwia", 55),
                new User("Pankracy", 41),
                new User("Zofia", 22)
        };

        // Obliczanie sumy wieku
        int sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }

        // Obliczanie średniej wieku
        double averageAge = sum / (double) users.length;

        // Wyświetlanie imion użytkowników, których wiek jest poniżej średniej
        System.out.println("Użytkownicy poniżej średniej wieku (" + averageAge + "):");
        for (User user : users) {
            if (user.getAge() < averageAge) {
                System.out.println(user.getName());
            }
        }
    }
}

