package so.prelude.sdk.core

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

internal class PhantomReachableTest {

    @Test
    fun closeWhenPhantomReachable_whenObservedIsGarbageCollected_closesCloseable() {
        var closed = false
        val closeable = AutoCloseable { closed = true }

        closeWhenPhantomReachable(
            // Pass an inline object for the object to observe so that it becomes immediately unreachable.
            Any(), closeable
        )

        assertThat(closed).isFalse()

        System.gc()
        Thread.sleep(3000)

        assertThat(closed).isTrue()
    }
}
