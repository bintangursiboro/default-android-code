package com.ijniclohot.ijniclegacy.LegacyCode.BaseRepository.UseCase

interface UseCaseCallback<R> {
    fun onSuccess(response: R)
    fun onLoading()
    fun onError(t: Throwable)
}