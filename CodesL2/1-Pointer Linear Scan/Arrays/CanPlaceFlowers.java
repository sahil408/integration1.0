
public class CanPlaceFlowers {

    public static void placeflowers(int[] pots, int n) {

        if (n == 0) {
            System.out.println("Give some flowers to put in plot");
        } else {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(0);
            for (int i : pots) {
                sb.append(i);
            }
            sb.append(0);
            System.out.println(sb);
            for (int i = 1; i < sb.length(); i++) {
                if (sb.charAt(i - 1) == '0' && sb.charAt(i) == '0' && sb.charAt(i + 1) == '0') {
                    sb.setCharAt(i, '1');
                    count++;
                }
            }
            if (count >= n) {
                System.out.println("Flower placed: " + sb);
            } else
                System.out.println("Cannot place flowers");
        }
    }

    public static void main(String[] args) {
        int[] pots = { 1, 0, 1, 0, 0, 0, 1 ,0,0};
        int n = 2;
        placeflowers(pots, n);
    }
}
