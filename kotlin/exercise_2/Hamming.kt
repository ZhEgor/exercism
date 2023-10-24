package com.zhiroke.exercise_2

object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.length != rightStrand.length) {
            throw IllegalArgumentException("left and right strands must be of equal length")
        }
        return leftStrand.filterIndexed { index, singlePiece  ->
            singlePiece != rightStrand[index]
        }.length
    }
}