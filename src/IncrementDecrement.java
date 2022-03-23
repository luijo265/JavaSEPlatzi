public class IncrementDecrement {

    public static void main(String[] args) {

        int lives = 5;
        lives--;
        System.out.println(lives);

        //prefija
        // gana un regalo por ganar vida
        int gift = 100 + lives++;
        System.out.println(gift);

        gift = 100 + ++lives;
        System.out.println(gift);

    }

}
