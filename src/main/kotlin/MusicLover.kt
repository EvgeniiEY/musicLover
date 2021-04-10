package ru.netology

fun main() {
    val boughtEarlierSum: Int = 10_001
    val purchaseNowSumNoDiscount: Double = 100.0
    var purchaseNowSumWithDiscount: Double
    val musicLover: Boolean = true
    var musicLoverDiscount: Double = 0.0

    val discount: Double
    if (boughtEarlierSum in 0..1000) {
        discount = 0.0
    } else if (boughtEarlierSum in 1001..10_000) {
        discount = 100.0
    } else {
        discount = purchaseNowSumNoDiscount - (purchaseNowSumNoDiscount * 0.95)
    }
    println("покупка - $purchaseNowSumNoDiscount рублей")
//    println(discount)

    purchaseNowSumWithDiscount = purchaseNowSumNoDiscount - discount
    println("после применения 5% скидки - $purchaseNowSumWithDiscount")

    if (musicLover == true) {
        musicLoverDiscount = purchaseNowSumNoDiscount - (purchaseNowSumWithDiscount * 0.99)
    }
//    println("скидка меломана $musicLoverDiscount")
    purchaseNowSumWithDiscount = purchaseNowSumNoDiscount - musicLoverDiscount

    println("после применения 1% скидки - $purchaseNowSumWithDiscount рублей")
}