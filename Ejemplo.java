public class Ejemplo {
    public static void main(String[] args){
        String greetingA = "Hello World!";
        String greetingB = "Hello World!";

        System.out.println(greetingA.charAt(7));
        System.out.println(greetingA.compareTo(greetingB));
        System.out.println(false);
        System.out.println(greetingA.equals(greetingB));
        System.out.println(greetingA.indexOf('1'));
        System.out.println(greetingA.length());
        System.out.println(greetingA.replace('1', 'x'));
        System.out.println(greetingA.toLowerCase());
        System.out.println(greetingA.toUpperCase());
    }
}
