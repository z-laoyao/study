package cn.laoyao.code;

public class Study01 {
    enum Size{A,B,C,D};

    public static void main(String[] args) {
//        byte a = 127;
//        Size typ = Size.A;
//        @@222"""""""""
//        System.out.println(121);
//        String s = String.join("/","S","a");
//        System.out.println(s);
//        String s = "" + "\U1D546";
//        System.out.println(s);

        // 获得码点数量
        String s = "ABC①☃";
        int cpCount = s.codePointCount(0,s.length());
        System.out.println(cpCount);
    }
}
