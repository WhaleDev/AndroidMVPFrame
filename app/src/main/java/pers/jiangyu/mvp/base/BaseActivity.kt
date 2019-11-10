package pers.jiangyu.mvp.base

import android.os.Bundle
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity

import pers.jiangyu.mvp.base.impl.BasePresenterImpl

/**
 * Created by whale on 2019-11-08 12:23
 */
abstract class BaseActivity<P : BasePresenterImpl> : AppCompatActivity() {

    @Nullable
    protected val TAG = javaClass.name

    protected var presenter :P ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        initView(savedInstanceState)
        presenter = setMyPresenter()
    }

    abstract fun setMyPresenter() :P?

    /**
     * 设置layout布局
     */
    abstract val layoutId : Int

    /**
     * 页面初始化
     */
    abstract fun initView(savedInstanceState: Bundle?)

    override fun onDestroy() {
        super.onDestroy()
    }
}