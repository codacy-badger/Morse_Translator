package com.eco4ndly.morse_translater.base

/**
 * A Sayan Porya code on 28/04/20
 */
interface BasePresenter<T: BaseView> {
    fun subscribeView(view: T)

    fun unSubscribeView()
}