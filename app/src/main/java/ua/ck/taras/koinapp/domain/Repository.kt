package ua.ck.taras.koinapp.domain

interface Repository {
    fun saveFile(): Boolean
    fun getFile(): String
}