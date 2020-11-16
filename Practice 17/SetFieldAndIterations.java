public class SetFieldAndIterations {
    public static void doIt(int width, int height, int iterations) {
        Conway2D field = new Conway2D(width, height);
        field.randomSeed();
        for (int i=0; i<iterations; i++) {
            StringBuilder stringField = new StringBuilder();
            field.iterate();
            for (int j = 0; j < width * height; j++) {
                if (j % width == 0) stringField.append("\n");
                stringField.append(field.getData()[j]);
            }
            System.out.println(stringField);
        }
    }
}
