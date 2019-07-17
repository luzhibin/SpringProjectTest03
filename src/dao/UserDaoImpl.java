package dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

    @Override
    public void delete() {
        System.out.println("删除操作s");
    }
}
