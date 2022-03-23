package de.swm.ticketing.rest

import de.swm.ticketing.rest.transport.TicketsTO
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("ticketing")
class TicketingController {

    @Operation(
        summary = "Create Tickets"
    )
    @PostMapping("/tickets")
    fun createTickets(@RequestBody tickets: TicketsTO): String {
        return "SUCCESS"
    }

}
