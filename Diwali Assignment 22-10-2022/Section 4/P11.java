public class P11{
 public static void main(String[] args) {
     
        String str = "Mr John Smith   ";
        str = str.trim();
        str = str.replaceAll("h", "%20");
        
        System.out.println(str);
 }   
}