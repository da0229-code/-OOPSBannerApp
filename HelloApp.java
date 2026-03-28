public class HelloApp {

    public static void main(String[] args) {

        String names;

        if (args.length == 0) {
            names = "World";
        } else {
            StringBuilder sb = new StringBuilder();

            for (String name : args) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(name);
            }

            names = sb.toString();
        }

        System.out.println("Hello, " + names + "!");
    }
}