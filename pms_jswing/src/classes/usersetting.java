/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.sql.ResultSet;

/**
 *
 * @author GAVASKAR S
 */
public class usersetting extends dbclass {
public String id;
public String username;
public String password;
public String email; 
public String mobileno; 
public usersetting()
        {
this.id="";
    this.username="";
    this.password="";
    this.mobileno="";
    this.email="";
}
public usersetting( String id,String username,String password,String email,String mobileno)
{
    this.id=id;
    this.username=username;
    this.password=password;
    this.mobileno=mobileno;
    this.email=email;
}
public String getid()
    {
        return this.id;
    }
public String getusername(){
        return this.username;
    }
public String getpassword(){
        return this.password;
    }
public String getmobileno(){
        return this.mobileno;
    }
public String getemail(){
        return this.email;
    }
public String create_usersetting()
 {
    String query="INSERT INTO `usersetting`(`username`, `password`, `email`, `mobileno`) VALUES ('"+ username +"','"+ password +"','"+ email +"','"+ mobileno +"')";
    String message=super.tableinsertupdatedelete(query);
    return message;
 }
 public String update_usersetting()
 {
    String query="UPDATE `usersetting` SET `username`='"+ username +"',`password`='"+ password +"',`email`='"+ email +"',`mobileno`='"+ mobileno +"' WHERE id='"+ id+"'";
    String message=super.tableinsertupdatedelete(query);
    return message;
 }
 public ResultSet retriveall_usersetting()
{
    return super.getfromtable("select * from usersetting");
}
 public ResultSet retrivewithid_usersetting()
{
    return super.getfromtable("select * from usersetting  WHERE id='"+ id +"'");
}
 public String delete_usersetting()
 {
    String query="delete from usersetting WHERE id='"+ id +"'";
    String message=super.tableinsertupdatedelete(query);
    return message;
 }
}
