package course;
public class Main {
    public static void main(String[] args) {

        String s = "potato apple lemon banana cherry avocado pear watermelon";
        String[] vect = s.split(" ");

        /*
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
         */

        // Para cada "value" do tipo String dentro do meu vetor, da um print no "value"
        for (String value : vect) {
            System.out.println(value);
        }

    }
}