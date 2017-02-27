/**
 * Created by zhangzh on 2017/2/6.
 */
public class TTest {

    public static class FX<T> {
        private T ob; // 定义泛型成员变量

        public FX(T ob) {
            this.ob = ob;
        }

        public T getOb() {
            return ob;
        }

        public void showTyep() {
            System.out.println("T的实际类型是: " + ob.getClass().getName());
        }
    }

    public static class FXImpl extends FX<String> {


        public FXImpl(String ob) {
            super(ob);
        }
    }

    public static class FXImpl2<T extends FX> {

        private T ob;

    }

    public static void main(String[] args) {

        FX<Integer> intOb = new FX<Integer>(100);
        intOb.showTyep();
        System.out.println("value= " + intOb.getOb());
        System.out.println("----------------------------------");

        FX<String> strOb = new FX<String>("CSDN_SEU_Calvin");
        strOb.showTyep();
        System.out.println("value= " + strOb.getOb());



        FXImpl impl2 = new FXImpl("2323425");



        FXImpl2 impl = new FXImpl2();

    }
}
