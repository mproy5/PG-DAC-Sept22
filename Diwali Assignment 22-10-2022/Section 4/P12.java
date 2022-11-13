public class P12{
    public static void main(String[] args) {
        String str = "Java is Great";
        str = str.trim();

        str = str.replaceAll(" ", "%20");
         
        // Display the result
        System.out.println(str);
    }
}