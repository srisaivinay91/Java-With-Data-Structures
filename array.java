import java.util.Arrays;

public class array {
    public static void main(String[] args) {
    int[] array = {10,59,89,60};
        /*float a = 234.5677f;
        System.out.println(array[2]);
        System.out.println(Arrays.toString(array));
        System.out.printf("foramated string %.2f",a);
        System.out.println(" ");
        System.out.println(Math.PI);
        System.out.println((char)('a'+8));*/
        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            //System.out.println(ch);
            series += ch;
        }
        System.out.println(series);

        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            //System.out.println(ch);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.deleteCharAt(0);
        //System.out.println(builder.toString());
        builder.replace(1,2, series);
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder.toString());

        String name = "Sri sai vinay";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
    }
}
