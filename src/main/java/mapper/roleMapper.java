package mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import pojo.Customer;
import pojo.Student;
import pojo.TStudent;

import java.util.List;
import java.util.Map;

public interface roleMapper {

//    @Select(value = "select * from student where id=#{v}")
    public Student findUserById(int id);

//    @Update(value = "update student set name=#{name} where id=#{id}")
    public void update(@Param("name1") String name,@Param("sex") String sex,@Param("id") int id);

    public void findUserByName(String name);
    public int addInsert(Student student);
    public int insertCus(Customer customer);
    public TStudent selectId(int  i);
    public List<Student> selectStu(Map map);
}
