public class Printer {
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
