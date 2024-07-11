public class ColorSelector {
    public static void main(String[] args) {
        String colorLetter = UserDialogs.getColorLetter();
        String colorName = getColorName(colorLetter);
        System.out.println("The color is: " + colorName);
    }

    private static String getColorName(String colorLetter) {
        switch (colorLetter) {
            case "R":
                return "Red";
            case "G":
                return "Green";
            case "B":
                return "Blue";
            case "Y":
                return "Yellow";
            default:
                return "Unknown";
        }
    }
}