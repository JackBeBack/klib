package io.github.jackbeback.klib.Utility

/**
 * Maps a value `x` from one range [`a`, `b`] to another range [`c`, `d`].
 *
 * @param x The input value to map.
 * @param a The lower bound of the input range.
 * @param b The upper bound of the input range.
 * @param c The lower bound of the output range.
 * @param d The upper bound of the output range.
 * @return The mapped value within range [`c`, `d`], preserving the type of `T`.
 * @throws IllegalArgumentException If the type `T` is not supported.
 */
inline fun <reified T : Number> map(x: T, a: T, b: T, c: T, d: T): T {
    // Normalize x to the range [0, 1] based on the input range [a, b].
    val normalized = (x.toDouble() - a.toDouble()) / (b.toDouble() - a.toDouble())

    // Scale and shift the normalized value to the output range [c, d].
    val result = c.toDouble() + normalized * (d.toDouble() - c.toDouble())

    // Return the result as the specific type T. Throw exception if type is unsupported.
    return when (T::class) {
        Int::class -> result.toInt() as T // Cast result to Int.
        Float::class -> result.toFloat() as T // Cast result to Float.
        Long::class -> result.toLong() as T // Cast result to Long.
        Double::class -> result as T // Cast result to Double (already Double).
        else -> throw IllegalArgumentException("Unsupported number type: ${T::class}")
    }
}