package com.codegym.dao;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;
    public boolean deleteUserProcedure(int id);

    public boolean updateUser(User user) throws SQLException;
    public List<User> selectByCountry(String country) throws SQLException;

    List<User> selectUserNameIn();

    List<User> selectUserNameDe();
    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;
    void addUserTransaction(User user, int[] permision);
    public void insertUpdateWithoutTransaction();
    public void insertUpdateUseTransaction();
    public List<User> selectAllUsersProcedure();
    public void updateUserProcedure(User user);
}