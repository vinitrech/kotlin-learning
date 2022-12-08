package com.example.oop_objectexpression

fun main() {
    val loginClickListener = LoginClickListener()
    val signupClickListener = SignupClickListener()

    // Passing listeners to button
    val loginButtonWithListeners = Button("Login", 1, loginClickListener)
    val signupButtonWithListeners = Button("Sign up", 2, signupClickListener)

    // Implementing the listener using object expression / anonymous class
    val loginButtonWithObjectExpression = Button("Login", 1, object : OnClickListener {
        override fun onClick() {
            println("Login Button Clicked")
        }
    })
    val signupButtonWithObjectExpression = Button("Sign up", 2, object : OnClickListener {
        override fun onClick() {
            println("Sign up Button Clicked")
        }
    })

    loginButtonWithListeners.onClick()
    signupButtonWithListeners.onClick()
    loginButtonWithObjectExpression.onClick()
    signupButtonWithObjectExpression.onClick()
}

class Button(text: String, val id: Int, val onClickListener: OnClickListener) {
    fun onClick() {
        onClickListener.onClick()
    }
}

interface OnClickListener {
    fun onClick()
}

class LoginClickListener() : OnClickListener {
    override fun onClick() {
        println("Login button clicked")
    }
}

class SignupClickListener() : OnClickListener {
    override fun onClick() {
        println("Signup button clicked")
    }
}