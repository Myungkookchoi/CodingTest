import java.util.*;

public class Testtest {
    static Integer mapSize = 2;
    static Integer[][] map = new Integer[3][mapSize];

    static void createMap(){
        for (Integer i = 0; i < map.length; i++) {
            for (Integer j = 0; j < map[0].length; j++) {
                map[i][j] = 1;
            }
        }
    }

    static void checkMap(Integer[][] map){
        for (Integer i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
    }

    static boolean minus(Integer[][] shape){
        if(minusFistCheck(shape)){
            for (Integer i = 0; i < shape.length; i++) {
                for (Integer j = 0; j < shape[0].length; j++) {
                    if (shape[i][j] == 1) {
                        map[i][j] = 0;
                    }
                }
            }
            return true;
        }
        return false;
    }

    static boolean minusFistCheck(Integer[][] shape){
        if(map[0].length > shape[0].length){
            return true;
        }
        return false;
    }

    static void removeElement() {
        Integer removeNum = 0;
        for(int i = 0; i < map.length; i++) {
            Integer[] a = map[i];
            List<Integer> b = new ArrayList<>();
            Collections.addAll(b, a);
            b.removeIf(item -> item < 1);
            map[i] = map[i] = b.toArray(new Integer[b.size()]);
        }
    }


    public static void main(String[] args) {

        Integer answer = 0;
        System.out.println("맵 생성 !!!");
        createMap();
        checkMap(map);

        Integer[][] shape1_1 = {{1, 1}, {1, 1}, {1, 1}};
        Integer[][] shape1_2 = {{1, 1, 1}, {1, 1, 1}};
        Integer[][] shape2_1 = {{1}, {1}, {1}};
        Integer[][] shape2_2 = {{1, 1, 1}};
        minus(shape2_1);
//        System.out.println("맵 에서 도형 빼기 끝");
//        System.out.println("맵 확인 시작");
//        checkMap(map);
        for(Integer i = 0; i < 500; i++){
            for(Integer j = 0; j < 500; j++){
                if(minus(shape1_1)){
                    System.out.println("1_1번 뺌");
                }else if(minus(shape1_2)){
                    System.out.println("1_2번 뺌");
                }else if(minus(shape2_2)){
                    System.out.println("2_1번 뺌");
                }else if(minus(shape2_1)){
                    System.out.println("2_2번 뺌");
                }
            }
            removeElement();
            checkMap(map);
            System.out.println("================================================");
        }

        System.out.println(" 최종 >>> ");
        checkMap(map);

//
//        Integer[][] shape1_1 = {{2}, {3}};
//        Integer[][] shape1_2 = {{3}, {2}};
//        Integer[][] shape2 = {{1}, {3}};
//
//        Integer[][] minus = {{map[0][0]-shape1_1[0][0]}, {map[1][0]-shape1_1[1][0]}};
//        System.out.println("Arrays.toString(minus = " + Arrays.toString(minus));
//
//        Integer[] qwer = {1, 2};
//        Integer[] asdf = {1, 2};
//        Integer[] zxcv = {qwer[0]-asdf[0], qwer[1]-asdf[1]};
//
//        System.out.println(Arrays.toString(zxcv));
//
//        System.out.println("answer >>> " + answer);
    }
}