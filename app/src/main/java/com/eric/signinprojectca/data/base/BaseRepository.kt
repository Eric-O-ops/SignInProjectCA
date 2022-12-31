package com.eric.signinprojectca.data.base

import com.eric.signinprojectca.common.eithre.Either
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn


abstract class BaseRepository {

    /* protected fun <T> doRequest(result: suspend () -> T) = flow {
         emit(Resource.Loading())
         try {
             emit(Resource.Success(result()))
         } catch (exception: Exception) {
             emit(Resource.Error(message = exception.localizedMessage ?: "Error"))
         }
     }*/

    protected fun <T> doRequest(request: suspend () -> T) = flow<Either<String, T>> {
        emit(Either.Right(data = request()))
    }.flowOn(Dispatchers.IO).catch { exception ->
        emit(Either.Left(massage = exception.localizedMessage ?: "Error Occurred!"))
    }
}