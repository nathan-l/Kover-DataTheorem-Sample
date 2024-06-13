package kotlinx.kover.test.android

import org.junit.Test

import org.junit.Assert.*


class LocalTests {
    @Test
    fun testDebugUtils() {
        assertEquals(3, Maths.sum(1, 2))
    }

    @Test
    fun testDebugUtils2() {
        assertEquals(-1, Maths.sub(1, 2))
    }
}