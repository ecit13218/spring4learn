/**
 * Created by Administrator on 2017/5/11.
 */
public class Test {
    public static void main(String[] args) {
        int a = -64;
        int b = 4;
        System.out.println("符号右移" + (a >> b));
        //1000 0000 0000 0000 0000 0000 0100 0000 -64的原码为
        //1111 1111 1111 1111 1111 1111 1011 1111 它的反码为
        //1111 1111 1111 1111 1111 1111 1100 0000 java里负数通过补码来进行计算，它的补码为
        //1111 1111 1111 1111 1111 1111 1111 1100  右移4位后得到
        //1000 0000 0000 0000 0000 0000 0000 0011  重新取反
        //1000 0000 0000 0000 0000 0000 0000 0100  取反加1得到 结果为-8

        System.out.println("符号左移" + (a << b));


        System.out.println("无符号右移" + (a >>> b));
        //1000 0000 0000 0000 0000 0000 0100 0000 -64的原码为
        //1111 1111 1111 1111 1111 1111 1011 1111 它的反码为
        //1111 1111 1111 1111 1111 1111 1100 0000 java里通过补码来进行计算，它的补码为
        //0000 1111 1111 1111 1111 1111 1111 1100 右移4位后直接得到结果




    }
}