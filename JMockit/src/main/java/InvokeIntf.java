
public class InvokeIntf
{
    //invoke interface
    private IDemo demo;


    //调用接口方法打印接口返回值
    public void printIntfValue()
    {
        RetVO ret = demo.getInterfaceVal("test1");
        System.out.println(ret.getValue());
    }

    /**
     * set
     * @param demo
     */
    public void setDemo(IDemo demo)
    {
        this.demo = demo;
    }
}
