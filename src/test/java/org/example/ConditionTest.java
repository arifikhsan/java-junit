package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionTest {
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testOnWindows() {
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    public void testDisabledOnWindows() {
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testEnabledOnJava8() {
    }

    @Test
    @DisabledOnJre(JRE.JAVA_17)
    void testDisabledOnJava8() {
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_18)
    void testEnabledOnJavaRange() {
    }

    @Test
    @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    void enableOnOracle() {
    }

    @Test
    @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    void disableOnOracle() {
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    void enabledOnProfileDev() {
    }

    @Test
    @DisabledOnOs(OS.MAC)
    @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    void disabledOnProfileDev() {
    }
}
