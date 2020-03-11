package cn.ivanlu.demo.dao;

import cn.ivanlu.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDao {
    @Select("select * from user")
    List<User> getAll();
}
