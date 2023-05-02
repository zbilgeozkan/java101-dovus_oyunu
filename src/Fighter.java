public class Fighter {
    String name;
    int damage, health, weight, dodge;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + " hit " + this.damage + " damage. ");
        if (foe.isDodge()) {
            System.out.println(foe.name + " blocked the damage. ");
            return foe.health;
        }
        return Math.max(foe.health - this.damage, 0);
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

}