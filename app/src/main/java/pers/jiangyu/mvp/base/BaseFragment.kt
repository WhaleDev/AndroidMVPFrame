package pers.jiangyu.mvp.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pers.jiangyu.mvp.base.impl.BaseViewImpl

/**
 * Created by whale on 2019-11-08 16:45
 */
abstract class BaseFragment<P : BaseViewImpl> : Fragment() {

    protected var rootView:View? = null
    abstract val layoutId : Int

    protected var presenter :P ? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView  = inflater.inflate(layoutId,null,false)
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView(savedInstanceState)
        presenter = setMyPresenter()

    }

    abstract fun setMyPresenter() :P?

    abstract fun initView(savedInstanceState: Bundle?)

    override fun onDestroy() {
        super.onDestroy()
        rootView =null
    }
}