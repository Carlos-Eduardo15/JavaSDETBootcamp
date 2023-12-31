package com.ti.sesionone.jdbc;

public enum DataBaseInfo {
    DBHOST(PropertyManager.getInstance().getProperty("DBHost")),
    DBPORT(PropertyManager.getInstance().getProperty("DBPort")),
    DBUSERNAME(PropertyManager.getInstance().getProperty("DBUserName")),
    DBPASSWORD(PropertyManager.getInstance().getProperty("DBPassword")),
    DBNAME(PropertyManager.getInstance().getProperty("DBStudent"));
    final String dbConn;
    DataBaseInfo(String dbConn){this.dbConn = dbConn;}
}
