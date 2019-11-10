package pers.jiangyu.mvp.login

import pers.jiangyu.mvp.base.BasePresenter

/**
 * Created by whale on 2019-11-09 13:43
 */
class LoginPresenter(view: LoginContract.View) : BasePresenter<LoginContract.View, LoginContract.Model>(view),LoginContract.Presenter {

    override fun doLogin(name:String,password :String) {
        model = LoginModel(this)
        model?.doLogin(name ,password)
    }

    override fun loginSuc(msg:String) {
        view?.loginSuc(msg)
    }

    override fun loginFail(msg:String) {
        view?.loginFail(msg)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}