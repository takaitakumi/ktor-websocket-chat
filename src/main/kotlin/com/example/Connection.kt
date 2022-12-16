package com.example

import io.ktor.websocket.*
import java.util.concurrent.atomic.AtomicInteger

/**
 * @author： tomgao
 * @date：  2022-12-16 20:22
 * @Description:
 */

class Connection(val session: DefaultWebSocketSession) {
    companion object {
        val lastId = AtomicInteger(0)
    }
    val name = "user${lastId.getAndDecrement()}"
}