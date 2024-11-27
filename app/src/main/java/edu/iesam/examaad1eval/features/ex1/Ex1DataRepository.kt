package edu.iesam.examaad1eval.features.ex1

import android.content.Context

class Ex1DataRepository(
    private val context: Context,
    private val ex1RemoteDataSource: MockEx1RemoteDataSource) {

    private val sharedPreferences = context.getSharedPreferences("db-exam", Context.MODE_PRIVATE)

    private val editor = sharedPreferences.edit()

    fun getUsers(users: List<User>) {
        if (users.isEmpty()) {
            editor.apply {
                users.forEach { users ->
                    ex1RemoteDataSource.getUsers()
                }
            }
        } else {
            editor.putString("user", users.toString())
        }
    }

    fun getItems(items: List<Item>) {
        if (items.isEmpty()) {
            editor.apply {
                items.forEach { items ->
                    ex1RemoteDataSource.getItems()
                }
            }
        } else {
            editor.putString("item", items.toString())
        }
    }

    fun getServices(services: List<Services>) {
        if (services.isEmpty()) {
            editor.apply {
                services.forEach { services ->
                    ex1RemoteDataSource.getServices()
                }
            }
        } else {
            editor.putString("service", services.toString())
        }
    }
}