public class Overriding {
    public static void main(String[] args) {
        Ramen rm1 = new Ramen();
        Ramen rm2 = new Sin();
        AnaSung an = new AnaSung();
        Ramen jja = new JjaPaGaeTi();

        rm1.print();
        rm2.print();
        an.print();
        jja.print();



    }
}

class Ramen {
    void print() {
        System.out.println("안녕하세요. 라면입니다.");
    }
}

class Sin extends Ramen {
    @Override
    public void print() {
        System.out.println("안녕하세요. 신라면입니다.");
    }
}

class AnaSung extends Ramen {
    @Override
    protected void print() {
        System.out.println("안녕하세요. 안성탕면입니다.");
    }
}

class JjaPaGaeTi extends Ramen {
    @Override
    void print() {
        System.out.println("안녕하세요. 짜파게티입니다.");
    }
}