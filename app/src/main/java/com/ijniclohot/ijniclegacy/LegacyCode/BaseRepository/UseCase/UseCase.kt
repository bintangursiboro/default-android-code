package com.ijniclohot.ijniclegacy.LegacyCode.BaseRepository.UseCase

abstract class UseCase<Q: UseCaseRequestValue, P: UseCaseResponseValue> {
    var requestValue: Q? = null

    var useCaseCallback : UseCaseCallback<P>? = null

    internal fun run(){
        executeUseCase(requestValue)
    }

    protected abstract fun executeUseCase(requestValue: Q?)
}