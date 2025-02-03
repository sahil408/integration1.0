public class codetocapitalisefirstletterofstring {

    public static void main(String[] args) {
        String str = "we had a nice day";
        String[] s = str.split(" ");
        StringBuilder capitalizedString = new StringBuilder();

        if (str == null || str.isEmpty()) {
            System.out.println(str);
        }
        
        for (String word : s) {
            if (word.length() > 0) {
                capitalizedString.append(Character.toUpperCase(word.charAt(0)))
                        .append((word.substring(1)))
                        .append(" ");
            }
        }
        System.out.println(capitalizedString.toString().trim());
    }
}
