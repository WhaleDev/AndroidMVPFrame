package pers.jiangyu.mvp.login

import android.widget.Toast
import pers.jiangyu.mvp.base.BaseModel


/**
 * Created by whale on 2019-11-09 13:44
 */
class LoginModel(presenter: LoginContract.Presenter) : BaseModel<LoginContract.Presenter>(presenter),LoginContract.Model {
    override fun doLogin(name: String,password :String) {
        presenter?.loginSuc(name)
    }
}