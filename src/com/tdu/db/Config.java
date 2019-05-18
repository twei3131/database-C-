package com.tdu.db;

public class Config 
{
	private String addr;
	private String user;
	private String password;
	private String database;
	private Integer port;
	public String getAddr() 
	{
		return addr;
	}
	public void setAddr(String addr)
	{
		this.addr = addr;
	}
	public String getUser() 
	{
		return user;
	}
	public void setUser(String user) 
	{
		this.user = user;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getDatabase() 
	{
		return database;
	}
	public void setDatabase(String database)
	{
		this.database = database;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) 
	{
		this.port = port;
	}
	
	public Config()
    {
		port = port == 0 ? Prop.port : port;
        user = user == null ? Prop.user : user;
        password = password == null ? Prop.password : password;
        addr = addr == null ? Prop.addr : addr;
    }
	
	public String GenConnStr()
    {
        return "server="+addr+";port="+port+";user id="+user+";password="+password+";database="+database+";";
    }
}
