public class Overloading {
    public static void main(String[] args) {
        Printer ol = new Printer();
        ol.print();
        ol.print("Hello", "World");
        ol.print(1, 2);
        System.out.println("==========구분선==========");
        ol.print();
        ol.print(ol.print("Hello"), ol.print("World"));
        ol.print(ol.print(12), ol.print(23));
        System.out.println("==========구분선==========");
        ol.print();
        System.out.println(ol.print("안녕하세요. 최명국입니다."));
        System.out.println(ol.print(192837));
    }
}

class Printerd {
    public void print() {
        System.out.println("프린트 완료");
    }

    void print(String a, String b) {
        print(a);
        System.out.println("문자열 프린트 할 내용 : " + a + ", " + b);
        print();
    }

    public String print(String a){
        return a;
    }

    void print(int a, int b) {
        print(a);
        System.out.println("숫자 프린트 할 내용 : " + a + ", "  + b);
        print();
    }

    public int print(int a) {
        return a;
    }

}
