package ir.vahidmohammadisan.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform