package io.github.jackbeback.klib.Utility

val log = Piper()

class Piper(val level: Int = 3) {



    fun i(message: String) {
        if (level >= 1) {
            p(message)
        }
    }

    fun d(message: String) {
        if (level >= 2) {
            p(message)
        }
    }

    fun e(message: String) {
        if (level >= 0) {
            p(message)
        }
    }

    private fun p(message: String) {
        println(message)
    }
}

