package com.infosys;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        ValidEmployeeServiceTest.class,
        InvalidEmployeeServiceTest.class,
        EmployeeServiceCSVTest.class
})
@IncludeTags({"valid"})
public class TestSuite {
}

