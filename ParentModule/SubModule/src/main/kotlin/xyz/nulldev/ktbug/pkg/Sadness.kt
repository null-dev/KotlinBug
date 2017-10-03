package xyz.nulldev.ktbug.pkg

class Sadness

operator fun Sadness.get(key: String) = println("This doesn't work???")