public class NoOverriding {
    public static void main(String[] args) {
        Ramen2 rm21 = new Ramen2();
        Sin2 sin21 = new Sin2();
        AnaSung2 anaSung2 = new AnaSung2();
        JjaPaGaeTi2 jjaPaGaeTi2 = new JjaPaGaeTi2();

        rm21.print();
        sin21.print();
        anaSung2.print();
        jjaPaGaeTi2.print();
    }
}

class Ramen2 {
    void print() {
        System.out.println("안녕하세요. 라면입니다.");
    }
}

class Sin2 {
    public void print() {
        System.out.println("안녕하세요. 신라면입니다.");
    }
}

class AnaSung2 {
    protected void print() {
        System.out.println("안녕하세요. 안성탕면입니다.");
    }
}

class JjaPaGaeTi2 {
    void print() {
        System.out.println("안녕하세요. 짜파게티입니다.");
    }
}