package mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import pojo.Customer;
import pojo.Student;
import pojo.TStudent;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {


        testSql();
//        testStream();
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        Optional<Integer> reduce = list.stream().reduce(Integer::min);
//        System.out.println(reduce.get());
    }


    public static void testStream() {
        List<Dish> menu = Arrays.asList(new Dish("pork",false,800,Dish.Type.MEAT),
                new Dish("beef",false,700,Dish.Type.FISH),
                new Dish("chicken",false,400, Dish.Type.MEAT),
                new Dish("french fried",true,530, Dish.Type.OTHER),
                new Dish("rice",true,350, Dish.Type.OTHER),
                new Dish("season fruit",true,120,Dish.Type.OTHER),
                new Dish("pizza",true, 550, Dish.Type.OTHER),
                new Dish("prawns",false,300, Dish.Type.FISH),
                new Dish("salmon",false,450, Dish.Type.FISH)

        );
//        menu.stream().collect(Collectors.reducing((d1,d2)->d1.getName()+d2.getName()));

//        List<Integer> list = menu.stream().map(Dish::getName).map(String::length).collect(Collectors.toList());
//        for(Integer integer: list) {
//            System.out.println(integer);
//        }
    }
    public static void testSql() throws IOException {
        String resource="mybatis/sqlMapConfig.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource );
        //创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);
        //创建sqlSession
        SqlSession session=sqlSessionFactory.openSession();
        //执行sql语句
        roleMapper mapper = session.getMapper(roleMapper.class);
//        List list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);

        int[] arrays = new int[]{1,2,3};
        Map map = new HashMap();
        map.put("ids",arrays);
        List<Student> student = mapper.selectStu(map);
        System.out.println("ok");
//        mapper.findUserByName("caofeng13");
//        Student student = new Student();
//        student.setName("caofangfang111");
//        student.setSex("2");
//        mapper.addInsert(student);
//        System.out.println(student.getId());
//        Customer customer = new Customer();
//        customer.setName("caochong1");
//        int i = mapper.insertCus(customer);
//        System.out.println(customer.getId()+":"+i);
//        TStudent tStudent = mapper.selectId(1);
//        mapper.select(1);
//        System.out.println(tStudent.getCname());
//        session.commit();
//        SqlSession sqlSession1 = sqlSessionFactory.openSession();
//        roleMapper mapper1 = sqlSession1.getMapper(roleMapper.class);
//        mapper1.selectId(1);
//        sqlSession1.commit();

//        System.out.println(tStudent.gettStudentSelfCard().getNative1());


//        mapper.update("caofeng","1",1);
//        Student stu = mapper.findUserById(1);
//        System.out.println(stu);

    }
}
