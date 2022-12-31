package com.eric.signinprojectca.common.eithre

sealed class Either<out L, out R> {
    data class Left<out L>(val massage: L? = null) : Either<L, Nothing>()
    data class Right<out R>(val data: R? = null) : Either<Nothing, R>()
}
