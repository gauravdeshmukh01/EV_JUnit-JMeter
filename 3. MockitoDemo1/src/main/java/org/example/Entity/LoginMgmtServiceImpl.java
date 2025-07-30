package org.example.Entity;

import org.example.DAO.iLoginDAO;
import org.example.Service.ILoginMgmtService;

public  class LoginMgmtServiceImpl implements ILoginMgmtService {

    private iLoginDAO loginDAO;

    public LoginMgmtServiceImpl(iLoginDAO loginDAO) {

        this.loginDAO = loginDAO;
    }

    @Override
    public boolean login(String username, String password) {
        if (username.equals("") || password.equals("")) {
            throw new IllegalArgumentException("empty credentials");
        }

        int count = loginDAO.authenticate(username, password);

        if (count == 0)
            return false;
        else
            return true;
    }

//    @Override
//    public int addUser(String user, String role) {
//        return 0;
//    }

    @Override
    public String registerUser(String user, String role) {
        if ((!role.equalsIgnoreCase("admin")) && (!role.equalsIgnoreCase("visitor")))
        {
            loginDAO.addUser(user, role);
            return "userAdded";
        } else {
            return "user not added";
        }
    }


}
