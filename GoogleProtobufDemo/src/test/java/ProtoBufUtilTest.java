import java.util.Arrays;

/**
 * Created by zhangzh on 2017/2/20.
 */
public class ProtoBufUtilTest {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("lance");
        student.setAge(28);
        student.setStudentNo("2011070122");
        student.setSchoolName("BJUT");

        byte[] serializerResult = ProtoBufUtil.serializer(student);

        System.out.println("serializer result:" + Arrays.toString(serializerResult));

        Student deSerializerResult = ProtoBufUtil.deserializer(serializerResult,Student.class);

        System.out.println("deSerializerResult:" + deSerializerResult.toString());
    }

}
