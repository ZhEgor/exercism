package com.zhiroke.exercise_1

fun twofer(name: String? = null): String {
    return "One for ${name ?: "you"}, one for me."
}