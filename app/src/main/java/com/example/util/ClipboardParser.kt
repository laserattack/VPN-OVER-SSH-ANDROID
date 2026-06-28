package com.example.util

fun parseServerData(text: String): ServerData? {
    val lines = text.split("\n").map { it.trim() }.filter { it.isNotEmpty() }
    if (lines.size < 5) return null
    return ServerData(
        name = lines[0],
        ip = lines[1],
        port = lines[2].toIntOrNull() ?: 22,
        username = lines[3],
        password = lines[4]
    )
}

data class ServerData(
    val name: String,
    val ip: String,
    val port: Int,
    val username: String,
    val password: String
)
