package pers.jiangyu.mvp.login

import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import pers.jiangyu.mvp.R
import pers.jiangyu.mvp.base.BaseActivity
/**
 * Created by whale on 2019-11-09 13:41
 */
class LoginActivity : BaseActivity<LoginContract.Presenter>(),LoginContract.View {

    override fun setMyPresenter(): LoginContract.Presenter? {
        return LoginPresenter(this)
    }

    override val layoutId = R.layout.activity_login

    override fun initView(savedInstanceState: Bundle?) {
        btnLogin.setOnClickListener { doLogin(etName.text.toString(),etPassword.text.toString()) }
    }

    override fun doLogin(name: String,password :String) {
        presenter?.doLogin(name,password)
    }

    override fun loginSuc(msg:String) {
        Toast.makeText(this,msg+"suc",Toast.LENGTH_SHORT).show();
    }

    override fun loginFail(msg:String) {
        Toast.makeText(this,msg+"fail",Toast.LENGTH_SHORT).show();
    }
}