package pers.jiangyu.mvp.login

import pers.jiangyu.mvp.base.impl.BaseModelImpl
import pers.jiangyu.mvp.base.impl.BasePresenterImpl
import pers.jiangyu.mvp.base.impl.BaseViewImpl

/**
 * Created by whale on 2019-11-09 13:33
 */
interface LoginContract {

    interface View : BaseViewImpl {

        fun doLogin(name: String,password :String)

        fun loginSuc(msg:String);

        fun loginFail(msg:String);
    }

    interface Presenter : BasePresenterImpl{

        fun doLogin(name: String,password :String)

        fun loginSuc(msg:String );

        fun loginFail(msg:String );
    }

    interface Model : BaseModelImpl{

        fun doLogin(name: String,password :String)
    }
}
