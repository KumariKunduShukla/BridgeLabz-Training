package com.junit.databaseconnectiontesting;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class DatabaseConnectionTest {

    DatabaseConnection db;

    @Before
    public void setUp() {
        db = new DatabaseConnection();
        db.connect();          // runs before Each test
    }

    @After
    public void tearDown() {
        db.disconnect();       // runs after Each test
    }

    @Test
    public void testConnectionIsEstablished() {
        assertTrue(db.isConnected());
    }

    @Test
    public void testConnectionStillActiveDuringTest() {
        assertTrue(db.isConnected());
    }
}