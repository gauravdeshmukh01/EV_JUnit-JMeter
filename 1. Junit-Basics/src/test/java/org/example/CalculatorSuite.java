package org.example;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AdditionTest.class, DivisionTest.class, MultiplicationTest.class})
@IncludeTags({"Success", "failure"})
@ExcludeTags("Slow")
public class CalculatorSuite {

}
