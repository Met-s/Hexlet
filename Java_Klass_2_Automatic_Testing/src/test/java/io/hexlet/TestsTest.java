//package io.hexlet;
//
//public class TestsTest {
//}


package io.hexlet;

import io.hexlet.modul.MethodsTest_44;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.BeforeAll;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

import static org.assertj.core.api.Assertions.assertThat;

class TestsTest {

    private static Launcher launcher;
    private static SummaryGeneratingListener listener;
    private static LauncherDiscoveryRequest request;

    @BeforeAll
    public static void beforeAll() {
        launcher = LauncherFactory.create();
        listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener);
        request = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectClass(MethodsTest_44.class))
                .build();
    }

    @ParameterizedTest
    @ValueSource(strings = {"wrong1", "wrong2", "wrong3", "wrong4"})
    public void testWrongImplementations(String implementation) {
        Methods.setImplementation(implementation);

        launcher.execute(request);
        var summary = listener.getSummary();

        assertThat(summary.getTestsFailedCount() == 0)
                .as("The tests should have failed, but they passed")
                .isFalse();
    }
}
