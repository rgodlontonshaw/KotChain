package kotchain

import io.javalin.Javalin

val kotchain = Blockchain

fun main(args: Array<String>) {
    val app = Javalin.start(7000)
    app.get("/blocks") { ctx ->
        ctx.json(Blockchain.chain)
    }
    app.post("/blocks/mine") { ctx ->
        val minedBlock = Blockchain.mineBlock(ctx.body())
        ctx.json(minedBlock)
    }
}
