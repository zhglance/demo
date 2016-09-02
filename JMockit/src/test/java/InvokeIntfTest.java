import org.junit.Test;


import mockit.Mock;
import mockit.MockUp;
import mockit.integration.junit4.JMockit;

import org.junit.Before;
import org.junit.runner.RunWith;


@SuppressWarnings("deprecation")
@RunWith(JMockit.class)
public class InvokeIntfTest
{
    InvokeIntf testObj = new InvokeIntf();

    private IDemo demo;

    @Before
    public void beforeClass()
    {
        demo = new MockUp<IDemo>()
        {
            @SuppressWarnings("unused")
            @Mock
            public RetVO getInterfaceVal(String para)
            {
                RetVO ret = new RetVO();
                ret.setValue("replacedValue");
                return ret;
            }
        }.getMockInstance();

        testObj.setDemo(demo);
    }

    @Test
    public void testPrintIntfValue()
    {
        //观察调用接口方法返回值是否替换
        testObj.printIntfValue();
    }
}
