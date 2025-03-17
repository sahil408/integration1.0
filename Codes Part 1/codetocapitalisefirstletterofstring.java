public class codetocapitalisefirstletterofstring {

    public static void capitalisedstring(String str){

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

    public static void main(String[] args) {
        String s = "we had a nice day";
        capitalisedstring(s);
    }
}
