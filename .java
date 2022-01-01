public class Main {
    public static void main(String[] args) {
        String announcement = "Say yes to all the good in the world";
        String announcement2 = "Say yes to determination over laziness";
        String announcement3 = "Do not be afraid to ask";
        System.out.println(announcement);
        System.out.println(announcement2);
        System.out.println(announcement3);
        int length = announcement.length() + announcement2.length() + announcement3.length();
        System.out.println("Sum of signs in sentences is: " + length);
    }
}
