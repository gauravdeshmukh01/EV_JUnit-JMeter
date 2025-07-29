package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.commons.util.StringUtils;

public class MethodAsParamTest
{

    @ParameterizedTest
    @MethodSource("org.example.Operations#checkMethodArgs")
    void checkExplicitMethodSource(String names)
    {
        Assertions.assertTrue(StringUtils.isNotBlank(names), "String is empty");
    }
}