public class App {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java1";
        String s12 = s1 + s1;
        System.out.println(s12.hashCode());
//        System.out.println((s1+s2).hashCode());
        String s3 = s1 + s2;
//        String s4 = s3.intern();
        String s5 = "javajava1";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
    }
}
