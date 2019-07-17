package service;

import dao.UserDao;
import dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{
   /* @Autowired*/
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void delete() {
        userDao.delete();
    }
}
