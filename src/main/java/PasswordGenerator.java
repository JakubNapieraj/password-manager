import java.util.HashSet;
import java.util.Set;

public class PasswordGenerator {

    public String generatePassword(int lenght) {

        final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890!@#$%^&*()";
        final java.util.Random random = new java.util.Random();
        final Set<String> identifires = new HashSet<String>();

        StringBuilder builder = new StringBuilder();

        while (builder.toString().length() == 0) {

            for (int i = 0; i < lenght; i++) {
                builder.append(lexicon.charAt(random.nextInt(lexicon.length())));
            }

            if (identifires.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }
}
