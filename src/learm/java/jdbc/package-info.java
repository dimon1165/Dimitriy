/**
 * Created by Voropai_Dmytro on 22.01.17.
 */
package learm.java.jdbc;

/*
* The structure of JDBC could be 3 or 2 tier.
* If we want to work with JDBC we will need ot use:
* JDBC API - Application to JDBC Manager Connection
* JDBC Driver API - Supports JDBC Manager Connection to Driver connection.
*
* Role of Driver Manager is:
* - it is a basic service for managing a set of JDBC drivers.
* If we need to connect to Oracle database(for example) we need to load in driver manager relevant
* JDBC driver of Oracle database with help of:
* Class.forName("oracle.jdbc.driver.OracleDriver");
* Driver Manager has methods - getConnection and getDrivers.
* */
