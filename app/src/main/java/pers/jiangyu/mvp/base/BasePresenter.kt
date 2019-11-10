package pers.jiangyu.mvp.base

import pers.jiangyu.mvp.base.impl.BaseModelImpl
import pers.jiangyu.mvp.base.impl.BaseViewImpl

/**
 * Created by whale on 2019-11-08 17:57
 */
open class BasePresenter<V : BaseViewImpl, M : BaseModelImpl>(protected var view: V?) {

    protected var model: M? = null

    open fun onDestroy() {
        view = null
    }


}