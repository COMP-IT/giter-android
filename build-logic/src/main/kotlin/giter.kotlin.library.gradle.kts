import com.comp.giter.configureKotest
import com.comp.giter.configureKotlin

plugins {
    kotlin("jvm")
    id("giter.verify.detekt")
}

configureKotlin()
configureKotest()