import java.security.SecureRandom;

public class SecureRandomExample {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);
        System.out.println(random.getAlgorithm());
    }
}
