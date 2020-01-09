package ua.ck.taras.koinapp.data

import ua.ck.taras.koinapp.data.service.FileSystemDataSource
import ua.ck.taras.koinapp.domain.Repository

class RepositoryImpl(
    private val fileSystemDataSource: FileSystemDataSource
) : Repository {

    override fun saveFile(): Boolean {
        return fileSystemDataSource.setFile()
    }

    override fun getFile(): String {
        return fileSystemDataSource.getFile()
    }
}