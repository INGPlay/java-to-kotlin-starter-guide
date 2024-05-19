package com.lannstark.lec14

fun handleCountry(country: Country) {
    /**
     * 컴파일러가 country의 모든 타입을 알고 있어
     * 다른 타입에 대한 로직(else)을 작성하지 않아도 된다.
     *
     * Enum과 Sealed Class는 when과 함께 주로 사용된다.
     */
    when(country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String
) {

    KOREA("KO"),
    AMERICA("US"),
}