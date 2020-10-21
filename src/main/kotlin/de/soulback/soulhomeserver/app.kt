package de.soulback.soulhomeserver

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun Application.main() {
    routing {
        get("/") {
            call.respond(HttpStatusCode.OK, "Test message\n")
        }
    }
}