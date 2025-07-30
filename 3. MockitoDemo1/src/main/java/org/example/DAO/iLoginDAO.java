package org.example.DAO;

public interface iLoginDAO {

    public int authenticate(String username, String password);

    public void addUser(String user, String role);

   // public String register(String user,  String role);
}
