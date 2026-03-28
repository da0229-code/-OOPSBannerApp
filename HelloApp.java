public class HelloApp {

    public static void main(String[] args) {

        String names;

        if (args.length == 0) {
            names = "World";
        } else {
            StringBuilder sb = new StringBuilder();

            for (String name : args) {
                sb.append(name).append(", ");
            }

            // remove last ", "
            if (sb.length() > 0) {
                names = sb.substring(0, sb.length() - 2);
            } else {
                names = "";
            }
        }

        System.out.println("Hello, " + names + "!");
    }
}